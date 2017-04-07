package com.yann;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.ser.BeanDeserializerFactory;
import org.apache.axis.encoding.ser.BeanSerializerFactory;

import client.WSContext;

public class HaidLoginTest {
	private static void getWayBillTrackInfoTest() {
		// //金蝶服务器调用第三方WebService接口专用，其他客户请不要随意调用该代码。。
		// // 如果得到的ClassLoader为Web的话，会报引擎错误（主要是针对服务器部署后，后台事务发生的错误），
		// // 解决该问题需将ClassLoader设置为Eas。。
		// Thread.currentThread().getContextClassLoader();
		// Thread.currentThread().setContextClassLoader(Service.class.getClassLoader());

		// 接口传入参数
		String requestXml = "<?xml version='1.0' encoding='UTF-8'?><WayBillTracks><portNo>JMYP</portNo>"
				+ "<wayBillNo>1410892181</wayBillNo><customerTranNo></customerTranNo><customerOrderNo></customerOrderNo></WayBillTracks>";
		// Wsdl地址
		String endpoint = "http://120.196.127.229:6888/ormrpc/services/WSWSBizInterfaceFacade?wsdl";
		try {
			// 创建一个服务(service)调用(call)
			Service service = new Service();
			Call call;
			call = (Call) service.createCall();
			// 设置service所在URL
			call.setTargetEndpointAddress(new java.net.URL(endpoint));
			// 申明调用接口的方法，"urn:client.wsbizinterfacefacade"
			// 为WSDL文件的targetNamespace的值，不传该参数会报错
			call.setOperationName(new QName("urn:client.wsbizinterfacefacade",
					"getWayBillTrackInfo"));
			// param为接口参数名称
			call.addParameter(new QName("urn:client.wsbizinterfacefacade",
					"param"), org.apache.axis.encoding.XMLType.XSD_STRING,
					javax.xml.rpc.ParameterMode.IN);

			// 设置方法返回参数的类型，该方法为String类型的xml拼接参数
			call.setReturnType(org.apache.axis.encoding.XMLType.SOAP_STRING);
			// 调用方法
			String responseXml = (String) call
					.invoke(new Object[] { requestXml });
			if (responseXml.contains("<is_success>T</is_success>")) {
				System.out.println("恭喜你，调用成功！responseXml :" + responseXml);
			} else {
				System.out.println("通信错误，请重试,或联系接口提供商！responseXml :"
						+ responseXml);
			}
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	private static void loginTest() {
		// 正式服务器
		String endpoint = "http://10.168.5.250:6888/ormrpc/services/EASLogin?wsdl";
		String userName = "资金平台";
		String password = "abc123456";
		String slnName = "eas";
		String dcName = "001";
		String language = "L2";
		int dbType = 1;
		
//		// 测试服务器
//		String endpoint = "http://192.168.3.142:56898/ormrpc/services/EASLogin?wsdl";
//		String userName = "外部客户";
//		String password = "123456";
//		String slnName = "eas";
//		String dcName = "002";
//		String language = "L2";
//		int dbType = 1;
		
		try {
			// 创建一个服务(service)调用(call)
			Service service = new Service();
			Call call;
			call = (Call) service.createCall();
			// 设置service所在URL
			call.setTargetEndpointAddress(new java.net.URL(endpoint));

			// 申明调用接口的方法，"urn:client" 为WSDL文件的targetNamespace的值，不传该参数会报错
			call.setOperationName(new QName("urn:client", "Login"));
			// 登陆方法为6个String参数，请依次传入参数值
			// "urn:client" 同上，"userName"为登陆方法参数名称之一，务必保证与接口方法参数一致，以下同理
			call.addParameter(new QName("urn:client", "userName"),
					org.apache.axis.encoding.XMLType.XSD_STRING,
					javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("urn:client", "password"),
					org.apache.axis.encoding.XMLType.XSD_STRING,
					javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("urn:client", "slnName"),
					org.apache.axis.encoding.XMLType.XSD_STRING,
					javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("urn:client", "dcName"),
					org.apache.axis.encoding.XMLType.XSD_STRING,
					javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("urn:client", "language"),
					org.apache.axis.encoding.XMLType.XSD_STRING,
					javax.xml.rpc.ParameterMode.IN);
			call.addParameter(new QName("urn:client", "dbType"),
					org.apache.axis.encoding.XMLType.XSD_INT,
					javax.xml.rpc.ParameterMode.IN);

			// WSContext这里是重点，返回时主要在这配置，WSContext为返回的对象
			// (axis提供的仅仅为简单的返回类型，其实针对一般的接口XML，都是通过一个String类型拼接的Xml参数作为输入、输出参数，这样就足够用了，但针对自定义返回参数，需要重新映射返回类型)
			call.setReturnType(new QName("urn:client", "response"),
					WSContext.class);
			// 注册映射关系
			QName wsContext = new QName("urn:client", "WSContext");// 此处的WSContext为WSDL文件中complexType的name的属性值
			// WSContext 为接口封装的返回参数对象，需通过Wsdl文件生成Java类文件
			// 这里注册映射关系，对自定义的类进行序列化与反序列化。
			call.registerTypeMapping(WSContext.class, wsContext,
					new BeanSerializerFactory(WSContext.class, wsContext),
					new BeanDeserializerFactory(WSContext.class, wsContext));// WSContext.class同上，

			// 上面初始化了所有参数，现在调用方法，注意参数与方法顺序保持一致
			WSContext context = (WSContext) call.invoke(new Object[] {
					userName, password, slnName, dcName, language, dbType });// 接口接收的参数

			// 登陆方法成功与否，SessionId是否存在值
			if (context != null) {
				if (context.getSessionId() != null) {
					System.out.println("恭喜你，登陆接口联通！，SessionId="
							+ context.getSessionId());// 打印输出对象
				} else {
					System.out.println("失败，请联系接口提供商！，SessionId="
							+ context.getSessionId());// 打印输出对象
				}
			} else {
				System.out.println("失败，请联系接口提供商！，SessionId="
						+ context.getSessionId());// 打印输出对象
			}

		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}



	public static void main(String[] args) {
		loginTest();
	}
}
