package hw2;

public class Appl {

	public static void main(String[] args) {

		Person p1 = new Person("Anya", 1989);
		Person p2 = new Person();
		p2.setName("Tommy");
		p2.setBirthYear(1980);
		Person p3 = new Person("Vova", 2000);
		Person p4 = new Person("Olya", 2001);
		Person p5 = new Person("John", 1065);
		p1.output();
		p2.output();
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);

	}
}
