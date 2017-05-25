import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		System.out.println("Please enter 10 ints");
		int arr[] = new int[10];
		for (int i = 0; i < 10; i++) {
			Scanner sc = new Scanner(System.in);
			arr[i] = sc.nextInt();

		}
		System.out.println(Arrays.toString(arr));
		int sum = 0;
		int product = 1;
		boolean case2 = false;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (arr[i] < 0) {
				case2 = true;
				break;
			}
			if (i == 4) {
				System.out.println("The sum of first 5 positive numbers is " + sum);
			}
		}
		
		if (case2) {
			for (int i = 5; i < arr.length; i++) {
				product *= arr[i];
			}
			System.out.println("Product of 5 last is " + product);
		}

	}

}
