import java.util.Scanner;

public class CalculateThreeCalls {

	public static void main(String[] args) {
		System.out.print("Enter three units per minutes: ");
		Scanner sc = new Scanner(System.in);
		int c1 = sc.nextInt();
		int c2 = sc.nextInt();
		int c3 = sc.nextInt();
		
		System.out.print("Enter tree durations: ");
		int t1 = sc.nextInt();
		int t2 = sc.nextInt();
		int t3 = sc.nextInt();
					
		int talkOne = c1 * t1;
		int talkTwo = c2 * t3;
		int talkThree = c3 * t3;
		int sum = talkOne + talkTwo + talkThree;
		
		
		System.out.println("count for first talking is: " + talkOne + " second: " + talkTwo + " third: " + talkThree + 
				" and sum will be: " +talkThree + " grn" );

	}

}
