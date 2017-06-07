import java.util.Scanner;

public class SecondVersionRange {
	static void readNumber(String str) throws RangeException {
		int start = 1;
		int end = 100;

		try {
			Integer e = Integer.parseInt(str);
			if (e < start || e > end) {
				throw new RangeException("What is '" + str + "'? Enter nums in range from 1 till 100\n");
			} else {
				System.out.println(e + " ");
			}
		} catch (NumberFormatException e) {
			System.err.println("What is '" + str + "'? Enter only nums!\n");
		}

	}

	public static void main(String[] args) {
		System.out.println("Enter 10 int nums ");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] arrLine = line.split(" ");

		for (int i = 0; i < arrLine.length; i++) {
			if (arrLine[i].length() == 0)
				continue;

			try {
				readNumber(arrLine[i]);
			} catch (RangeException e) {
				System.out.println(e);

			}

		}

		sc.close();
	}

}
