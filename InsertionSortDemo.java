package pack;

import java.util.Arrays;

public class InsertionSortDemo {

	public static void main(String[] args) {
		int[] arr = { 9, 6, 77, 1, 2, 46, 5 };

		System.out.println("GIVEN ARRAY : " + Arrays.toString(arr));

		insertionSort(arr);

		System.out.println("SORTED ARRAY : " + Arrays.toString(arr));

	}

	private static void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			int temp = arr[i];
			int j = i - 1;

			while (j>-1 && temp < arr[j]) {
				// swap 
				arr[j+1]=arr[j];
				arr[j] = temp;
				j--;
			}

		}

	}



	}


