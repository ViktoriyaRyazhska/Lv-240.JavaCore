package com.kate;


import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;



public class Person {

	private  String name;
	private  int birthYear;
	private  int age ;
	
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear)  {
		this.birthYear = birthYear;
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		
	}
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	public Person() {
		
	}
	
   	public  int  Age(){
   		age = LocalDate.now().getYear() - birthYear;
		return age;
	}
   	
   	
   	
   	public void changeName(){
   		Scanner input = new Scanner(System.in);
   		System.out.println("change your name: ");
   		this.name = input.next();
   	}
	
    
   public void  input ( ) throws NumberFormatException, IOException{
	   Scanner input = new Scanner(System.in);
	   System.out.println("Type you name");
	   this.name = input.next();
	   System.out.println("Type your year of birthday");
	   this.birthYear = input.nextInt();   
	   	
   	}
	
	void  output() {
		System.out.println("Your name: " + name + ", Your age " + age);
	}
	
		
	}




