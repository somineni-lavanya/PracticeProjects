package com;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 8, 6, 7, 3, 9, };
		int k = 5;
		rotateArrayByKPositions(arr, k);
	}

	private static void rotateArrayByKPositions(int[] arr, int k) {
		int n = arr.length;
		// case:when rotation is more than the size of the array.
		if (k > 1)
			k = k % n;
		// result array
		int[] result = new int[n];

		for (int i = 0; i < k; i++) {
			result[i] = arr[n - k + i];
		}
		;

		// append the starting elements of the original array // in the n-k positions of
		// result array
		int j = 0;
		for (int i = k; i < result.length; i++) {
			result[i] = arr[j++];
		}
		;
		System.out.println(Arrays.toString(result));
		System.arraycopy(result, 0, arr, 0, arr.length);
	}
}
