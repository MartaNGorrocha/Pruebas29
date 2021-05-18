package com.marta.LectorNoticias.model;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Calendar;

public class New {

	private int id;
	private String title;
	private String link;
	private String description;
	private Date publicationDate;
	
	
	public New() {
		// TODO Auto-generated constructor stub
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

//	public String getGuid() {
//		return guid;
//	}
//
//	public void setGuid(String guid) {
//		this.guid = guid;
//	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date date) {
		this.publicationDate = date;
	}

	@Override
	public String toString() {
		return "New [id=" + id + ", title=" + title + ", link=" + link + ", description=" + description
				+ ", publicationDate=" + publicationDate + "]";
	}

	
	

	

	

}
