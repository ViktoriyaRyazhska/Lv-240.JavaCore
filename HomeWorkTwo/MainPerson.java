package com.kate;


import java.io.IOException;


public class MainPerson {

	public static void main(String[] args) throws IOException {
			   		    
		Person personOne = new Person();		
		System.out.println("Type you name and type your year of birthday through Enter");		
		personOne.input();
		personOne.changeName("Cat");		
		System.out.println(personOne.output());	
	    System.out.println("Your age is: "+ personOne.Age());
	    
	    Person personTwo = new Person();
	    System.out.println("Type you name and type your year of birthday through Enter");
	    personTwo.input();
	    System.out.println(personTwo.output());		
	    System.out.println("Your age is: "+ personTwo.Age());
	    
	    Person personThree = new Person();
	    System.out.println("Type you name and type your year of birthday through Enter");
	    personTwo.input();
	    System.out.println(personThree.output());		
	    System.out.println("Your age is: "+ personThree.Age());
	    
	  
		
	}

}
