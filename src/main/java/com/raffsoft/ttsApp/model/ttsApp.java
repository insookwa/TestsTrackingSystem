package com.raffsoft.ttsApp.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teststable")
public class ttsApp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id; 
	
	@Column(name = "PROJECT")
	String project_name;
	
	@Column(name="STATUS")
	String status;
	
	@Column(name ="TIMEMARK")
	String timeMark;
	
	@Column(name ="COMMENT")
	String comment;

	@Column(name="TIME")
	Timestamp atime;
	
	
	public ttsApp() {

	}
	
	
	public ttsApp(int id,String project_name, String status,String timeMark,  String comment,Timestamp atime) {
	
		this.project_name = project_name;
		this.status = status;
		this.timeMark =timeMark;
		this.comment = comment;
		
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Timestamp getAtime() {
		return atime;
	}
	public void setAtime(Timestamp atime) {
		this.atime = atime;
	}
	public String getTimeMark() {
		return timeMark;
	}

	public void setTimeMark(String timeMark) {
		this.timeMark = timeMark;
	}
	
	
	
	

}
