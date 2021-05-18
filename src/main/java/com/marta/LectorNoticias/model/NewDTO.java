package com.marta.LectorNoticias.model;

import java.io.Serializable;
import java.util.Date;

public class NewDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String title;
	private String link;
	private String description;
	private Date publicationDate;

	public NewDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public NewDTO(int id, String title, String link, String description, Date publicationDate) {
		super();
		this.id = id;
		this.title = title;
		this.link = link;
		this.description = description;
		this.publicationDate = publicationDate;
	}
	
	
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
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}
	

}
