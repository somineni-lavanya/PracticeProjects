package demopack;

public class FinallyDemo {
	public static void main(String args[]) {
		try {
			System.out.println("Inside try block");
			// below code throws divide by zero exception
			int data = 2 / 0;
			System.out.println(data);
		}

		catch (ArithmeticException e) {
			System.out.println("Exception handled");
			System.out.println(e);
		}

		finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
	}
}
