package demopack;

//PolyMorphism
public class MultiplicationDemo {

	static int Mul(int a, int b) {

		return a * b;
	}

	static int Mul(int a, int b, int c) {

		return a * b * c;
	}

	public static void main(String[] args) {

		System.out.println(MultiplicationDemo.Mul(2, 7));
		System.out.println(MultiplicationDemo.Mul(2, 7, 3));
	}
}


