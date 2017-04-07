package com.yann;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

public class CaClient {

	public static void main(String[] args) {
		String requestXml = "<?xml version='1.0' encoding='UTF-8'?><Request service='OrderRequestByDate' lang='zh-CN'><Head>szhenglu,*Ab12345</Head><Body><Order orderdate='2014-11-3'></Order></Body></Request>";
		String endpoint = "http://60.191.94.115/DH_DataExchangeTest/DaHua_Entry.asmx?WSDL";
		// 创建一个服务(service)调用(call)
		Service service = new Service();
		// 通过service创建call对象
		Call call;
		try {
			call = (Call) service.createCall();
			// 设置service所在URL
			call.setTargetEndpointAddress(new java.net.URL(endpoint));

			call.setOperationName(new QName("http://tempuri.org/",
					"DaHuaDataExchange"));
			// Add 是net 那边的方法 "http://tempuri.org/" 这个也要注意Namespace 的地址,不带也会报错
			call.addParameter(new QName("http://tempuri.org/", "XmlInfo"),
					org.apache.axis.encoding.XMLType.XSD_STRING,
					javax.xml.rpc.ParameterMode.IN);
			// 这就是我搞了一天的原因所在,"test" 这个就是传参数的变量,也就是NET方面的参数,一定不要带错了
			// 我当初不知道 ,以为这个参数是自己随便写的,结果总是报NULL,真是气死人了

			call.setUseSOAPAction(true);
			call.setReturnType(org.apache.axis.encoding.XMLType.SOAP_STRING);
			// 返回参数的类型
			call.setSOAPActionURI("http://tempuri.org/DaHuaDataExchange");
			// 这个也要注意
			// 就是要加上要调用的方法Add,不然也会报错

			// Object 数组封装了参数，参数为"This is Test!",调用processService(String arg)
			String ret = (String) call.invoke(new Object[] { requestXml });
			System.out.println("--------" + ret);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
