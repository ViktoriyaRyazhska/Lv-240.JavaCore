package HW9_2;

@SuppressWarnings("serial")
public class readNumberException extends Exception {

	   public readNumberException(String arg) {
		      super(arg);
		   }


}
package HW9_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		int[] num = new int[10];
		int i = 0;
		while (i < num.length) {
			System.out.print("Enter number " + (i + 1) + ": ");
			try {
				num[i] = readNumber(1, 100);
				i++;
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (readNumberException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		for (int j = 0; j < num.length; j++) {
			System.out.println(num[j]);
		}

	}

	public static int readNumber(int start, int end) throws NumberFormatException, readNumberException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
			n = Integer.parseInt(br.readLine());
		if (start > n || n > end) {
			throw new readNumberException("This number isn't in the range [" + start + "," + end + "] !");
		}
		return n;

	}

}
