package demopack;

public class SleepWaitMethod {
	public static void main(String[] args) {
		Thread sleepThread = new SleepThread();
		Thread waitThread = new WaitThread();

		sleepThread.start();
		waitThread.start();
	}

	static class SleepThread extends Thread {
		@Override
		public void run() {
			try {
				System.out.println("SleepThread: Started");
				Thread.sleep(5000); // Sleep for 2 seconds
				System.out.println("SleepThread: Awake after sleeping");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	static class WaitThread extends Thread {
		@Override
		public void run() {
			synchronized (this) {
				System.out.println("WaitThread: Started");
				try {
					wait(2000); // Wait for 2 seconds
					System.out.println("WaitThread: Awake after waiting");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
