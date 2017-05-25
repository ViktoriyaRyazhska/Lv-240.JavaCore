package com.kateg;

import java.util.Scanner;

public class FiveIntNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers: ");
		
		int arr[] = new int[5];		
		for (int i = 0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}
		
		int posCount=0;
		int tempi=10;
		int tempArr = arr[0];
		int tempArri=0;
		for (int i=0; i<arr.length;i++) {
			if (arr[i]>0) {
				posCount++;
				if(posCount == 2){
					tempi = i;
					
				}
				}
			if (tempArr<arr[i]){
				tempArr=arr[i];
				tempArri = i;
			};
					
		}
		sc.close();
		System.out.println("Position of secondPositive is " + tempi 
				+ " ;Max is " + tempArr + " ;it's in position " + tempArri);

	}

}
