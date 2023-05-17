package com;

import java.util.Arrays;

public class SmallestElement {

	public static void main(String[] args) {
		// Order Statistics demo
		// Finding the kth smallest

		int[] arr = { 15, 16, 6, 34, 7, 3, 12 };

		int k = 4;

		System.out.println("GIVEN ARRAY: " + Arrays.toString(arr));

		System.out.println(printKthSmallest(arr, k));

	}

	private static int printKthSmallest(int[] arr, int k) {
		if (arr == null || arr.length < k)
			throw new IllegalArgumentException("Invalid input");

		return quickselect(arr, 0, arr.length - 1, k - 1);

	}

	private static int quickselect(int[] arr, int left, int right, int k) {

		// base case
		// array has only one element
		if (left == right)
			return arr[left];

		int pivotIndex = partition(arr, left, right);

		if (pivotIndex == k)
			return arr[pivotIndex];

		else if (k < pivotIndex) // process the left partition
			return quickselect(arr, left, pivotIndex - 1, k);
		else
			return quickselect(arr, pivotIndex + 1, right, k);
	}

	private static int partition(int[] arr, int left, int right) {
		int pivotIndex = left;
		int pivotValue = arr[right];

		for (int i = left; i < right; i++) {
			if (arr[i] < pivotValue) {
				swap(arr, i, pivotIndex);
				pivotIndex++;
			}
		}
		swap(arr, pivotIndex, right);
		return pivotIndex;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
