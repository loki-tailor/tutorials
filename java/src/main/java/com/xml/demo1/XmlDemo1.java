package com.xml.demo1;

import java.io.File;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlDemo1 {

    public static void main(String[] args) {
	try {
	    File file = new File("src/com/xml/demo1/data.xml");
	    Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);

	    XPath xPath = XPathFactory.newInstance().newXPath();

	    // get only age of all employees using xpath
	    printValuesFromXpath(doc, xPath.compile("//age/text()"));
	    System.out.println();

	    // get only age of all employees using tag name
	    NodeList ageList = doc.getElementsByTagName("age");
	    for (int i = 0; i < ageList.getLength(); i++) {
		String age = ageList.item(i).getTextContent();

		Node item = ageList.item(i);
		NodeList childNodes = item.getParentNode().getChildNodes();
		for (int j = 0; j < childNodes.getLength(); j++) {
		    System.out.print(childNodes.item(j).getTextContent());
		}

	    }

	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public static void printValuesFromXpath(Document doc, XPathExpression xPathExpr) {
	try {
	    NodeList nl = (NodeList) xPathExpr.evaluate(doc, XPathConstants.NODESET);
	    for (int i = 0; i < nl.getLength(); i++) {
		System.out.println(nl.item(i).getNodeValue());
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}

    }
}
