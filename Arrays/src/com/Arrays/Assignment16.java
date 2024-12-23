// Create a program that merges two sorted arrays into a single sorted array.
package com.Arrays;

public class Assignment16 {
	public static void main(String[] args) {
		int[] array1 = { 1, 3, 5, 7 };
		int[] array2 = { 2, 4, 6, 8 };

		int[] mergedArray = mergeSortedArrays(array1, array2);

		System.out.println("Merged sorted array:");
		printArray(mergedArray);
	}

	public static int[] mergeSortedArrays(int[] array1, int[] array2) {
		int[] mergedArray = new int[array1.length + array2.length];

		int i = 0, j = 0, k = 0;

		while (i < array1.length && j < array2.length) {
			if (array1[i] < array2[j]) {
				mergedArray[k++] = array1[i++];
			} else {
				mergedArray[k++] = array2[j++];
			}
		}

		while (i < array1.length) {
			mergedArray[k++] = array1[i++];
		}

		while (j < array2.length) {
			mergedArray[k++] = array2[j++];
		}

		return mergedArray;
	}

	public static void printArray(int[] array) {
		for (int element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
