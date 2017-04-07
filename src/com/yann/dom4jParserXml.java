package com.yann;


import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class dom4jParserXml {
	public static String getXml(){
		StringBuilder sbXml = new StringBuilder("<?xml version= '1.0' encoding='gb2312'?>");
		sbXml.append("<students>");
		sbXml.append("<student>");
		
		sbXml.append("<name>");
		sbXml.append("Joho");
		sbXml.append("</name>");
		sbXml.append("<grade>");
		sbXml.append("B");
		sbXml.append("</grade>");
		sbXml.append("<age>");
		sbXml.append(12);
		sbXml.append("</age>");
		
		sbXml.append("<name>");
		sbXml.append("Joho1");
		sbXml.append("</name>");
		sbXml.append("<grade>");
		sbXml.append("B1");
		sbXml.append("</grade>");
		sbXml.append("<age>");
		sbXml.append(121);
		sbXml.append("</age>");
		
		sbXml.append("</student>");
		sbXml.append("</students>");
		return sbXml.toString();
	}
	
	public static void createXml(){
		
	}
	
	public static void parseXml(){
		String xml = getXml();
		
		Document dom;
		try {
			dom = DocumentHelper.parseText(xml);
			Element root=dom.getRootElement();  
			Element childRoot = root.element("student");  
			
//			Element child = childRoot.element("name");  
//			
//			child.getText();
			
			Element child = null;
			
			List lstElement = childRoot.elements();
			for(int i = 0;i<lstElement.size();i++){
				child = (Element) lstElement.get(i);
				if("name".equals(child.getName())){
					System.out.println("name: "+child.getText());  
				}
				if("grade".equals(child.getName())){
					System.out.println("grade: "+child.getText());  
				}
				if("age".equals(child.getName())){
					System.out.println("age: "+child.getText());  
				}
//				String name=childRoot.element("name").getText();  
//				String grade=childRoot.element("grade").getText();  
//				String age=childRoot.element("age").getText();  
//				System.out.println(name);  
//				System.out.println(grade);  
//				System.out.println(child.getText());
			}
			
		} catch (DocumentException e) {
			e.printStackTrace();
		} 
		
	}
	
	public static void main(String[] args) {
		parseXml();
	}

}
