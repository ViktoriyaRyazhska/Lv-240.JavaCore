package com.kate;

import java.util.Iterator;
import java.util.List;

public class Student {
	Integer numCourse;
	private int course;
	private String name;

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}
	
	public Student() {
		
	}

	
	@Override
	public String toString() {
		return "Student: course=" + course + ", name=" + name  ;
	}



	public void printStudents(List<Student> students, Integer numCourse) {
		 System.out.println("Enter course ");
	 
	 Iterator<Student> it = students.iterator();
	 Student stTemp;
	 
     while(it.hasNext()){
    	 stTemp = it.next();
    	 if(stTemp.course== numCourse){
     	System.out.println(stTemp.name);
    	 }
     }
	
}
}