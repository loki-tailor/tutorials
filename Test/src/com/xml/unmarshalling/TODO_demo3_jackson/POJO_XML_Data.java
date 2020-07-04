package com.xml.unmarshalling.TODO_demo3_jackson;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlAccessorType(XmlAccessType.FIELD) // optional
@XmlRootElement(name = "persons") // mandatory
public class POJO_XML_Data {

    @XmlElement(name = "person") // mandatory
    public List<Person> personsList = new ArrayList<>();

    public List<Person> getPersons() {
	return personsList;
    }

    public void setPersons(List<Person> persons) {
	this.personsList = persons;
    }
}

@XmlAccessorType(XmlAccessType.FIELD) // optional

@XmlType(name = "", propOrder = { "dob", "uname", "age" })
// optional,
// propOrder can have mismatched sequence but must have all keys
// name is optional
class Person {
    public int age;
    public String uname;
    public String dob;

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

    public String getUname() {
	return uname;
    }

    public void setUname(String uname) {
	this.uname = uname;
    }

    public String getDob() {
	return dob;
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append(uname);
	builder.append(", ");
	builder.append(dob);
	builder.append(", ");
	builder.append(age);
	return builder.toString();
    }

    public void setDob(String dob) {
	this.dob = dob;
    }

}
