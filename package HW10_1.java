package HW10_1;

public class MyThread extends Thread {
	private int num = 0;

	public MyThread(int num) {
		this.num = num;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("This thread number: " + num);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

package HW10_1;

public class Main1 {

	public static void main(String[] args) {
		Thread t1 = new MyThread(1);
		Thread t2 = new MyThread(2);
		Thread t3 = new MyThread(3);

		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t3.start();
	}

}
