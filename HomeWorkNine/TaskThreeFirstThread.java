
public class TaskThreeFirstThread extends Thread {

	TaskThreeSecondThread tt = new TaskThreeSecondThread();

	@Override
	public void run() {
		tt.run();
	}

}
