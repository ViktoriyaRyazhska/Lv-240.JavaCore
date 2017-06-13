
public class OneTwo3 {

	public static void main(String[] args) {
		Thread one = new Thread() {
			public void run() {
				
				System.out.println("Thread one is alive");
				
				Thread two = new Thread() {
					public void run() {
						
						for (int i = 0; i < 3; i++) {
							System.out.println("Thread 2 running");
						}
						
						Thread three = new Thread() {
							public void run() {
								for (int i = 0; i < 5; i++) {
									System.out.println("Thread 3 running");
								}
							}
						};
						
						three.start();
						
					}
				};
				
				two.run();
			}
		};

		one.start();
		
	}
}
