package com.kateg;

import java.util.Scanner;

public class IntTllNeg {

	public static void main(String[] args) {
		System.out.println("Enter numbers. Enter a negative to quit ");
		Scanner sc = new Scanner (System.in);
		int product = 1;
		int nums;
		
				
		while(true){
			if ((  nums = sc.nextInt())>0) {
				 product = product * nums;
		     }	else { 
					System.out.println("it's was neg"); break;
				}
	    }
							
		System.out.println(product);
		sc.close(); 

	}

}
