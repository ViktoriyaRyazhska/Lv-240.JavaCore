import java.util.Scanner;

public class MainCars {

	public static void main(String[] args) {
		Car[] arr = new Car[4];
		arr[0] = new Car("BMW", 2000, 2.0);
		arr[1] = new Car("AUDI", 2009, 3.6);
		arr[2] = new Car("Toyota", 2010, 1.8);
		arr[3] = new Car("Kia", 2016, 1.6);

		System.out.println("Please enter type of car to see its year");
		Scanner sc = new Scanner(System.in);
		String typeInput = sc.nextLine();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getType().equals(typeInput)) {
				System.out.println(arr[i].getYear());
			}
		}

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].getYear() < arr[j].getYear()) {
					Car tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
