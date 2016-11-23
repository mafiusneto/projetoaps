package com.edrick.scrum.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.edrick.scrum.enumeration.EnumTaskStatus;

@Entity
public class Task {
	
	@Id @GeneratedValue
	private long id;
	private String subject;
	private String description;
	private String status;
	private String startedIn;
	private String finishedIn;
	private String dueDate;
	private boolean isActive;
	private User assignedTo;
	
	public Task (){}
	
	public Task (String subject,String description,String dueDate){
		this.subject = subject;
		this.description = description;
		this.status = EnumTaskStatus.TODO.toString();
		this.dueDate = dueDate;
		this.startedIn = new Timestamp(System.currentTimeMillis()).toString();
		this.isActive = true;
	}
	
	public long getId() {
		return id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStartedIn() {
		return startedIn;
	}
	public void setStartedIn(String startedIn) {
		this.startedIn = startedIn;
	}
	public String getFinishedIn() {
		return finishedIn;
	}
	public void setFinishedIn(String finishedIn) {
		this.finishedIn = finishedIn;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public User getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(User assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

}
