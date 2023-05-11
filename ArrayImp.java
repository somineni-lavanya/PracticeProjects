package package2;

public class ArrayImp {

	public static void main(String[] args) {

		int[] a = new int[5];

		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		System.out.println("The array consists of :");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}

		System.out.println("The sum of the elements in the array is: " + sum);

		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		System.out.println("The maximum value in the array is: " + max);
	}

}
