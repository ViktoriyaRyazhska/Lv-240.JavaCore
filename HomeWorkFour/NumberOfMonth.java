package com.kateg;

import java.util.Scanner;

public class NumberOfMonth {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number of month: ");
		int numMonth = sc.nextInt();
		
		int monthDays[]= {31, 28, 31, 30, 31, 30, 
				31, 31, 30, 31, 30, 31} ;

		
		if(numMonth>0 && numMonth<=monthDays.length) {
		System.out.println("This month has: " + monthDays[numMonth-1]);
		
		} else System.out.println("Not a correct");
		sc.close();
	}
}

