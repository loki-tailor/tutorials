package com.xml.unmarshalling.demo1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.SAXException;

public class UnmarshallingDemo1 {

    public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException, JAXBException {
	String xmlStr = readFile("src/com/xml/unmarshalling/demo1/data.xml");
	StreamSource ss = new StreamSource(new StringReader(xmlStr));
	POJO_XML_Data pojo = (POJO_XML_Data) JAXBContext.newInstance(POJO_XML_Data.class).createUnmarshaller().unmarshal(ss);
	System.out.println(pojo.getPersons().size());
	pojo.getPersons().forEach(p -> System.out.println(p.toString()));
    }

    public static String readFile(String filePath) {
	StringBuilder sb = new StringBuilder();
	BufferedReader br = null;
	try {
	    br = new BufferedReader(new FileReader(filePath));
	    String line = br.readLine();
	    while (line != null) {
		sb.append(line);
		sb.append(System.lineSeparator());
		line = br.readLine();
	    }
	    br.close();
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return sb.toString();
    }
}
