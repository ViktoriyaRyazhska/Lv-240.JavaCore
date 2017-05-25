import java.util.Arrays;
import java.util.Scanner;
//як зробити щоб довжина масиву збільшувалась?
public class Task04 {
	public static void main(String[] args) {
		System.out.println("Please enter some ints");
		int arr[];
		arr = new int[1];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			int number = Integer.parseInt(sc.nextLine());
			if ( number<0){break;}
			arr=new int[i+1];
			arr[i]=number;
			System.out.println(arr[i]);
			//arr = new int[i+2];

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println(Arrays.toString(arr));

	}

}
