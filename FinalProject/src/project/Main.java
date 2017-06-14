package project;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		MainMenu menu = new MainMenu();
		try {
			menu.GetMenu();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
