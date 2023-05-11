package package2;

public class Constructor {

	private int id;
	private String name;

	// Default constructor
	public Constructor() {
		this.id = 0;
		this.name = "Unknown";
	}

	// Parameterized constructor
	public Constructor(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {

		Constructor obj1 = new Constructor();
		System.out.println("ID: " + obj1.id + " Name: " + obj1.name);

		Constructor obj2 = new Constructor(1, "John");
		System.out.println("ID: " + obj2.id + " Name: " + obj2.name);

	}

}
