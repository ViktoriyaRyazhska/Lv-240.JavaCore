import java.util.Scanner;

public class MaxMinInts {

	public static void main(String[] args) {
		int max;
		int min;

		Scanner cmd = new Scanner(System.in);
		System.out.println("Please enter three different numbers to find largest of them");
		int a = cmd.nextInt();
		int b = cmd.nextInt();
		int c = cmd.nextInt();

		if (a > b)
			max = a;
		else if (b > c)
			max = b;
		else
			max = c;

		System.out.println("MAX value is: " + max);

		if (a < b)
			min = a;
		else if (b < c)
			min = b;
		else
			min = c;

		System.out.println("MIN value is: " + min);
	}
}
