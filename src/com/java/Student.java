package com.java;

public class Student {

	private String name;
	private String subject;
	private Integer marks;
	public Student(String name, String subject, Integer marks) {
		super();
		this.name = name;
		this.subject = subject;
		this.marks = marks;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", subject=" + subject + ", marks=" + marks + "]";
	}
	
	
}
