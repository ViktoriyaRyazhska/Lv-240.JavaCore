package homework4_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task4_4 {

	public static void main(String[] args) {
		/*
		 * Organize entering integers until the first negative number. Count the
		 * product of all entered even numbers.
		 */
		Scanner sc = new Scanner(System.in);
		int integer;
		int i = 0;
		int arr[] = new int[i];
		int arr1[] = new int[i];
		do {
			integer = sc.nextInt();

			for (int j = 0; j < arr.length; j++) {
				arr1[j] = integer;
			}

			i++;
		} while (integer > 0);

		System.out.println(Arrays.toString(arr1));
	}

}
