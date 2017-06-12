import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
	static Scanner sc;
	static PrintWriter writer;

	public static void main(String[] args) {
		try {
			sc = new Scanner(new File("mycarrertopic.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File doesn't exist");
		}

		ArrayList<String> list = new ArrayList<String>();
		while (sc.hasNextLine()) {
			list.add(sc.nextLine());
		}

		File file = new File("writemycareer");

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("IOException in createfile block " + e);
			}
		}

		try {
			writer = new PrintWriter("writemycareer");
		} catch (FileNotFoundException e) {
			System.out.println("file doen't exist");
		}

		// number of lines
		writer.println(list.size());

		// the longest line
		int max = 0;
		String maxi = "";

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() > max) {
				max = list.get(i).length();
				maxi = list.get(i);
			}
		}
		writer.println("max line is " + max + " " + maxi);

		// contain name and birthday
		String word = "My name";
		String date = "Birthday date";
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains(word)) {
				writer.println(list.get(i));

			}
			if (list.get(i).contains(date)) {
				writer.println(list.get(i));
			}

		}

		writer.close();

	}

}
