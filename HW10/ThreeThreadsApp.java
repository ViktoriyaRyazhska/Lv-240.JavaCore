

public class ThreeThreadsApp {

	public static void main(String[] args) {
		Thread thr1 = new ThreeThreads(1, 2000, "HelloWorld", 5);
		Thread thr2 = new ThreeThreads(2, 3000, "PeaceInWorld", 5);
		Thread thr3 = new ThreeThreads(3, 1000, "AlexIsMyName", 5);
		thr1.start();
		thr2.start();
		try {
			thr2.join();
			thr3.start();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	}

}
