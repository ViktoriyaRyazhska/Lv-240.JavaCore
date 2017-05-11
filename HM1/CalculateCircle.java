import java.util.Scanner;

public class CalculateCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius");
		double radius = sc.nextDouble();
		double perimetr = Math.PI * (radius * radius);
		double area = Math.PI * 2 * radius;
		System.out.println("Radius = " + radius + "  Area = " + area + "  perimetr = " + perimetr);

	}

}
