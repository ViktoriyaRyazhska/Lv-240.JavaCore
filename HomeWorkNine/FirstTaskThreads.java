
public class FirstTaskThreads extends Thread {
	String message;
	int number;

	public FirstTaskThreads(String message, int number) {
		this.message = message;
		this.number = number;
	}

	@Override
	public void run() {
		for (int i = 0; i < 6; i++) {
			System.out.println(number + " thread " + message);
		}

	}

}
