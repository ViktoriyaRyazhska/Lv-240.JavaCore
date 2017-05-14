package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	private String name;
	private int birthYear;

	public int age() {
		Date dateNow = new Date();
		SimpleDateFormat formatForDateNow = new SimpleDateFormat("y");
		int date = Integer.parseInt(formatForDateNow.format(dateNow));
		return date - this.birthYear;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public Person() {
	}

	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please write name of Person");
		String name = br.readLine();
		setName(name);
		System.out.println("Please write Person's date of birth");
		int birthYear = Integer.parseInt(br.readLine());
		setBirthYear(birthYear);
	}

	public void output() {
		System.out.println("Person [name=" + name + ", birthYear=" + birthYear + " ,age= " + age() + "]");
	}

	public void changeName() throws IOException {
		System.out.println("Please write new name of Person");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		setName(br.readLine());
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthYear=" + birthYear + ", age= " + age() + "]";
	}

}
