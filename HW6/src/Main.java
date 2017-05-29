
public class Main {

	public static void main(String[] args) {
		Bird[] arr = new Bird[5];
		arr[0] = new Chicken("white", true, 2);
		arr[1] = new Eagle("brown", true, 100);
		arr[2] = new Penguin("brown", true, 1);
		arr[3] = new Chicken("red", true, 1);
		arr[4] = new Swallow("black", true, 10);

		for (int i = 0; i < arr.length; i++) {
			arr[i].fly();
			System.out.println(arr[i]);
		}

	}

}
