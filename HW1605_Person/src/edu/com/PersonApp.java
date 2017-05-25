
package edu.com;

import java.time.LocalDate;
import java.util.Scanner;

class Person {

	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	private String name;
	private int birthYear;
	private int age;

	// default constructor

	public Person() {
	}
	// getters/setters========================================

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// methods below=============================================

	int age() {
		// age = currentYear - birthYear;

		age = LocalDate.now().getYear() - birthYear;
		return age;
	}

	void input() {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your name : ");
		name = input.next();

		System.out.println("Please enter your birth year : ");
		birthYear = input.nextInt();

	}

	void output() {

		System.out.println("My name is: " + name + ". And I`m " + age + " years old. ");

	}

	void changeName() {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Please change the name : ");
			this.name = input.next();
		}
	}
}

public class PersonApp {

	public static void main(String[] args) {

		Person person1 = new Person("Alex", 1982);
		person1.age();
		person1.output();

		Person person2 = new Person("Ira", 1987);
		person2.age();
		person2.output();

		Person person3 = new Person("Nazar", 1989);
		person3.age();
		person3.output();

		Person person4 = new Person("Nastya", 1997);
		person4.age();
		person4.output();

		Person person5 = new Person("Diana", 1999);
		person5.age();
		person5.output();

		Person person6 = new Person();
		person6.input();
		person6.age();
		person6.output();

		person6.changeName();

		person6.output();

	}

}
