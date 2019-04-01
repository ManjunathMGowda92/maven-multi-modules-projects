package org.manjunath.algorithms.sorting;

import org.manjunath.documentation.TestCase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestIntegerMergeSort {
	private IntegerMergeSort sort;
	
	@BeforeClass
	public void doInitialization() {
		sort = new IntegerMergeSort();
	}
	
	@Test(testName = "testIntegerMergeSort1")
	@TestCase(Author = "Manjunath HM",
			testCaseDescription = "To test the merge sort functionality for integers",
			expectedResult = "Input array should be sorted")
	public void testIntegerMergeSort1() {
		Reporter.log("TestIntegerMergeSort: Start of testIntegerMergeSort1() method", true);
		
		int[] actualArr = {8, 3, 6, 1, 7, 9, 2, 4, 5};
		int[] expectedArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		try {
			sort.mergeSort(actualArr);
			
			Assert.assertEquals(actualArr, expectedArr);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred"+e, true);
			Assert.fail(e.getMessage());
		} catch (Exception e) {
			Reporter.log("Exception occurred"+e, true);
			Assert.fail(e.getMessage());
		}
		Reporter.log("TestIntegerMergeSort: End of testIntegerMergeSort1() method", true);
	}
}
