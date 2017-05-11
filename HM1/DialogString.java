import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DialogString {
	public static void main(String[] args) throws IOException {
	String name;
	int age;
	System.out.println("What is your name");
	BufferedReader br = new  BufferedReader
			(new InputStreamReader(System.in));
	name = br.readLine();
	
	System.out.println("How old are you?");
	age = Integer.parseInt(br.readLine());
	
	System.out.println("Where are you live?");
	String adres = br.readLine();
	
	System.out.println("You are: " + name + "," + " " + age + " years old," + " " + adres + ";");
	}
}
