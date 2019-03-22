package org.manjunath.datastructures;

import org.manjunath.documentation.TestCase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestIntegerQuickSort {
	private IntegerQuickSort sort;
	
	@BeforeClass
	public void doInitialization() {
		sort = new IntegerQuickSort();
	}
	
	@Test(testName = "testIntegerSort")
	@TestCase(Author = "Manjunath HM",
			testCaseDescription = "to test whether the array of integers are sorted or not",
			expectedResult = "Input array should be sorted properly")
	public void testIntegerSort() {
		Reporter.log("TestIntegerQuickSort: Start of testIntegerSort() method", true);
		int[] aArr = {7, 4, 9, 2, 6, 1, 3};
		int[] eArr = {1, 2, 3, 4, 6, 7, 9};
		
		try {
			sort.quickSort(aArr, 0, aArr.length -1);
			Assert.assertEquals(aArr, eArr);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestIntegerQuickSort: End of testIntegerSort() method", true);
	}

}
