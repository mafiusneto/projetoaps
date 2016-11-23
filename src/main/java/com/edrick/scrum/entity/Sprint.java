package com.edrick.scrum.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.edrick.scrum.enumeration.EnumSprintStatus;

@Entity
public class Sprint {
	@Id @GeneratedValue
	private long id;
	private String name;
	private String status;
	private String startedIn;
	private String finishedIn;
	private List<Task> tasks;
	
	public  Sprint(){}
	public  Sprint(String name, long projectId){
		this.name = name;
		this.status = EnumSprintStatus.OPENED.toString();
		this.startedIn = new Timestamp(System.currentTimeMillis()).toString();
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public List<Task> getTasks() {
		return tasks;
	}
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	
	
}
