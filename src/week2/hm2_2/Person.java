package week2.hm2_2;

import java.util.Scanner;

public class Person {
	private String name;
	private int birthYear;
	static int thisYear = 2017;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int birthYear) {
		super();
		this.name = name;
		this.birthYear = birthYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public int age(){
		return thisYear - this.birthYear;
	}
	
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Write down name of a person:");
		
		if (sc.hasNextLine()){
			String tempName = sc.nextLine();
			this.setName(tempName);
		}
		
		System.out.println("Write down the birthYear of a person");
		if (sc.hasNextInt()){
			int tempBirthYear = sc.nextInt();
			if (tempBirthYear <= thisYear)
			this.setBirthYear(tempBirthYear);
		} else{
			System.out.println("You wrote a wrong year, today is " + thisYear);
		}
	}

//	@Override
	public String outPut() {
		return "Person [name=" + name + ", birthYear=" + birthYear + "]";
	}
	
	public void changeName(){
		System.out.println("Write down the new Name of a person");
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextLine()){
			String tempName = sc.nextLine();
			this.setName(tempName);
		} else {
			System.out.println("You wrote a wrong data");
		}
	}
	
}
