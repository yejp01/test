package com.yann;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.dom4j.io.SAXReader;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DocumentXml{
	private static Document document;
	private static String fileName;

	public static void init() {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			document = builder.newDocument();
		} catch (ParserConfigurationException e) {
			System.out.println(e.getMessage());
		}
	}	

	public static void createXml(String fileName) {
		Element root = document.createElement("employees");
		document.appendChild(root);
		Element employee = document.createElement("employee");
		Element name = document.createElement("name");
		name.appendChild(document.createTextNode("丁宏亮"));
		employee.appendChild(name);
		Element sex = document.createElement("sex");
		sex.appendChild(document.createTextNode("m"));
		employee.appendChild(sex);
		Element age = document.createElement("age");
		age.appendChild(document.createTextNode("30"));
		employee.appendChild(age);
		root.appendChild(employee);
		TransformerFactory tf = TransformerFactory.newInstance();
		try {
			Transformer transformer = tf.newTransformer();
			DOMSource source = new DOMSource(document);
			transformer.setOutputProperty(OutputKeys.ENCODING, "gb2312");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			PrintWriter pw = new PrintWriter(new FileOutputStream(fileName));
			StreamResult result = new StreamResult(pw);
			transformer.transform(source, result);
			System.out.println("生成XML文件成功!");
		} catch (TransformerConfigurationException e) {
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (TransformerException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void parserXml(String fileName) {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document document = db.parse(fileName);
			NodeList employees = document.getChildNodes();
			for (int i = 0; i < employees.getLength(); i++) {
				Node employee = employees.item(i);
				NodeList employeeInfo = employee.getChildNodes();
				for (int j = 0; j < employeeInfo.getLength(); j++) {
					Node node = employeeInfo.item(j);
					NodeList employeeMeta = node.getChildNodes();
					for (int k = 0; k < employeeMeta.getLength(); k++) {
						System.out.println(employeeMeta.item(k).getNodeName() + ":" + employeeMeta.item(k).getTextContent());
					}
				}
			}
			System.out.println("解析完毕");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (ParserConfigurationException e) {
			System.out.println(e.getMessage());
		} catch (SAXException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
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
	
	public static void main(String[] args) {
		String xml = getXml();
//		parserXml("c:\\students.xml");
		
		init();
		createXml("d:\\students1.xml");
	}
}
