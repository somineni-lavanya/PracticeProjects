package demopack;

class MyException extends Exception {
	public MyException(String s) {
		super(s);
	}
}

public class CustomExceptions {

	public static void main(String args[]) {
		try {
			throw new MyException("Exception");
		} catch (MyException ex) {
			System.out.println("Caught");
			System.out.println(ex.getMessage());
		}
	}
}
