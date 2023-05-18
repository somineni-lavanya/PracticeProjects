package pack;

import java.util.Arrays;

public class MergeSort {

	public static void mergeSort(int[] array) {
		if (array.length < 2) {
			return;
		}

		int mid = array.length / 2;
		int[] leftArray = new int[mid];
		int[] rightArray = new int[array.length - mid];

		
		for (int i = 0; i < mid; i++) {
			leftArray[i] = array[i];
		}
		for (int i = mid; i < array.length; i++) {
			rightArray[i - mid] = array[i];
		}

		
		mergeSort(leftArray);
		mergeSort(rightArray);

		
		merge(leftArray, rightArray, array);
	}

	public static void merge(int[] leftArray, int[] rightArray, int[] mergedArray) {
		int leftSize = leftArray.length;
		int rightSize = rightArray.length;
		int i = 0, j = 0, k = 0;

		while (i < leftSize && j < rightSize) {
			if (leftArray[i] <= rightArray[j]) {
				mergedArray[k++] = leftArray[i++];
			} else {
				mergedArray[k++] = rightArray[j++];
			}
		}

		while (i < leftSize) {
			mergedArray[k++] = leftArray[i++];
		}

		while (j < rightSize) {
			mergedArray[k++] = rightArray[j++];
		}
	}

	public static void main(String[] args) {
		int[] array = { 9, 5, 1, 3, 8, 4, 2, 7, 6 };

		System.out.println("Original array: " + Arrays.toString(array));
		mergeSort(array);
		System.out.println("Sorted array: " + Arrays.toString(array));
	}
}
