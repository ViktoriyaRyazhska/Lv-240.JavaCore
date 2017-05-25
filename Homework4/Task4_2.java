package homework4_1;

import java.util.Scanner;

public class Task4_2 {

	public static void main(String[] args) {
		// Enter 10 integer numbers. Calculate the sum of first 5 elements if
		// they are positive or product of last 5 element in the other case.
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int prod = 1;
		int n;
		for (int i = 0; i < 10; i++) {
			System.out.println("Input number");
			n = Integer.parseInt(sc.nextLine());

			if (n > 0 && i<5) {
				sum += n;
			}
			if (n>0 && i>5){
				prod *= n;
			}
		}

		System.out.println(sum);
		System.out.println(prod);
	}

}
