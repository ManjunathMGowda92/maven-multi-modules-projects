package org.manjunath.algorithms.sorting;

import org.manjunath.documentation.TestCase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestStringQuickSortOnLength {
	private StringQuickSortOnLength sort;
	
	@BeforeClass
	public void doInitialization() {
		sort = new StringQuickSortOnLength();
	}
	
	@Test(testName = "testStringQuickSortOnLength1")
	@TestCase(Author = "Manjunath HM",
			testCaseDescription = "To test the sorting of strings based on the length",
			expectedResult = "Array should be sorted based on the length of elements")
	public void testStringQuickSortOnLength1() {
		Reporter.log("TestStringQuickSortOnLength: Start of testStringQuickSortOnLength1() method", true);
		
		String[] actualArray = {"def", "xyz", "ab", "a", "acd", "abcd", "lmnop", "pqrstu", "ss"};
		String[] expectedArray = {"a", "ab", "ss", "xyz", "acd", "def", "abcd", "lmnop", "pqrstu"};
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
		
		Reporter.log("TestStringQuickSortOnLength: Start of testStringQuickSortOnLength1() method", true);
	}

}
