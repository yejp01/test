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
		// ����һ������(service)����(call)
		Service service = new Service();
		// ͨ��service����call����
		Call call;
		try {
			call = (Call) service.createCall();
			// ����service����URL
			call.setTargetEndpointAddress(new java.net.URL(endpoint));

			call.setOperationName(new QName("http://tempuri.org/",
					"DaHuaDataExchange"));
			// Add ��net �Ǳߵķ��� "http://tempuri.org/" ���ҲҪע��Namespace �ĵ�ַ,����Ҳ�ᱨ��
			call.addParameter(new QName("http://tempuri.org/", "XmlInfo"),
					org.apache.axis.encoding.XMLType.XSD_STRING,
					javax.xml.rpc.ParameterMode.IN);
			// ������Ҹ���һ���ԭ������,"test" ������Ǵ������ı���,Ҳ����NET����Ĳ���,һ����Ҫ������
			// �ҵ�����֪�� ,��Ϊ����������Լ����д��,������Ǳ�NULL,������������

			call.setUseSOAPAction(true);
			call.setReturnType(org.apache.axis.encoding.XMLType.SOAP_STRING);
			// ���ز���������
			call.setSOAPActionURI("http://tempuri.org/DaHuaDataExchange");
			// ���ҲҪע��
			// ����Ҫ����Ҫ���õķ���Add,��ȻҲ�ᱨ��

			// Object �����װ�˲���������Ϊ"This is Test!",����processService(String arg)
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
