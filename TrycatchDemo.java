package demopack;

public class TrycatchDemo {
	public static void main(String[] args) {
		try {
			int data = 5 / 0; // may throw exception
		}

		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}

}
