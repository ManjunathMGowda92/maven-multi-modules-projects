package org.manjunath.algorithms.sorting;

import org.manjunath.documentation.TestCase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestStringQuickSortBasedOnLengthAndCharacters {
	private StringQuickSortBasedOnLengthAndCharacters sort;
	
	@BeforeClass
	public void doInitialization() {
		sort = new StringQuickSortBasedOnLengthAndCharacters();
	}
	
	@Test(testName = "testStringQuickSortBasedOnLengthAndCharacters1")
	@TestCase(Author = "Manjunath HM", 
			testCaseDescription = "To sort the String array based on length and characters comparision",
			expectedResult = "Array elements should be sorted based on length and characters")
	public void testStringQuickSortBasedOnLengthAndCharacters1() {
		Reporter.log("TestStringQuickSortBasedOnLengthAndCharacters: Start of testStringQuickSortBasedOnLengthAndCharacters1() method", true);
		
		String[] actualArray = {"asd", "aa", "a", "b", "hij", "def", "xyz", "lmno", "pqrstu", "ss", "kk", "h", "tyu"};
		String[] expectedArray = {"a", "b", "h", "aa", "kk", "ss", "asd", "def", "hij", "tyu", "xyz", "lmno", "pqrstu"};
		try {
			sort.quickSort(actualArray, 0, actualArray.length - 1);
			Assert.assertEquals(actualArray, expectedArray);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestStringQuickSortBasedOnLengthAndCharacters: End of testStringQuickSortBasedOnLengthAndCharacters1() method", true);
	}
	
}
