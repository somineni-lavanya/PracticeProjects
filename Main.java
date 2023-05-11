package package2;

public class Main {
	public static void main(String[] args) {
		Outerclass outer1 = new Outerclass();
		
		Outerclass.Inner inner1 = outer1.new Inner();
		
		inner1.hello();

	}

}