import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyPattern {

	public static void main(String[] args) {
		System.out.println("Enter some text with $ US currency");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String pattern = "\\$(\\d)*(\\.\\d{2})?";

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);

		while (m.find()) {
			System.out.print(text.substring(m.start(), m.end()) + "; ");
		}
		sc.close();

	}

}
