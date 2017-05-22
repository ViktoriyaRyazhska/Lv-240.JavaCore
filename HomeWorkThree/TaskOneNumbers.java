package com.kateg;

import java.util.Scanner;
public class TaskOneNumbers {
	 static float checkNum (Scanner sc)	    
	    {   	
		float numx = sc.nextFloat();
		if (numx<=5.0&&numx>=-5.0){ 
			 System.out.println("its belong to range -5&5");
		} else {  System.out.println("not a range");}
		return numx;
		
		}

	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number");				
		checkNum(sc);
		
		System.out.print("Enter number ");
		checkNum(sc);
		
		System.out.print("Enter number ");
		checkNum(sc);
		
		sc.close();
		
		
	   
	}

}
