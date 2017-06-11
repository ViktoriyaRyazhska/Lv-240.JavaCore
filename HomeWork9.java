package HW9_1;

@SuppressWarnings("serial")
public class MyException extends Exception {

	public MyException(String string) {
		super(string);
	}

}
package HW9_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double n = 0;
		double k = 0;

		boolean success = false;
		while (!success) {
			System.out.println("Введіть ділене і дільник:");
			try {
				n = Double.parseDouble(br.readLine());
				k = Double.parseDouble(br.readLine());
				success = true;
			} catch (NumberFormatException | IOException e) {
				System.out.println(e.toString());
				success = false;
			}
		}

		try {
			System.out.println(div(n, k));
		} catch (MyException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.err.println("Помилка ділення!");
		} catch (Exception e) {
			System.err.println(e.toString());
			e.printStackTrace();
		}
		// System.out.println(d);
	}

	public static double div(double n, double k) throws MyException, ArithmeticException {
		if (k == 0) {
			throw new MyException("Помилка ділення на 0!");
		}
		return n / k;

	}

}
