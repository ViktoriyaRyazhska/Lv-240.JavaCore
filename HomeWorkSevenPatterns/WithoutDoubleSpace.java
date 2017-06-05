import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WithoutDoubleSpace {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter a sentence ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sentence = br.readLine();

		String str1 = "i am";
		String str2 = "I'm";
		boolean res;
		StringBuffer sb = new StringBuffer();
		String[] arrWord = sentence.split("  ");
		for (int i = 0; i < arrWord.length; i++) {
			sb.append(arrWord[i] + " ");
		}
		String newSentence = sb.toString().toLowerCase();
		res = newSentence.contains(str1);
		if (res) {
			System.out.print(newSentence.replace(str1, str2));
		} else {
			System.out.print(newSentence);
		}
		;

	}

}
