

	public class ThreeThreads extends Thread {
		private int number;
		private int pause;
		private String message;
		private int counter;

		public ThreeThreads(int number, int pause, String message, int counter) {
			this.number = number;
			this.pause = pause;
			this.message = message;
			this.counter = counter;
		}

		@Override
		public void run() {
			for (int i = 0; i < counter; i++) {
				try {
					sleep(pause);
				} catch (InterruptedException e) {
				}
				System.out.println(message + " " + number);
			}
		}
	}

