import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		System.out.println("Please enter 5 ints");
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			Scanner sc = new Scanner(System.in);
			arr[i] = sc.nextInt();

		}
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 0) {
				continue;
			} else {
				n++;
				if (n == 2) {
					System.out.println("Position of second positive number is " + (i+1));
					break;
				}
			}
		}
		
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
		System.out.println("Minimum  int is " + min+ " and its plase is "+(imin + 1));


	}

}
