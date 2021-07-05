package com.xml.unmarshalling.demo2;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class Main {

    public static void main(String[] args) {

	try {
	    JAXBContext jc = JAXBContext.newInstance(PersonList.class);
	    Unmarshaller unmarshaller = jc.createUnmarshaller();
	    PersonList obj = (PersonList) unmarshaller.unmarshal(new File("src/com/xml/unmarshalling/demo1/data.xml"));
	    System.out.println(obj.getPersons().size());
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

}
