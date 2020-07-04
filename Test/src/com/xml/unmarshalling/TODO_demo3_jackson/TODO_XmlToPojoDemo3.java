package com.xml.unmarshalling.TODO_demo3_jackson;

import java.io.BufferedReader;
import java.io.FileReader;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class TODO_XmlToPojoDemo3 {

    public static void main(String[] ar) {
	String xmlStr = readFile("src/com/xml/unmarshalling/demo3_jackson/data.xml");
	try {
	    POJO_XML_Data pojo_XML_Data = new XmlMapper().readValue(xmlStr, POJO_XML_Data.class);
	    System.out.println(pojo_XML_Data.getPersons().size());
	    pojo_XML_Data.getPersons().forEach(p -> System.out.println(p.toString()));
	} catch (JsonProcessingException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

    public static String readFile(String path) {
	try {
	    BufferedReader br = new BufferedReader(new FileReader(path));
	    StringBuilder sb = new StringBuilder();
	    String line = br.readLine();
	    while (line != null) {
		sb.append(line);
		sb.append(System.lineSeparator());
		line = br.readLine();
	    }
	    return sb.toString();
	} catch (Exception e) {
	    e.printStackTrace();
	    return null;
	}
    }

}
