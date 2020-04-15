package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cpg.dao.StudentDaoI;
import com.cpg.entity.Student;

@SpringBootApplication
public class SpringBootDataJpaRestApplication implements CommandLineRunner{

	@Autowired
	StudentDaoI studao;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaRestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Student s1= new Student(1,"sachin","cs");
		Student s2= new Student(2,"pawan","civil");
		Student s3= new Student(3,"Naveen","cs");
		Student s4= new Student(4,"Aman","mech");
		
		studao.create(s1);
		studao.create(s2);
		studao.create(s3);
		studao.create(s4);
		
		System.out.println("record inserted");
	}

}
