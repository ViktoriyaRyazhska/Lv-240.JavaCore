package com.kateg;

import java.util.Scanner;

public class TenIntNum {

	public static void main(String[] args) {
		int sum = 0;
		int prod = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ten numbers");
		
		
		int arr[] = new int[10];
		for (int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			}
		boolean f1=true;
		for (int i=0;i<=4;i++ ){
			if (arr[i]>0)			 
				sum+=arr[i];				
			else{
				f1=false;
				break;
			}
		}
		
		if (f1) {
		System.out.println("sum of 5 first are: " + sum);
		} else {
			System.out.println("There is no sum becouse of negative");
			for (int i=arr.length-1;i>arr.length-5;i--){
						prod *= arr[i];
					}	
					System.out.println("product of 5 last are: " + prod);
				
		}			
		sc.close();
		}
	
	}


