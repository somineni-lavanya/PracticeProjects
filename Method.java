package package2;

public class Method {

	public int add(int a, int b) {
		return a + b;
	}

	public String getGreeting() {
		return "Good morning!";
	}

	public void Wishes() {
		System.out.println("Hello!");
	}

	public static void main(String[] args) {
		Method M1 = new Method();
		int sum = M1.add(5, 3);
		System.out.println("Sum: " + sum);
		String greeting = M1.getGreeting();
		System.out.println("Greeting: " + greeting);
		M1.Wishes();

	}

}
