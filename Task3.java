package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please, enter call duration from city 1");
		int T1 = Integer.parseInt(br.readLine());
		System.out.println("Please, enter call cost city 1");
		int C1 = Integer.parseInt(br.readLine());
		System.out.println("Please, enter call duration from city 2");
		int T2 = Integer.parseInt(br.readLine());
		System.out.println("Please, enter call cost city 2");
		int C2 = Integer.parseInt(br.readLine());
		System.out.println("Please, enter call duration from city 3");
		int T3 = Integer.parseInt(br.readLine());
		System.out.println("Please, enter call duration from city 3");
		int C3 = Integer.parseInt(br.readLine());
		int Sum = T1*C1+T2*C2+T3*C3;
		System.out.println("Call duration from city 1 = " + T1*C1);
		System.out.println("Call duration from city 2 = " + T2*C2);
		System.out.println("Call duration from city 3 = " + T3*C3);
		System.out.println("Sum of all calls = " + Sum);
	}

}
