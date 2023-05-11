package package2;

public class StringEx {

	public static void main(String[] args) {

		String str = "Hi, Welcome to Strings!";

		StringBuffer stringbuffer = new StringBuffer(str);// Converting  string to StringBuffer

		StringBuilder stringbuilder = new StringBuilder(str); // Converting string to StringBuilder

		System.out.println("String: " + str);
		System.out.println("StringBuffer: " + stringbuffer);
		System.out.println("StringBuilder: " + stringbuilder);
	}
}
