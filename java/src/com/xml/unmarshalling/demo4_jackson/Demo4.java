package com.xml.unmarshalling.demo4_jackson;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Demo4 {
    public static void main(String args[]) throws Exception {
	try {
	    XmlMapper xmlMapper = new XmlMapper();
	    Person pojo = xmlMapper.readValue(getXmlString(), Person.class);
	    System.out.println(pojo);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    private static String getXmlString() {
	return "<person> <firstName>Adithya</firstName>" + "<lastName>Jai</lastName>" + "<address>Bangalore</address>" + "</person>";
    }
}

// Person class (POJO)
class Person {
    private String firstname;
    private String lastName;
    private String address;

    public String getFirstName() {
	return firstname;
    }

    public void setFirstName(String firstName) {
	this.firstname = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public String getAddress() {
	return address;
    }

    public void setAddress(String address) {
	this.address = address;
    }

    public String toString() {
	return "Person[ " + "firstName = " + firstname + ", lastName = " + lastName + ", address = " + address + " ]";
    }
}