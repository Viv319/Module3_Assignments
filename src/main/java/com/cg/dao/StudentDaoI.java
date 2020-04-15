package com.cg.dao;

import org.springframework.stereotype.Repository;

import com.cg.entity.Student;

@Repository
public interface StudentDaoI {
	
	public  void create(Student s);

}
