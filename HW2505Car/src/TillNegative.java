import java.util.Scanner;

public class TillNegative {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int num[] = new int[33];
		int i = 0;
		int oddNumbers = 0;
		int evenNumbers = 0;
		int count = 0;
		int negativeCount = 0;
		int product = 1;

		for (i = 0; i < num.length; i++) {
			System.out.println("enter a number: ");
			num[i] = inp.nextInt();
			count++;
			if (num[i] < 0){
				negativeCount++;
				break;}
			else if (num[i] % 2 == 0) {
				product = product * num[i];
				evenNumbers++;
			} else if (num[i] % 2 == 1) {
				oddNumbers++;
			}

		}
		System.out.println("There are: " + oddNumbers + " odd numbers in your input");
		System.out.println("There are: " + evenNumbers + " even numbers in your input");
		System.out.println("Negative nums entered: " + negativeCount);
		System.out.println("Total nums entered: " + count);
		System.out.println("Product of positive even nums = " + product);
	}

}
