package org.manjunath.algorithms.sorting;

public class StringQuickSortOnLength {

	public void quickSort(String[] array, int start, int end) {
		// if start index is greater than end index, then simply return
		if (start > end)
			return;

		/*
		 * if start index is less than or equal to the end index, then do the following
		 * things. 
		 * 1. get the partition Index for further processing. 
		 * 2. Call quick sort function recursively for the array from start to partitionIndex-1 elements.
		 * 3. Call quick sort function recursively for the array from partitionIndex+1 to end elements.
		 * 
		 */
		if (start <= end) {
			int partitionIndex = getPartitionIndex(array, start, end);
			quickSort(array, start, partitionIndex - 1);
			quickSort(array, partitionIndex + 1, end);
		}
	}

	private int getPartitionIndex(String[] array, int start, int end) {
		//assign array end index element to pivot element.
		String pivot = array[end];
		//assign start index as partitionIndex.
		int partitionIndex = start;

		// iterate through the array from start to end index.
		for (int i = start; i < end; i++) {
			
			//compare the ith index of array element length with the pivot element length.
			//if i-th element length is less than the pivot element length, then below if condition works
			if (array[i].length() <= pivot.length()) {
				
				//swap the ith element with the partitionIndex element of array.
				String temp = array[i];
				array[i] = array[partitionIndex];
				array[partitionIndex] = temp;

				//increment the patitionIndex
				partitionIndex++;
			}
		}

		//Swap the paritionIndex element with the end element of array
		String temp = array[partitionIndex];
		array[partitionIndex] = array[end];
		array[end] = temp;

		//return partitionIndex
		return partitionIndex;
	}
}
