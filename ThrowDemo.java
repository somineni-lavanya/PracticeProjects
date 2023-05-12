package demopack;

public class ThrowDemo {

	public static void main(String[] args) {
		int age = 19;
		try {
			if (age < 18) {
				throw new ArithmeticException("Invalid age!");
			}
			System.out.println("You are eligible to vote!");
		} catch (ArithmeticException ex) {
			System.out.println("Exception caught: " + ex.getMessage());
		}
	}
}
