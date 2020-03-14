package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity

public class Follow {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int myid;
	private int userid;
	
	
	
	public Follow() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Follow(int id, int myid, int userid) {
		super();
		this.id = id;
		this.myid = myid;
		this.userid = userid;
	}

	public Follow(int myid, int userid) {
		super();
		this.myid = myid;
		this.userid = userid;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMyid() {
		return myid;
	}
	public void setMyid(int myid) {
		this.myid = myid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}	
	
	
}
