package homework3;

import java.util.Scanner;

public class Task1a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		for (int i = 0; i<3; i++){
			System.out.println("Please, enter float value");
			try {
	        	final float tempFloatValue = sc.nextFloat();
	        	float floatValue = tempFloatValue;
	        	 if (floatValue<=5&&floatValue>=-5){
	 				counter++;
	 			}
	        } catch (NumberFormatException e) {
	            e.printStackTrace();
	       }	
		}				
		System.out.println(counter);
	}
}
