package org.manjunath.algorithms.sorting;

public class IntegerMergeSort {
	
	public void mergeSort(int[] array) {
		if (array == null)
			return;
		
		if (array.length > 1) {
			int mid = array.length / 2;
			
			int[] leftArr = new int[mid];
			int[] rightArr = new int[array.length - mid];
			
			for (int i = 0; i < mid; i++)
				leftArr[i] = array[i];
			
			for (int i = mid; i < array.length; i++)
				rightArr[i-mid] = array[i];
			
			mergeSort(leftArr);
			mergeSort(rightArr);
			merge(array, leftArr, rightArr);
		}
		
	}
	
	private void merge(int[] array, int[] left, int[] right) {
		int leftLength = left.length;
		int rightLength = right.length;
		int i = 0, j = 0, k = 0;
		
		while (i < leftLength && j < rightLength) {
			if (left[i] <= right[j]) {
				array[k] = left[i];
				i++;
			} else  {
				array[k] = right[j];
				j++;
			}
			k++;
		}
		
		while (i < leftLength) {
			array[k] = left[i];
			i++;
			k++;
		}
		
		while (j < rightLength) {
			array[k] = right[j];
			j++;
			k++;
		}
	}
}
