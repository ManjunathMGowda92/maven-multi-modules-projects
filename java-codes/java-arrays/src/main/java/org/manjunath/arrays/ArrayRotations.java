package org.manjunath.arrays;

public class ArrayRotations {

	/**
	 * Rotate the array elements in left direction.
	 * <p>
	 * Ex: <blockquote>Input Array : {1, 2, 3, 4, 5, 6} and rotation is 4, then
	 * rotation will be as follows <br>
	 * First Rotation: {2, 3, 4, 5, 6, 1} <br>
	 * Second Rotation: {3, 4, 5, 6, 1, 2} <br>
	 * Third Rotation : {4, 5, 6, 1, 2, 3} <br>
	 * Fourth Rotation : {5, 6, 1, 2, 3, 4} <br>
	 * Output will be {5, 6, 1, 2, 3, 4} </blockquote>
	 * </p>
	 * 
	 * @param arr            Integer array
	 * @param rotationLength Number of times the array has to be rotated.
	 */
	public void rotateLeft(int[] arr, int rotationLength) {
		if (rotationLength < 0)
			throw new RuntimeException("Rotation should not be negative");
		// create two temporary arrays with rotation length and (arr_length - rotation
		// length)
		int[] temp1 = new int[rotationLength];
		int[] temp2 = new int[arr.length - rotationLength];

		for (int i = 0; i < rotationLength; i++)
			temp1[i] = arr[i];

		for (int i = rotationLength; i < arr.length; i++)
			temp2[i - rotationLength] = arr[i];

		for (int i = 0; i < temp2.length; i++)
			arr[i] = temp2[i];
		int i = temp2.length;
		while (i < arr.length) {
			arr[i] = temp1[i - temp2.length];
			i++;
		}
	}

	/**
	 * Rotate the array elements in right direction.
	 * <p>
	 * Ex: <blockquote>Input Array : {1, 2, 3, 4, 5, 6} and rotation is 4, then
	 * rotation will be as follows <br>
	 * First Rotation: {6, 1, 2, 3, 4, 5} <br>
	 * Second Rotation: {5, 6, 1, 2, 3, 4} <br>
	 * Third Rotation : {4, 5, 6, 1, 2, 3} <br>
	 * Fourth Rotation : {3, 4, 5, 6, 1, 2} <br>
	 * Output will be {3, 4, 5, 6, 1, 2} </blockquote>
	 * </p>
	 * 
	 * @param arr      Integer array
	 * @param rotation Number of times the array has to be rotated
	 */
	public void rotateRight(int[] arr, int rotation) {
		if (rotation < 0)
			throw new RuntimeException("Rotation should not be negative");
		int firstLength = arr.length - rotation;

		int[] firstHalf = new int[firstLength];
		int[] secondHalf = new int[rotation];

		for (int i = firstLength; i < arr.length; i++)
			secondHalf[i - firstLength] = arr[i];

		for (int i = 0; i < (arr.length - rotation); i++)
			firstHalf[i] = arr[i];

		for (int i = 0; i < secondHalf.length; i++)
			arr[i] = secondHalf[i];

		for (int i = rotation; i < arr.length; i++) {
			arr[i] = firstHalf[i - rotation];
		}

	}

	/**
	 * Method to print the elements of array
	 * 
	 * @param arr Integer array
	 */
	public void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
