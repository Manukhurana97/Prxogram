package com.example.demo.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity

public class UploadMedia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int uid;
	private String title;
	private String description;
	private String tags;
	private String url;
	private String date;
	private String username;
	private int likes;
	  
     
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public UploadMedia(int id, int uid, String title, String description, String tags, String url) {
		super();
		this.id = id;
		this.uid = uid;
		this.title = title;
		this.description = description;
		this.tags = tags;
		this.url = url;
		
	}

	public UploadMedia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UploadMedia(int uid, String title, String description, String tags, String url,String date,String username, int line) {
		super();
		this.uid = uid;
		this.title = title;
		this.description = description;
		this.tags = tags;
		this.url = url;
		this.username = username;
		this.setDate(date);
		this.likes=likes;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}



	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public int getLike() {
		return date;
	}

	public void setlike(int Like) {
		this.date = date;
	}
	
	
	
}
