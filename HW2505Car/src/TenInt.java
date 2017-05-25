import java.util.Scanner;

public class TenInt {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int num[] = new int[33];
		int i = 0;
		int sum5 = 0;
		int prodLast5 = 0;

		for (i = 0; i < num.length; i++) {
			System.out.println("Enter a number: ");
			num[i] = inp.nextInt();
		
			if (num[i] > 0) {
			sum5 = num[0] + num[1] + num[2] + num[3] + num[4];
			System.out.println("Sum of first 5 positive nums = " + sum5);
			}
			else if (num[i] < 0 ){
		
			prodLast5 = num[5] * num[6] * num[7] * num[8] * num[9];
		
			System.out.println("Product of next 5 to 10 nums = " + prodLast5);
			break;}
	}

}
}