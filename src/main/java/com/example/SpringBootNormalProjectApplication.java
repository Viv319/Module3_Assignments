package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.dao.StudentDaoI;
import com.cg.entity.Student;

@SpringBootApplication
public class SpringBootNormalProjectApplication implements CommandLineRunner {

	@Autowired
	StudentDaoI studao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootNormalProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Student s1= new Student(1,"sachin","cs");
		Student s2= new Student(2,"Pop","civil");
		Student s3= new Student(3,"Lol","mech");
		Student s4= new Student(4,"Ioc","cs");
		
		studao.create(s1);
		studao.create(s2);
		studao.create(s3);
		studao.create(s4);
		System.out.println("recorded");
	}

}
