package demopack;


	public class MyRunnableThread implements Runnable {
	    @Override
	    public void run() {
	        
	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Thread: " + i);
	            try {
	                Thread.sleep(1000); // Pause the thread for 1 second
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }

	    public static void main(String[] args) {
	        MyRunnableThread myRunnable = new MyRunnableThread();
	        Thread thread = new Thread(myRunnable);
	        thread.start();

	        // Code in the main thread
	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Main: " + i);
	            try {
	                Thread.sleep(1000); // Pause the main thread for 1 second
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }}
	


