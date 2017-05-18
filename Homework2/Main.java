package homework2;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
 //First part     
    	final Person[] persons = {
                new Person(),
                new Person(),
                new Person(),
                new Person(),
        };
        final Scanner scanner = new Scanner(System.in);

        for (Person person : persons) {
            fillPerson(scanner, person);
        }

        for (Person person : persons) {
            printPerson(person);
        }
    }

    static void fillPerson(Scanner scanner, Person person) {
    	
    	//name
        System.out.println("Please, enter person's name: ");
        // workaround issue when Scanner.nextInt method does not consume the last newline character of input
        // read more at: http://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-nextint-or-other-nextfoo
        try {
        	final String name = scanner.nextLine();
            person.setName(name);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        // birth year
        System.out.println("Please, enter person's birth year: ");
            final int birthYear = Integer.parseInt(scanner.nextLine());
            person.setBirthYear(birthYear);
    }

    static void printPerson(Person person) {
        System.out.println("********* Person *********");
        System.out.println("Name = " + person.getName());
        final int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        final int age = currentYear - person.getBirthYear();
        System.out.println("Age = " + age);
    }
}