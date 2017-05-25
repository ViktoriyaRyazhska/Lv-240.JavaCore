package homework4_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task4_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int monthDays[] = new int[12];
		for (int i = 0; i < monthDays.length; i++) {
			System.out.println("Please enter month's number");
			int month = sc.nextInt();
			if (month == 1) {
				monthDays[0] = 31;
			}
			if (month == 2) {
				monthDays[1] = 28;
			}
			if (month == 3) {
				monthDays[2] = 31;
			}
			if (month == 4) {
				monthDays[3] = 30;
			}
			if (month == 5) {
				monthDays[4] = 31;
			}
			if (month == 6) {
				monthDays[5] = 30;
			}
			if (month == 7) {
				monthDays[6] = 31;
			}
			if (month == 8) {
				monthDays[7] = 31;
			}
			if (month == 9) {
				monthDays[8] = 30;
			}
			if (month == 10) {
				monthDays[9] = 31;
			}
			if (month == 11) {
				monthDays[11] = 31;
			}

			System.out.println(Arrays.toString(monthDays));
		}
	}
}