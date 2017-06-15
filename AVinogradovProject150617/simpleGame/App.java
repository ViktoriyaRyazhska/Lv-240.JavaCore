package simpleGame;

import java.util.Scanner;

/*
 * Guess the Word App.
 *
 *@version 1.00 15.06.2017
 *@author artylogic
 * Copyright is protected 
 */
public class App {

	public static void main(String[] args) {
		// The words to be guessed are placed in the array below:
		String[] words = { "submarine", "opportunity", "programmer", "compilation", "regression" };
		// Random is picking a particular word for the each game:
		int randomWordNumber = (int) (Math.random() * words.length);
		// Array to store already entered letters:
		char[] enteredLetters = new char[words[randomWordNumber].length()];
		// Variable for counting the attempts:
		int tryCount = 0;
		// boolean
		boolean wordIsGuessed = false;
		do {
			// iterating through the cycle as long as enterLetter returns true,
			// if enterLetter returns false that means user guessed all the letters
			// in the word and no asterisks were printed by printWord
			switch (enterLetter(words[randomWordNumber], enteredLetters)) {
			case 0:
				tryCount++;
				break;
			case 1:
				tryCount++;
				break;
			case 2:
				break;
			case 3:
				wordIsGuessed = true;
				break;
			}
		} while (!wordIsGuessed);
		System.out.println("\nThe word is: " + words[randomWordNumber] + ". You missed "
				+ (tryCount - findEmptyPosition(enteredLetters)) + " times.");
	}

	/**
	 * Method enterLetter asks to enter a letter, 
	 * returns 0 if letter is not in the word (counts as try), 
	 * returns 1 if letter were entered first time (counts as try), 
	 * returns 2 if already guessed letter was reentered,
	 * returns 3 if all letters were guessed
	 */
	public static int enterLetter(String word, char[] enteredLetters) {
		System.out.print("Please enter a letter in the word: ");
		// If-clause is true if no asterisks were printed so the word is successfully guessed
		if (!printWord(word, enteredLetters))
			return 3;
		System.out.print(" > ");
		Scanner input = new Scanner(System.in);
		int emptyPosition = findEmptyPosition(enteredLetters);
		char userInput = input.nextLine().charAt(0);
		if (ifInEnteredLetters(userInput, enteredLetters)) {
			System.out.println(userInput + " is already in this word!!!");
			return 2;
		} else if (word.contains(String.valueOf(userInput))) {
			enteredLetters[emptyPosition] = userInput;
			return 1;
		} else {
			System.out.println(userInput + " is not in this word!");
			return 0;
		}

	}

	/**
	 * Method printWord prints word with asterisks for hidden letters, returns true if asterisks
	 * were printed, otherwise return false.
	 */
	public static boolean printWord(String word, char[] enteredLetters) {
		// Iterate through all letters in word:
		boolean asteriskPrinted = false;
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			// Checks if letter already have been entered by user before:
			if (ifInEnteredLetters(letter, enteredLetters))
				System.out.print(letter); // If yes - prints it instead of the asterisk.
			else {
				System.out.print('*');
				asteriskPrinted = true;
			}
		}
		return asteriskPrinted;
	}

	/** Method ifInEnteredLetters checks if letter is in enteredLetters array.
	 * returns true if letter is reentered,
	 * returns false if letter is new  */
	public static boolean ifInEnteredLetters(char letter, char[] enteredLetters) {
		return new String(enteredLetters).contains(String.valueOf(letter));
	}

	/*
	 * Find first empty position in array of entered letters (one with code
	 * \u0000)
	 */
	public static int findEmptyPosition(char[] enteredLetters) {
		int i = 0;
		while (enteredLetters[i] != '\u0000')
			i++;
		return i;
	}
}
