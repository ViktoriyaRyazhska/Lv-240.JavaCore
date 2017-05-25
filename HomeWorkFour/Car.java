package com.kateg;

import java.util.Scanner;

public class Car {
	private String type;
	private int yearProd;
	private double engCap;	

	private String getType() {
		return type;
	}
	
	private void setType(String type) {
		this.type = type;
	}

	private int getYearProd() {
		return yearProd;
	}
	
	private void setYearProd(int yearProd) {
		this.yearProd = yearProd;
	}

	private double getEngCap() {
		return engCap;
	}

	private void setEngCap(double engCap) {
		this.engCap = engCap;
	}
	

public Car(String type, int yearProd, double engCap) {
		this.type = type;
		this.yearProd = yearProd;
		this.engCap = engCap;
	}


public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter year of production ");
	int year = sc.nextInt();
	sc.close();
		
	Car [] car = new Car [4];	
	car[0]= new Car("Minivan", 2016 , 1.9);	
	car[1]= new Car("Sport", 2017 , 2.2);	
	car[2]= new Car("Mini", 2015 , 1.9);	
	car[3]= new Car("Crossover", 2016 , 2.0);
		
	
	System.out.println("Cars of certain year: ");
	int yeari;
	for (int i=0;i < car.length;i++){		
		    if(year == car[i].yearProd) {
				yeari=i;
				System.out.println(car[yeari].type + car[yeari].engCap);
			} 
		 };
	
	Car tempYear;
	for (int i=0;i < car.length-1;i++){
		for (int j = i+1; j<car.length;j++){
			if (car[i].yearProd < car[j].yearProd){
				tempYear=car[i];
				car[i]=car[j];
				car[j]=tempYear;
				
			}
		}
		
	}
	System.out.println("Ordered array of cars by years: ");
	for (int i=0;i < car.length;i++){
	System.out.println(car[i].type+" engine capacity "+car[i].engCap+ " year of production "+car[i].yearProd);	
	}	

	}
	
	
}

