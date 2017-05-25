import java.util.Scanner;

public class Car {

	public static int inputYear() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the production year : ");
		int year = input.nextInt();
		return year;
	}

	public static void main(String[] args) {

		CarIdea[] car = new CarIdea[4];
		car[0] = new CarIdea("sedan", 2000, 1900);
		car[1] = new CarIdea("hatchback", 2016, 1400);
		car[2] = new CarIdea("convertible", 2010, 3000);
		car[3] = new CarIdea("offroad", 2000, 4200);
		int n = inputYear();

		for (int i = 0; i < car.length; i++) {
			if (car[i].getYear() == n) {
				System.out.println(car[i]);}
				else if (car[i].getYear() != n){
				System.out.println("No cars here with this production year" );
			}
			}

			// sorting by Year 
			CarIdea temp;

			for (int i1 = 0; i1 < car.length - 1; i1++) {
				for (int j = i1 + 1; j < car.length; j++) {
					if (car[i1].getYear() > car[j].getYear()) {
						temp = car[i1];
						car[i1] = car[j];
						car[j] = temp;
					}
				}
			}
			System.out.println();
			System.out.println( "Cars arranged by production year: ");
			for (int i2 = 0; i2 < car.length; i2++) {

				System.out.println(car[i2]);
			}
		}

	}

