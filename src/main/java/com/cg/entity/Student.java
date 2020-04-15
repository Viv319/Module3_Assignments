package com.cg.entity;

public class Student {
	private int id;
	private String sname;
	private String branch;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Student(int id, String sname, String branch) {
		super();
		this.id = id;
		this.sname = sname;
		this.branch = branch;
	}
	public Student() {
		super();
	}
	
	
	

}
