
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivCalculate {
	public static double div(double a, double b) throws ArithmeticException {
		if (b == 0)
			throw new ArithmeticException();
		double result = a / b;
		return result;
	}

	public static void main(String[] args) {
		System.out.println("Enter two nums to divide");
		Scanner br = new Scanner(System.in);
		double a = 0;
		double b = 0;
		try {
			a = br.nextDouble();
			b = br.nextDouble();
		} catch (NumberFormatException | InputMismatchException e) {
			System.out.println("Enter double numbers! ");
		}
		try {
			System.out.println("Result of div " + div(a, b));
		} catch (ArithmeticException e) {
			System.out.println("Can't divide by 0");
		}
		br.close();
	}

}
