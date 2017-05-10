package hometasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameTask {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("What's Your name?");
		String name = br.readLine();
		System.out.println("What's the name of the city that You live in, " + name + "?");
		String city = br.readLine();
		System.out.println("What is the name of the street, " + name + "?");
		String street = br.readLine();
		System.out.println("What number on the " + street + " street, " + name + "?");
		int number = Integer.parseInt(br.readLine());
		System.out.println("So, "+name+", You live in "+city+
				" and Your current adress is "+street+" street, #"+number+".");
		System.out.println("Was nice to meet You, " + name);
		
	}

}
