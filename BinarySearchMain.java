package pack;

public class BinarySearchMain {

	
		

			public static void main(String[] args) {
				int arr[] = { 10, 20, 25,30, 40, 50, 77 };

				int key = 30;

				int indexOfKey = binarySearch(arr, 0, arr.length, key);

				if (indexOfKey != -1)
					System.out.println(key + " was found in index position " + indexOfKey);
				else
					System.out.println(key + " was not found");

			}

			static int binarySearch(int[] arr, int start, int end, int key) {

				int midValue = (start + end) / 2;

				while (start <= end) {

					if (key > arr[midValue]) {
						start = midValue + 1;				
					}
					else
					if (arr[midValue] == key)
						return midValue;
					else  {
						end = midValue - 1;
					}
					;

					midValue = (start + end) / 2;

				}
				// if we are here that means the key was not found.

				return -1;
			
	}

}
