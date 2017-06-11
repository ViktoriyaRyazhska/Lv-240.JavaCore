package HW10_2;

public class MyThread extends Thread {
	private Thread object;

	public MyThread() {
	}

	public MyThread(Thread object) {
		this.object = object;
	}

	public void run() {
		System.out.println("Start thread");
			try {
				object.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("Stop thread");
	}

}

package HW10_2;

public class Main2 {

	public static void main(String[] args) throws InterruptedException {
		 Thread t1=new Thread();
		 t1.start();
		 System.out.println("Start thread main()");
         Thread t2=new MyThread(t1);
         t2.start();
         t2.join();
         System.out.println("Stop thread main()");

	}

}
