package com.hibernate.demo.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Certifiate
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private String about;
	private String link;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAbout() {
		return about;
	}
	
	public void setAbout(String about) {
		this.about = about;
	}
	
	public String getLink() {
		return link;
	}
	
	public void setLink(String link) {
		this.link = link;
	}
	
	@Override
	public String toString() {
		return "Certifiate{" +
			"id=" + id +
			", title='" + title + '\'' +
			", about='" + about + '\'' +
			", link='" + link + '\'' +
			'}';
	}
}
