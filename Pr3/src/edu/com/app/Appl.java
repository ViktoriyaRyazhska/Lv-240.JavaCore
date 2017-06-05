package edu.com.app;

public class Appl {

	enum Season {
		WINTER, SPRING, SUMMER, AUTUMN
	}
	
	public static void main(String[] args) {
		Season season = Season.AUTUMN;

		String month = "May";

		switch (month) {
		case "Desember":
		case "January":
		case "February":
			season = Season.WINTER;
			break;
		case "Marth":
		case "April":
		case "May":
			season = Season.SPRING;
			break;
		case "June":
		case "Jule":
		case "August":
			season = Season.SUMMER;
			break;
		case "September":
		case "October":
		case "November":
			season = Season.AUTUMN;
			break;
		default:
			System.out.println("No this month");
			System.exit(0);
		}
		System.out.println(season);
	}
}
