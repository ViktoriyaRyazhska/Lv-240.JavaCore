package com.kate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();

        students.add(new Student("Vasya", 1));
        students.add(new Student("Anna", 2));
        students.add(new Student("Alina", 3));
        students.add(new Student("Alex", 1));
        students.add(new Student("Ira", 3));
        
        System.out.println("Enter course ");	
        Scanner sc = new Scanner(System.in);
        Integer numCourse = sc.nextInt();        
        Student studPrint=new Student();
        studPrint.printStudents(students, numCourse);   
       
        sc.close();
        

        students.sort(new NameComparator());        
        	System.out.println(students);
        
        students.sort(new CourseComparator());
        System.out.println(students);
        
        
      
        
           
	
    }   
}
