import java.util.Scanner;

public class RangeCheck {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the quanity of the numbers to input: ");

		int limit = input.nextInt();
		int targetNumbers = 0;
		int otherNumbers = 0;

		for (int i = 1; i <= limit; i++) {
			System.out.println("Enter your number: " + i + "");
			int numbers = input.nextInt();

			if ( numbers >= -5 && numbers <= 5 ) {
				targetNumbers++;
			} else {
				otherNumbers++;
			}
		}
		System.out.println("There are: " + targetNumbers + " [-5;5] range numbers in your input");
		System.out.println("And there are: " + otherNumbers + " ![-5;5] other numbers in your input");

	}

}
