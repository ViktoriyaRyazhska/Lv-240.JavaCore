import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		int daysInMonth[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("Please enter number of month");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(daysInMonth[n - 1]);
	}
}
