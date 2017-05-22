package com.kateg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MaxMinNum {	

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int n = 3; int max=0; int min ;
		int [] arr = new int[n];
		
		System.out.println("EnterThreeNumbers: ");
		for(int  i=0; i<n;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}	
		min=arr[0];
		for(int  i=0; i<arr.length;i++){
			if(max<arr[i]) max=arr[i];
			if(min>arr[i]) min=arr[i];
			
		}
		System.out.println("Max "+max + " Min " + min);
	}

}
