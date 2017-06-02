package com.kate;

import java.util.HashMap;
import java.util.Map;

public class PersonMap {
	String lastName;
	String firstName;

	public PersonMap(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Person: " + lastName + " " + firstName;
	}

	public static void main(String[] args) {
		Map<String, String> personMap = new HashMap<String, String>();
		personMap.put("Kryv", "Ihor");
		personMap.put("Luck", "Lucky");
		personMap.put("Bag", "Ninga");
		personMap.put("Jurch", "Olena");
		personMap.put("Bidun", "Ihor");
		personMap.put("Star", "Andy");
		personMap.put("Bright", "Oxi");
		personMap.put("Andrusch", "Vova");
		personMap.put("Car", "Carry");
		personMap.put("Drug", "Luba");

		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println("The remove: ");

		// remove element
		String value = "Luba";
		Map<String, String> copyMap = new HashMap<String, String>(personMap);
		for (Map.Entry<String, String> entry : copyMap.entrySet()) {
			if (entry.getValue().equals(value)) {
				personMap.remove(entry.getKey());
			}
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println("Size after remove: " + personMap.size());

		// same firstName
		String name= "Ihor";		
		int count =0;
		String temp="Oxi";		
		for (String tmp : personMap.values()){
			if(name.equals(tmp) ){
				temp=tmp;
				count++;
			}
		
		}
		System.out.println("count the same name: " + temp+ " "+count);
		

	}
}
