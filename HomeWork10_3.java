package HW10_3;

public class MyThread extends Thread {
	private int num = 0;

	public MyThread(int num) {
		this.num = num;
	}

	public void run() {
		switch (num) {
		case 1: {
			System.out.println("This thread number: " + num);
			Thread t2 = new MyThread(2);
			t2.start();
			break;
		}
		case 2: {
			for (int i = 0; i < 3; i++) {
				System.out.println("This thread number: " + num);
			}
			Thread t3 = new MyThread(3);
			t3.start();
			break;
		}
		case 3: {
			for (int i = 0; i < 5; i++) {
				System.out.println("This thread number: " + num);
			}
			break;

		}

		default:
			break;

		}

	}
}

package HW10_3;
public class Main3 {

	public static void main(String[] args) throws InterruptedException {
         Thread t=new MyThread(1);
         t.start();
         t.join();
	}

}