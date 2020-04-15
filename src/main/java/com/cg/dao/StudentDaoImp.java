package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.entity.Student;

@Transactional
@Repository
public class StudentDaoImp implements StudentDaoI {

	@PersistenceContext
	EntityManager em;
	
	
	@Override
	public void create(Student s) {
		// TODO Auto-generated method stub
		em.persist(s); //this object will make a reference in database table
		
		
	}

}
