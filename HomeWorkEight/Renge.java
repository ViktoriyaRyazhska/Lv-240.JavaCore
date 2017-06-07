import java.util.Scanner;

public class Renge {
	static void readNumber(int[] arr) throws RangeException {
		int start = 1;
		int end = 100;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= start && arr[i] <= end) {
				System.out.print(arr[i] + " ");
			} else {
				throw new RangeException("Enter nums in range from 1 till 100");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter 10 int nums ");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] arrLine = line.split(" ");

		int[] arr = new int[arrLine.length];
		
		for (int i = 0; i < arrLine.length; i++) {
			try{
			arr[i] = Integer.parseInt(arrLine[i]);
		
		}catch(NumberFormatException e){
			System.err.println(e.getMessage());
		}
		}
		try {
			readNumber(arr);
		} catch (RangeException e){
			System.err.println(e);
		}
		sc.close();
	}

}
