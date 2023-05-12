package demopack;

public class MyThread extends Thread {
	@Override
	    public void run() {
	       
	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Thread: " + i);
	            try {
	                Thread.sleep(1000); // Pause the thread for 1 second
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    }

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();

		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Main: " + i);
			try {
				Thread.sleep(1000); // Pause the main thread for 1 second
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


