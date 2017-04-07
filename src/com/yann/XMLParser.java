package com.yann;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLParser {
	public void getAllUserNames(String fileName) {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			File file = new File(fileName);
			if (file.exists()) {
//				Document doc = db.parse(file);
				Document doc = db.parse(fileName);
				Element docEle = doc.getDocumentElement();
				// Print root element of the document
				System.out.println("Root element of the document: " + docEle.getNodeName());

				NodeList studentList = docEle.getElementsByTagName("student");

				// Print total student elements in document
				System.out.println("Total students: " + studentList.getLength());

				if (studentList != null && studentList.getLength() > 0) {
					for (int i = 0; i < studentList.getLength(); i++) {

						Node node = studentList.item(i);

						if (node.getNodeType() == Node.ELEMENT_NODE) {

							System.out.println("=====================");

							Element e = (Element) node;
							NodeList nodeList = e.getElementsByTagName("name");
							System.out.println("Name: " + nodeList.item(0).getChildNodes().item(0).getNodeValue());

							nodeList = e.getElementsByTagName("grade");
							System.out.println("Grade: " + nodeList.item(0).getChildNodes().item(0).getNodeValue());

							nodeList = e.getElementsByTagName("age");
							System.out.println("Age: " + nodeList.item(0).getChildNodes().item(0).getNodeValue());
						}
					}
				} else {
					System.exit(1);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void parseXml(){
//		String xml =getXml();  
//		SAXReader saxreader = new SAXReader();  
//		Document doc = saxreader.read(xml);  
//		

	}
	
	public static String getXml(){
		StringBuilder sbXml = new StringBuilder("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
		sbXml.append("<students>");
		sbXml.append("<student>");
		sbXml.append("<name>John</name>");
		sbXml.append("<grade>B</grade>");
		sbXml.append("<age>12</age>");
		sbXml.append("</student>");
		sbXml.append("<student>");
		sbXml.append("<name>John</name>");
		sbXml.append("<grade>B</grade>");
		sbXml.append("<age>12</age>");
		sbXml.append("</student>");
		sbXml.append("<student>");
		sbXml.append("<name>John</name>");
		sbXml.append("<grade>B</grade>");
		sbXml.append("<age>12</age>");
		sbXml.append("</student>");
		sbXml.append("</students>");
		return sbXml.toString();
	}

	public static void main(String[] args) {

		XMLParser parser = new XMLParser();
		String xml = getXml();
		parser.getAllUserNames(xml);
//		parser.getAllUserNames("c:\\students.xml");
	}
}
