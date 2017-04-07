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

public class Test {
	private static void getWayBillTrackInfoTest() {
		// //������������õ�����WebService�ӿ�ר�ã������ͻ��벻Ҫ������øô��롣��
		// // ����õ���ClassLoaderΪWeb�Ļ����ᱨ���������Ҫ����Է���������󣬺�̨�������Ĵ��󣩣�
		// // ����������轫ClassLoader����ΪEas����
		// Thread.currentThread().getContextClassLoader();
		// Thread.currentThread().setContextClassLoader(Service.class.getClassLoader());

		// �ӿڴ������
		String requestXml = "<?xml version='1.0' encoding='UTF-8'?><WayBillTracks><portNo>JMYP</portNo>"
				+ "<wayBillNo>1410892181</wayBillNo><customerTranNo></customerTranNo><customerOrderNo></customerOrderNo></WayBillTracks>";
		// Wsdl��ַ
		String endpoint = "http://120.196.127.229:6888/ormrpc/services/WSWSBizInterfaceFacade?wsdl";
		try {
			// ����һ������(service)����(call)
			Service service = new Service();
			Call call;
			call = (Call) service.createCall();
			// ����service����URL
			call.setTargetEndpointAddress(new java.net.URL(endpoint));
			// �������ýӿڵķ�����"urn:client.wsbizinterfacefacade"
			// ΪWSDL�ļ���targetNamespace��ֵ�������ò����ᱨ��
			call.setOperationName(new QName("urn:client.wsbizinterfacefacade",
					"getWayBillTrackInfo"));
			// paramΪ�ӿڲ�������
			call.addParameter(new QName("urn:client.wsbizinterfacefacade",
					"param"), org.apache.axis.encoding.XMLType.XSD_STRING,
					javax.xml.rpc.ParameterMode.IN);

			// ���÷������ز��������ͣ��÷���ΪString���͵�xmlƴ�Ӳ���
			call.setReturnType(org.apache.axis.encoding.XMLType.SOAP_STRING);
			// ���÷���
			String responseXml = (String) call
					.invoke(new Object[] { requestXml });
			if (responseXml.contains("<is_success>T</is_success>")) {
				System.out.println("��ϲ�㣬���óɹ���responseXml :" + responseXml);
			} else {
				System.out.println("ͨ�Ŵ���������,����ϵ�ӿ��ṩ�̣�responseXml :"
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
		// �ӿڵ�½��������������밴�սӿڷ���˳����д��ݣ�
		// ��ʽ�����������Կ⣨��ʽ�⣬��ͨ��
		// String userName = "�ⲿ�ͻ�";
		// String password = "123456";
		// String slnName = "eas";
		// String dcName = "H001";
		// String language = "L2";
		// int dbType = 1;
		// ���Է����������Կ⣨186������ͨ��
		// String userName = "�ⲿ�ͻ�";
		// String password = "123456";
		// String slnName = "eas";
		// String dcName = "orcl";
		// String language = "L2";
		// int dbType = 1;
		// ���Է���������ʽ�⣨186������ͨ��
		// String userName = "�ⲿ�ͻ�";
		// String password = "123456";
		// String slnName = "eas";
		// String dcName = "zsk";
		// String language = "L2";
		// int dbType = 1;
		// ���ؿ�����������ʽ�⣨��ͨ��
		// String userName = "�ⲿ�ͻ�";
		// String password = "123456";
		// String slnName = "eas";
		// String dcName = "zsk";
		// String language = "L2";
		// int dbType = 1;
		// ���ؿ������������Կ⣨δͨ��
		String userName = "�ⲿ�ͻ�";
		String password = "123456";
		String slnName = "eas";
		String dcName = "CSK_198";
		String language = "L2";
		int dbType = 1;
		// 186������������ʽ�⣨δͨ��
		// String userName = "�ⲿ�ͻ�";
		// String password = "123456";
		// String slnName = "eas";
		// String dcName = "zsk";
		// String language = "L2";
		// int dbType = 1;
		// 186�������������Կ⣨δͨ��
		// String userName = "΢�Ź���Ա";
		// String password = "123456";
		// String slnName = "eas";
		// String dcName = "orcl";
		// String language = "L2";
		// int dbType = 1;

		// ��ʽ������
		// String endpoint =
		// "http://211.154.155.245:6896/ormrpc/services/EASLogin?wsdl";
		// 186���Է�����
		// String endpoint =
		// "http://120.196.127.229:6888/ormrpc/services/EASLogin?wsdl";
		// ���ط�����
		String endpoint = "http://192.168.3.142:56898/ormrpc/services/EASLogin?wsdl";
		// 186��������
		// String endpoint =
		// "http://192.168.8.186:56898/ormrpc/services/EASLogin?wsdl";
		try {
			// ����һ������(service)����(call)
			Service service = new Service();
			Call call;
			call = (Call) service.createCall();
			// ����service����URL
			call.setTargetEndpointAddress(new java.net.URL(endpoint));

			// �������ýӿڵķ�����"urn:client" ΪWSDL�ļ���targetNamespace��ֵ�������ò����ᱨ��
			call.setOperationName(new QName("urn:client", "Login"));
			// ��½����Ϊ6��String�����������δ������ֵ
			// "urn:client" ͬ�ϣ�"userName"Ϊ��½������������֮һ����ر�֤��ӿڷ�������һ�£�����ͬ��
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

			// WSContext�������ص㣬����ʱ��Ҫ�������ã�WSContextΪ���صĶ���
			// (axis�ṩ�Ľ���Ϊ�򵥵ķ������ͣ���ʵ���һ��Ľӿ�XML������ͨ��һ��String����ƴ�ӵ�Xml������Ϊ���롢����������������㹻���ˣ�������Զ��巵�ز�������Ҫ����ӳ�䷵������)
			call.setReturnType(new QName("urn:client", "response"),
					WSContext.class);
			// ע��ӳ���ϵ
			QName wsContext = new QName("urn:client", "WSContext");// �˴���WSContextΪWSDL�ļ���complexType��name������ֵ
			// WSContext Ϊ�ӿڷ�װ�ķ��ز���������ͨ��Wsdl�ļ�����Java���ļ�
			// ����ע��ӳ���ϵ�����Զ������������л��뷴���л���
			call.registerTypeMapping(WSContext.class, wsContext,
					new BeanSerializerFactory(WSContext.class, wsContext),
					new BeanDeserializerFactory(WSContext.class, wsContext));// WSContext.classͬ�ϣ�

			// �����ʼ�������в��������ڵ��÷�����ע������뷽��˳�򱣳�һ��
			WSContext context = (WSContext) call.invoke(new Object[] {
					userName, password, slnName, dcName, language, dbType });// �ӿڽ��յĲ���

			// ��½�����ɹ����SessionId�Ƿ����ֵ
			if (context != null) {
				if (context.getSessionId() != null) {
					System.out.println("��ϲ�㣬��½�ӿ���ͨ����SessionId="
							+ context.getSessionId());// ��ӡ�������
				} else {
					System.out.println("ʧ�ܣ�����ϵ�ӿ��ṩ�̣���SessionId="
							+ context.getSessionId());// ��ӡ�������
				}
			} else {
				System.out.println("ʧ�ܣ�����ϵ�ӿ��ṩ�̣���SessionId="
						+ context.getSessionId());// ��ӡ�������
			}

		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	private static void getRealtimeQuotes() {
		// �ӿڴ������
		String requestXml = "<?xml version='1.0' encoding='UTF-8'?><Request><portNo>FSK</portNo>"
				+ "<actualWeight>1685</actualWeight><volume>31.23</volume><oldNumber>23</oldNumber><serviceType>5</serviceType>"
				+ "<isInsurance>1</isInsurance><insuranceAmount>100000</insuranceAmount><customerTransportTypeInfo>��·���</customerTransportTypeInfo>"
				+ "<deliveryProvince>������</deliveryProvince><deliveryCity>������</deliveryCity><receiverProvince>�����</receiverProvince>"
				+ "<receiverCity>�����</receiverCity><receiverArea>������</receiverArea></Request>";
		// Wsdl��ַ
		// String endpoint =
		// "http://120.196.127.229:6888/ormrpc/services/WSWSBizInterfaceFacade?wsdl";
		String endpoint = "http://192.168.3.142:56898/ormrpc/services/WSWSBizInterfaceFacade?wsdl";
		try {
			// ����һ������(service)����(call)
			Service service = new Service();
			Call call;
			call = (Call) service.createCall();
			// ����service����URL
			call.setTargetEndpointAddress(new java.net.URL(endpoint));
			// �������ýӿڵķ�����"urn:client.wsbizinterfacefacade"
			// ΪWSDL�ļ���targetNamespace��ֵ�������ò����ᱨ��
			call.setOperationName(new QName("urn:client.wsbizinterfacefacade",
					"getRealtimeQuotes"));
			// paramΪ�ӿڲ�������
			call.addParameter(new QName("urn:client.wsbizinterfacefacade",
					"param"), org.apache.axis.encoding.XMLType.XSD_STRING,
					javax.xml.rpc.ParameterMode.IN);

			// ���÷������ز��������ͣ��÷���ΪString���͵�xmlƴ�Ӳ���
			call.setReturnType(org.apache.axis.encoding.XMLType.SOAP_STRING);
			// ���÷���
			String responseXml = (String) call
					.invoke(new Object[] { requestXml });
			if (responseXml.contains("<is_success>T</is_success>")) {
				System.out.println("��ϲ�㣬���óɹ���responseXml :" + responseXml);
			} else {
				System.out.println("ͨ�Ŵ���������,����ϵ�ӿ��ṩ�̣�responseXml :"
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

	public static void main(String[] args) {
		loginTest();
		// getWayBillTrackInfoTest();
		getRealtimeQuotes();
	}
}