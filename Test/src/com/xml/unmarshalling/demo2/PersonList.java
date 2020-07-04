package com.xml.unmarshalling.demo2;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "persons")
public class PersonList {
    @XmlElement(name = "person")
    private List<Person> personList = new ArrayList<Person>();

    public List<Person> getPersons() {
	return personList;
    }

    public void setPersons(List<Person> persons) {
	this.personList = persons;
    }
}

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "name" })
class Person {
    private String id;
    private String name;

    public String getId() {
	return id;
    }

    public void setId(String id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String value) {
	this.name = value;
    }
}