import java.util.Scanner;

public class task01 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		double radius = Double.parseDouble(sc.nextLine());
		double area =Math.PI*Math.pow(radius,2);
		double perimeter = 2*Math.PI*radius;
		System.out.println("Радіус = "+radius+";"+"Площа ="+area+";"+"Периметр = "+perimeter);

	}

}
