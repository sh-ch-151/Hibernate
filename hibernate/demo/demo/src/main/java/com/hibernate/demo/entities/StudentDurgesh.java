package com.hibernate.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Student1")
public class StudentDurgesh
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 100, unique = true)
	private String  name;
	@Column(length = 100, unique = true)
	private String college;
	private String phone;
	private String fatherName;
	private boolean active;
	private String about;
	
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
	
	public String getCollege() {
		return college;
	}
	
	public void setCollege(String college) {
		this.college = college;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getFatherName() {
		return fatherName;
	}
	
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	
	public boolean isActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
	
	public String getAbout() {
		return about;
	}
	
	public void setAbout(String about) {
		this.about = about;
	}
	
	@Override
	public String toString() {
		return "Student1{" +
			"id=" + id +
			", name='" + name + '\'' +
			", college='" + college + '\'' +
			", phone='" + phone + '\'' +
			", fatherName='" + fatherName + '\'' +
			", active=" + active +
			", about='" + about + '\'' +
			'}';
	}
}
