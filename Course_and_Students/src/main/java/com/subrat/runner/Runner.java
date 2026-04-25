package com.subrat.runner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.subrat.entity.Course;
import com.subrat.entity.Student;
import com.subrat.service.Iservice;
@Component
public class Runner implements CommandLineRunner {
	@Autowired
	private Iservice serv;

	@Override
	public void run(String... args) throws Exception {
		while(true) {
			int choice=Integer.parseInt(IO.readln("enter your choice"));
			switch(choice) {
			
			case 1->{
				Course c=new Course("java",2l);
				Student s=new Student("subrat","sn@hmail");
				Student s1=new Student("raj","sn@hmail");
				Student s2=new Student("rahul","sn@hmail");
				c.setStudents(List.of(s,s1,s2));
				serv.addCources(List.of(c));
				IO.println("course added");
			}
			case 2->{
				serv.viewStudent().forEach(IO::println);
			}
			case 3->{
				Long id=Long.parseLong(IO.readln("enter id"));
				Optional<Course> searchCourseById = serv.searchCourseById(id);
				searchCourseById.ifPresent(IO::println);
			}
			}
		}

	}

}
