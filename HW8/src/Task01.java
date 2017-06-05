public class Task01 {
	public static void main(String[] args) {
		String str = "I love small red cat";
		String[] arr = str.split(" ");

		int max = arr[0].length();
		String maxi = arr[0];
		int i = 0;
		while (i < arr.length) {
			if (arr[i].length() > max) {
				max = arr[i].length();
				maxi = arr[i];
			}
			i++;
		}

		System.out.println("The longest word is: " + maxi);
		System.out.println("The longest word has " + maxi.length() + " letters");

		StringBuilder sb = new StringBuilder(arr[1]);
		System.out.println(sb.reverse());

	}
}
