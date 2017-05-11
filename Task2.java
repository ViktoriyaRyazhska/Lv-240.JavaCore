package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

	public static void main(String[] args) throws IOException {
		System.out.println("What is your name?");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String Name = br.readLine();
		System.out.println("Where are you live, " + Name + "?");
		String Adress = br.readLine();
		System.out.println(Name + " lives in " + Adress);
	}

}
