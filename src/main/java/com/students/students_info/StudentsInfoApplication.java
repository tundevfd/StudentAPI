package com.students.students_info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages={"com.students.students_info","com.students.students_info.controllers","com.students.students_info.models","com.students.students_info.services"})
public class StudentsInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentsInfoApplication.class, args);
	}
}
