package com.cpg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//transient--- persistance--detached---(object states)
//is any class is entity then it will auto persist
@Entity
@Table(name="student55")
public class Student {
	
	//it will make it primary key
	@Id
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String dept;

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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Student(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	public Student() {
		super();
	}
	
	

}
