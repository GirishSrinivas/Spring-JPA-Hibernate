package com.girish.entity;

import java.io.Serializable;
import javax.persistence.Entity;

@Entity(name = "users")
public class User implements Serializable
{
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	private int userid;
	private String name;
	private int age;
	private String phone;
	private String email;
	private String works;
	private String designation;
	
	public int getUserid() {
		return userid;
	}
	
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getWorks() {
		return works;
	}
	
	public void setWorks(String works) {
		this.works = works;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
