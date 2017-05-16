package com.kate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.TimeZone;



public class Person {

	private  String name;
	private  int birthYear;
	private  int today =getCurrentYear() ;
	private int age ;
	
		
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
	
   	public  Integer  Age(){
   		int age =today - birthYear;
		return age;
	}
   	
   	
   	
   	public void changeName(String name){
   		this.name = name;
   	}
	
    
   public void  input ( ) throws NumberFormatException, IOException{
   	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	name = br.readLine();
	birthYear = Integer.parseInt(br.readLine());
	   	
   	}
	//@Override
	public  String output() {
		return "Your name: " + name + ", birthYear: " + birthYear;
	}
	public static int getCurrentYear()
	{
	    Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), java.util.Locale.getDefault());
	    calendar.setTime(new java.util.Date());
	    return calendar.get(java.util.Calendar.YEAR);
	}  
	
	}




