package org.manjunath.datastructures;

public class CharacterQuickSort {

	public void quickSort(char[] array, int start, int end) {
		// if the start index greater than end index then return
		if (start > end)
			return;

		// if start index less than or equal to end index, then do the following things
		// 1. get partition index
		// 2. recursively call quick sort function from start index to partition index
		// 3. recursively call quick sort function from partition index +1 to end index
		if (start <= end) {
			int partitionIndex = getPartitionIndex(array, start, end);
			quickSort(array, start, partitionIndex - 1);
			quickSort(array, partitionIndex + 1, end);
		}

	}

	private int getPartitionIndex(char[] array, int start, int end) {
		//assign start index as partitionIndex
		int partitionIndex = start;
		
		//assign end element of array as pivot element
		char pivot = array[end];

		//loop through the elements from start index to end index
		for (int i = start; i < end; i++) {
			
			//if array i-th index element less than or equal to pivot element
			// then swap the ith element with partitionIndex element
			// also increment the partitionIndex
			if (array[i] <= pivot) {
				char temp = array[partitionIndex];
				array[partitionIndex] = array[i];
				array[i] = temp;

				partitionIndex++;
			}
		}

		//swap partitionIndex element with the end element[pivot element]
		char temp = array[end];
		array[end] = array[partitionIndex];
		array[partitionIndex] = temp;

		//return partitionIndex
		return partitionIndex;
	}
}
