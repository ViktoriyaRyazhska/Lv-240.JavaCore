
public class MainFirstTaskThreads {

	public static void main(String[] args) throws InterruptedException {
		FirstTaskThreads t1 = new FirstTaskThreads("Love", 1);
		FirstTaskThreads t2 = new FirstTaskThreads("Peace", 2);
		FirstTaskThreads t3 = new FirstTaskThreads("Hope", 3);

		t1.start();		
		t2.start();
		t2.join();
		t3.start();
		
		

	}

}
