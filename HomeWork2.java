package HomeWork2;

public class PersonMain {

	public static void main(String[] args) {

		Person pr1 = new Person("Nicolas", 1980);
		Person pr2 = new Person();
		Person pr3 = new Person();
		Person pr4 = new Person();
		Person pr5 = new Person();
		pr1.changeName("Nic");
		pr2.input("Igor", 1985);
		pr3.input("Ira",  1990);
		pr4.input("Sofi", 1995);
        pr5.input("Caty", 1992);
		
		String prn;
		prn=pr1.output(); System.out.println(prn);
		prn=pr2.output(); System.out.println(prn);
		prn=pr3.output(); System.out.println(prn);
		prn=pr4.output(); System.out.println(prn);
		prn=pr5.output(); System.out.println(prn);
		
		int age=pr5.age(); System.out.print("Age ="+age);
	}

}


//-------------------------------------------------

package HomeWork2;

import java.time.Year;

public class Person {
private String name ="";
private int birthYear =0;

public Person() {}

public Person(String name, int birthYear) {
	this.name = name;
	this.birthYear = birthYear;
}

public int age() {
	return Year.now().getValue()- birthYear;
}

public void input(String name, int birthYear) {
	this.name = name;
	this.birthYear = birthYear;
}

public String output() {
	return "Person [name=" + name + ", birthYear=" + birthYear + ", age=" + age() + "]";
}

public void changeName(String name) {
	this.name = name;
}


}
