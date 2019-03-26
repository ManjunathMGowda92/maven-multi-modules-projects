package org.manjunath.algorithms.sorting;

/**
 * StringQuickSortBasedOnLengthAndCharacters sorts the String array based on
 * length and characters.
 * 
 * If two strings are with same length then the sorting will be done based on
 * Characters.
 * 
 * @author Manjunath HM
 *
 */
public class StringQuickSortBasedOnLengthAndCharacters {
	
	public void quickSort(String[] array, int start, int end) {
		//if start index is greater than end index then simply return
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
		//assign start index as partitionIndex.
		int partitionIndex = start;
		//assign array end index element to pivot element.
		String pivot = array[end];

		// iterate through the array from start to end index.
		for (int i = start; i < end; i++) {
			
			if (array[i].length() < pivot.length()) {
				/*
				 * if the array i-th element length is less than pivot element length,
				 * then swap the i-th element with the partition index element and 
				 * increase the partitionIndex.
				 */
				String temp = array[partitionIndex];
				array[partitionIndex] = array[i];
				array[i] = temp;
				partitionIndex++;

			} else if (array[i].length() == pivot.length()) {
				/*
				 * if the array i-th element length is equal to the pivot element length,
				 * then swap the array elements by using the compareTo method of String class,
				 * and increase the partitionIndex
				 */
				if (array[i].compareTo(pivot) <= 0) {
					String temp = array[partitionIndex];
					array[partitionIndex] = array[i];
					array[i] = temp;
					partitionIndex++;
				}
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
