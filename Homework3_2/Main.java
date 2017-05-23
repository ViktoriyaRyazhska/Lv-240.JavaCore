package homework3_2;

import java.util.Scanner;

import homework3_2.Dog;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter dog1 name");
		String dog1Name= sc.nextLine();
		System.out.println("Please, enter dog2 name");
		String dog2Name= sc.nextLine();
		System.out.println("Please, enter dog3 name");
		String dog3Name= sc.nextLine();
		
		if (dog1Name == dog2Name){
			System.out.println(dog1Name + "equal" + dog2Name);
		}
		if (dog2Name == dog3Name){
			System.out.println(dog2Name + "equal" + dog3Name);
		}
		if (dog1Name == dog3Name){
			System.out.println(dog1Name + "equal" + dog3Name);
		}
		
		System.out.println("Please, enter dog1 age");
		int dog1Age= sc.nextInt();
		System.out.println("Please, enter dog2 age");
		int dog2Age= sc.nextInt();
		System.out.println("Please, enter dog3 age");
		int dog3Age= sc.nextInt();
		
		if (dog1Age > dog2Age && dog1Age > dog3Age){
			System.out.println(dog1Name + "has max age");
		}
		if (dog1Age < dog2Age && dog1Age < dog3Age){
			System.out.println(dog2Name + "has min age");
		}
		if (dog2Age > dog1Age && dog2Age > dog3Age){
			System.out.println(dog2Name + "has max age");
		}
		if (dog2Age < dog1Age && dog2Age < dog3Age){
			System.out.println(dog2Name + "has min age");
		}
		if (dog3Age > dog1Age && dog3Age > dog2Age){
			System.out.println(dog3Name + "has max age");
		}
		if (dog3Age < dog1Age && dog3Age < dog2Age){
			System.out.println(dog3Name + "has min age");
		}
    }
}
