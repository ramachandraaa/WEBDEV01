package com.in28minutes.springboot.myfirstwebapplication.todo;

import java.time.LocalDate;

import org.springframework.stereotype.Component;
public class Todo {
	/*
	 * id username description targate date done
	 */
	private int id;
	private String username;
	private String discription;
	private boolean done;
	private LocalDate localdate;

	public Todo(int id, String username, String discription, boolean done,LocalDate localdate) {
		super();
		this.id = id;
		this.username = username;
		this.discription = discription;
		this.done = done;
		this.localdate=localdate;
	}

	public LocalDate getLocaldate() {
		return localdate;
	}

	public void setLocaldate(LocalDate localdate) {
		this.localdate = localdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", discription=" + discription + ", done=" + done
				+ ", localdate=" + localdate + "]";
	}

	
}
