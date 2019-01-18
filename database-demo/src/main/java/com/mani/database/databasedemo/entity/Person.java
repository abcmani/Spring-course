package com.mani.database.databasedemo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="find_all_persons", query="select p from Person p")
public class Person {
	
	@Id //primary key
	@GeneratedValue //automatically generates a value
	private int id;
	
	private String name;
	private String location;
	private Date dob;
	
	public Person()
	{
		
	}
	@Override
	public String toString() {
		return "\n Person [id=" + id + ", name=" + name + ", location=" + location + ", dob=" + dob + "]";
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Person(int id, String name, String location, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.dob = dob;
	}
	
	public Person(String name, String location, Date dob) {
		super();
		this.name = name;
		this.location = location;
		this.dob = dob;
	}

}
