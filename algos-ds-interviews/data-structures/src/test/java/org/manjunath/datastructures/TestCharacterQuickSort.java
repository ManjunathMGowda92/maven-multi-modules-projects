package org.manjunath.datastructures;

import org.manjunath.documentation.TestCase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCharacterQuickSort {
	private CharacterQuickSort quickSort;

	@BeforeClass
	public void doInitialization() {
		quickSort = new CharacterQuickSort();
	}

	@Test(testName = "testCharacterArraySorting")
	@TestCase(Author = "Manjunath HM",
			testCaseDescription = "to test whether the array of Characters are sorted or not",
			expectedResult = "Array should be sorted properly")
	public void testCharacterArraySorting() {
		Reporter.log("TestCharacterQuickSort: Start of testCharacterArraySorting() method", true);
		
		char[] aArr = {'h','g','f','e','d','c','b','a'};
		char[] eArr = {'a','b','c','d','e','f','g','h'};
		try {
			quickSort.quickSort(aArr, 0, aArr.length-1);
			Assert.assertEquals(aArr, eArr);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: " + e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: " + e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestCharacterQuickSort: End of testCharacterArraySorting() method", true);
	}
}
