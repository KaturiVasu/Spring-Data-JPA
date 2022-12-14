package com.ex.userapplication.beans;

import org.springframework.stereotype.Component;

@Component
public class User {
	private int id;
	private String name;
	private int marks;

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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

}
