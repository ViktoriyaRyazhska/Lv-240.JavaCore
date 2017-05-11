package hometasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircleTask {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double pi = 3.141592;
		System.out.println("Enter the radius length of the circle, please: ");
		double r = Double.parseDouble(br.readLine());
		
		double P = 2 * (pi*r);
		double A = pi * (r*r);
		System.out.println("The perimeter(P) of the circle is: " + P + "cm.");
		System.out.println("The area(A) of the cirlce is: " + A + "cm.");
		
	}

}
