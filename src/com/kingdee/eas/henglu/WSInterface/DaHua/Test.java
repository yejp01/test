package com.kingdee.eas.henglu.WSInterface.DaHua;

import java.rmi.RemoteException;
import java.util.List;

import javax.xml.rpc.ServiceException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class Test {
	public static void main(String[] args) {
		DaHua_Logistics_DataExchangeLocator DaHualocator = new DaHua_Logistics_DataExchangeLocator();
		DaHua_Logistics_DataExchangeSoap DaHuaSoap;
		try {
			DaHuaSoap = DaHualocator.getDaHua_Logistics_DataExchangeSoap();
			String requestXml = "<?xml version='1.0' encoding='UTF-8'?><Request service='OrderRequestByDate' lang='zh-CN'><Head>szhenglu,*Ab12345</Head><Body><Order orderdate='2014-10-22'></Order></Body></Request>";
			String responseXml = DaHuaSoap.daHuaDataExchange(requestXml);
			
			parseXml(responseXml);
			System.out.println(responseXml);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public static void parseXml(String xml){
		Document dom;
		try {
			dom = DocumentHelper.parseText(xml);
			Element root=dom.getRootElement();  
			Element childRoot = root.element("Body");  
			
			Element child = null;
			
			List lstElement = childRoot.elements();
			for(int i = 0;i<lstElement.size();i++){
				child = (Element) lstElement.get(i);
				if("OrderResponse".equals(child.getName())){
					System.out.println("checkno: " + child.attributeValue("checkno"));
					System.out.println("d_checkdate: " + child.attributeValue("d_checkdate"));
					System.out.println("d_transtype: " + child.attributeValue("d_transtype"));
					System.out.println("d_province: " + child.attributeValue("d_province"));
					System.out.println("d_city: " + child.attributeValue("d_city"));
					System.out.println("d_company: " + child.attributeValue("d_company"));
					System.out.println("d_contact: " + child.attributeValue("d_contact"));
					System.out.println("d_mobile: " + child.attributeValue("d_mobile"));
					System.out.println("d_address: " + child.attributeValue("d_address"));
				}
				System.out.println("====================================================");
			}
			
		} catch (DocumentException e) {
			e.printStackTrace();
		} 
		
	}
	
	
	
}
