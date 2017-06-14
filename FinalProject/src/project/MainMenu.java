package project;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainMenu {
	public static final String NameFileType = "ListType.txt";
	private static Scanner scanner;

	public MainMenu() {
	}

	public void GetMenu() throws IOException {
		ListType listtype;
		int count = 0;
		scanner = new Scanner(System.in);
		Pattern pattern1 = Pattern.compile("[0-9]+");
		Pattern pattern2 = Pattern.compile("[+-]");
		Pattern pattern3 = Pattern.compile("exit");

		while (true) {
			listtype = new ListType(NameFileType);
			count = listtype.PrintList();

			System.out.println();
			System.out.println("Для перегляду введіть порядковий номер");
			System.out.println("(+)-додати, (-)-видалити, (exit)-вийти)");

			String command = scanner.next();

			Matcher m1 = pattern1.matcher(command);
			Matcher m2 = pattern2.matcher(command);
			Matcher m3 = pattern3.matcher(command);
			if ((m1.matches()) && (Integer.parseInt(command) <= count)) {
				System.out.println("Open " + command);
				listtype.OpenType(Integer.parseInt(command));
			} else if (m2.matches()) {
				switch (command) {
				case "+": {
					listtype.setAddType();
					break;
				}
				case "-": {
					listtype.setDelType();
					break;
				}
				default:
					break;
				}
			} else if (m3.matches()) {
				System.out.println("Вихід!!!");
				break;
			} else {
				System.out.println("Неправильний ввід!!! Повторіть:");
			}
		}
	}

}
