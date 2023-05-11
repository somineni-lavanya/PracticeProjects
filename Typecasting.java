package package2;

public class Typecasting {

	public static void main(String[] args) {
		System.out.println("Implicit Type Casting");

		char a = 'A';

		System.out.println("Value of a: " + a);

		int y = a; // implicit type casting

		System.out.println("Value of y: " + y);

		float c = a;
		System.out.println("Value of c: " + c);
		long d = a;
		System.out.println("Value of d: " + d);
		double e = a;
		System.out.println("Value of e: " + e);

		byte byte1 = 86;
		System.out.println("Value of byte1: " + byte1);
		char char1 = (char) byte1;
		System.out.println("Value of char1: " + char1);

		System.out.println("\n");

		System.out.println("");
		System.out.println("Explicit Type Casting");

		long long1 = 10000000034464664L;
		System.out.println("Value of long1: " + long1);

		int y1 = (int) long1;
		System.out.println("Value of y1: " + y1);

	}

}
