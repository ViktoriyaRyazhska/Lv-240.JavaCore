package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int R = Integer.parseInt(br.readLine());
		double Pi = 3.14;
		double P = 2*Pi*R;
		double S = Pi*R*R;
		System.out.println("Perimeter" + " = " + P);
		System.out.println("Area" + " = " + S);
	}

}
