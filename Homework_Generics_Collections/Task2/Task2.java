package homework_6_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class Task2 {

	public static void main(String args[]) {

		// declare HashMap
		HashMap<String, String> Person = new HashMap<String, String>();

		// Adding elements to HashMap
		Person.put("Pikhotina", "Anna");
		Person.put("Rak", "Olya");
		Person.put("Tyk", "Sasha");
		Person.put("Kovalenko", "Petya");
		Person.put("Sveridov", "Vasya");
		Person.put("Subota", "Anna");
		Person.put("Dub", "Sasha");
		Person.put("Pikhotina", "Oksana");
		Person.put("Pravda", "Anna");
		Person.put("Pikhotin", "Orest");

		// Iterator
		Set set = Person.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry myentry = (Map.Entry) iterator.next();
			System.out.print("key is: " + myentry.getKey() + " & Value is: ");
			System.out.println(myentry.getValue());
		}

		// Remove values based on key
		Person.remove("Pikhotin");

		
		//Draft, I need to improve
	}
}