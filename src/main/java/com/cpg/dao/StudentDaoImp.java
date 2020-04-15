package com.cpg.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cpg.entity.Student;

//transaction will take care of all the transaction
@Transactional
@Repository
public class StudentDaoImp implements StudentDaoI {

	//EntityManager has to send data to database
	//@PersistenceContext
	EntityManager em;
	
	@Override
	public void create(Student s) {
		// TODO Auto-generated method stub
		//persist will take this object and send it to database
		em.persist(s);
		
		 
	}

}
