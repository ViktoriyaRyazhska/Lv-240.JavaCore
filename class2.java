package package_2;

import java.io.IOException;
import java.util.Scanner;

 class class2 {
	public static void main(String[ ] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius:");
		double r = Double.parseDouble(sc.next());
		double l = 2*3.14*r;
		System.out.print("Resalt:"+l);
	}
}
