package homework4_1;

import java.util.Scanner;

public class Task4_3 {

	public static void main(String[] args) {
		/*
		 * Enter 5 integer numbers. Find position of second positive number;
		 * minimum and its position in the array.
		 */
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter array value");
			arr[i] = sc.nextInt();
		}
		int ipositive = 0;
		int j = 0;
		int counter = 0;
		while (j < arr.length) {
			if (arr[j] > 0) {
				counter++;
				ipositive = j;
			}
			if (counter >= 2) {
				break;
			}
			j++;
		}
		System.out.println("Second Positive is in " + (ipositive + 1) + " place");

		int min = arr[0];
		int imin = 0;
		int i = 0;
		while (i < arr.length) {
			if (arr[i] < min) {
				min = arr[i];
				imin = i;
			}
			i++;
		}
		System.out.print("Minimum = " + min);
		System.out.println(" is in " + (imin + 1) + " place");

	}

}
