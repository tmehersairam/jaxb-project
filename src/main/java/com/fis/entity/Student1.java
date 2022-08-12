package com.fis.entity;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student1 {
	private int id;

	private String name;
	private long phoneNo;

	private String city;

	public Student1() {
	}

	public Student1(int id, String name, long phoneNo, String city) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
		this.city = city;
	}

	public Student1(String name, long phoneNo, String city) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.city = city;
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

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student - [ id = " + id + ", name = " + name + ", phoneNo = " + phoneNo + ", city = " + city + " ]";
	}

}
