package week3.Lesson4;

import java.util.Scanner;

public class PracticalTasks {

	public static void main(String[] args) {
		
		// task1
		Scanner sc = new Scanner(System.in);
		System.out.println("write down 3 numbers 3 times, one by one");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int result = 0;
		int count =0;
		
		result = num1%2 != 0? count++ : count;
		result = num2%2 != 0? count++ : count;
		result = num3%2 != 0? count++ : count;
		
		System.out.println("The number of odd numbers is " + count);
//		System.out.println("Is a " + num1 + " is odd? " + "The answer is " + result1);
//		System.out.println("Is a " + num2 + " is odd? " + "The answer is " + result2);
//		System.out.println("Is a " + num3 + " is odd? " + "The answer is " + result3);
		
		// task2
		
		System.out.println("write donw the number of the week");
		
		int dayNumber = sc.nextInt();
		
		switch (dayNumber) {
		case 1:
			System.out.println("Monday" + "\n" + "Понеділок" + "\n" + "Понедельник");
			break;
		case 2:
			System.out.println("Tuesday" + "\n" + "Вівторок" + "\n" + "Вторник");
			break;
		case 3:
			System.out.println("Wednesday" + "\n" + "Середа" + "\n" + "Среда");
			break;
		case 4:
			System.out.println("Thursday" + "\n" + "Четвер" + "\n" + "Четверг");
			break;
		case 5:
			System.out.println("Friday" + "\n" + "П'ятниця" + "\n" + "Пятница");
			break;
		case 6:
			System.out.println("Saturday" + "\n" + "Субота" + "\n" + "Субота");
			break;
		case 7:
			System.out.println("Sunday" + "\n" + "Неділя" + "\n" + "Воскресенье");
			break;
	
		default: System.out.println("You wrote a wrong number");
			break;
		}
		
		
		//task 3
		System.out.println("write down the name of the country");
		
		String countryName = sc.next();
		
		
		switch (countryName) {
		case "Ukraine": case "France":
			System.out.println(Continents.EUROPE);
			break;
		case "Brasil":
			System.out.println(Continents.SOUTH_AMERICA);
			break;
		
		default: System.out.println("You wrote name of Countrt");
			break;
		}
		
		
		
	}
}
