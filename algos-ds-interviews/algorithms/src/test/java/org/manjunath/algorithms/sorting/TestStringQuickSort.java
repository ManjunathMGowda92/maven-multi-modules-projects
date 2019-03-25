package org.manjunath.algorithms.sorting;

import org.manjunath.documentation.TestCase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestStringQuickSort {
	private StringQuickSort sort;
	
	@BeforeClass
	public void doInitialization() {
		sort = new StringQuickSort();
	}
	
	@Test(testName = "testStringQuickSort1")
	@TestCase(Author = "Manjunath HM",
				testCaseDescription = "To test the sorting on String array based on characters",
				expectedResult = "Array should be sorted properly")	
	public void testStringQuickSort1() {
		Reporter.log("TestStringQuickSort: Start of testStringQuickSort1() method", true);
		
		String[] actualArray = {"def", "xyz", "abc", "aaa", "acb", "acd", "abcd", "lmn", "pqrstu"};
		String[] expectedArray = {"aaa", "abc", "abcd", "acb", "acd", "def", "lmn", "pqrstu", "xyz"};
		try {
			sort.quickSort(actualArray, 0, actualArray.length-1);
			Assert.assertEquals(actualArray, expectedArray);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e,  true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e,  true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestStringQuickSort: Start of testStringQuickSort1() method", true);
	}
}
