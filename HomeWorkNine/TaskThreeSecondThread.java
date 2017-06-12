
public class TaskThreeSecondThread extends Thread {
	TaskThreeThirdThread tth = new TaskThreeThirdThread();

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Thread number two");
		}
		tth.run();

	}

}