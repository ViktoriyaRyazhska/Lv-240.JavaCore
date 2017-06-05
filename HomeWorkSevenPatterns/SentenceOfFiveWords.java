import java.util.Scanner;

public class SentenceOfFiveWords {

	public static void main(String[] args) {
		System.out.println("Enter the sentence of five words ");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();

		String[] arrWords = sentence.split(" ");
		int lw = 0;
		String longWord = "";

		for (int i = 0; i < arrWords.length; i++) {
			if (arrWords[i].length() > lw) {
				lw = arrWords[i].length();
				longWord = arrWords[i];

			}

		}

		System.out.println("The longestWord is " + longWord);
		System.out.println("size is " + longWord.length());
		String word = arrWords[1];
		StringBuffer sb = new StringBuffer(word);
		System.out.println(sb.reverse());
		
		sc.close();

	}

}
