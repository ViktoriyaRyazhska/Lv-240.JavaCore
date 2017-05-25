import java.util.Scanner;

public class FiveInt {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int numbers[] = new int[5];
		int i = 0;
	

		for (i = 0; i < numbers.length; i++) {
			System.out.println("Enter a number: ");
			numbers[i] = inp.nextInt();
		}
		
		int min = numbers[0];
		int imin = 0;
		
		while (i < numbers.length) {
			if (numbers[i] < min) {
				min = numbers[i];
				imin = i;
			}
			i++;
		}
		System.out.print("Minimum = " + min);
		System.out.println(" is in " + (imin + 1) + " place");

	}

}
