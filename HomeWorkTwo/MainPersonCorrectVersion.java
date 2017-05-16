package com.kate;


import java.io.IOException;


public class MainPerson {

	public static void main(String[] args) throws IOException {
			   		    
		Person personOne = new Person();
		personOne.input();
		personOne.Age();
		personOne.changeName();		
		personOne.output();	
	    
	    
	    Person personTwo = new Person();
	    personTwo.input();
	    personTwo.Age();
		personTwo.changeName();		
		personTwo.output();	
	   
	    
	    Person personThree = new Person();
	    personThree.input();
	    personThree.Age();
	    personThree.output();		
	   
	    Person personFour = new Person();
	    personFour.input();
	    personFour.Age();
	    personFour.output();	
	    
	    Person personFive = new Person();
	    personFive.input();
	    personFive.Age();
	    personFive.output();
	    
	  
		
	}

}
