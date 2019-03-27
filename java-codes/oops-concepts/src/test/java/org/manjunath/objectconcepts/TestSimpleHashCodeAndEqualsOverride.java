package org.manjunath.objectconcepts;

import org.manjunath.documentation.TestCase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestSimpleHashCodeAndEqualsOverride {
	
	@Test(testName = "testTwoObjectsEqual")
	@TestCase(Author = "Manjunath HM", 
			testCaseDescription = "To Check the objects are equal or not by using overriden equals method",
			expectedResult = "Objects should be equal")
	public void testTwoObjectsEqual() {
		Reporter.log("TestSimpleHashCodeAndEqualsOverride: Start of testTwoObjectsEqual() method", true);
		
		try {
			SimpleHashCodeAndEqualsOverride sample1 = new SimpleHashCodeAndEqualsOverride();
			SimpleHashCodeAndEqualsOverride sample2 = new SimpleHashCodeAndEqualsOverride();
			
			Assert.assertEquals(sample1.equals(sample2), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestSimpleHashCodeAndEqualsOverride: End of testTwoObjectsEqual() method", true);
	}
	
	@Test(testName = "testTwoObjectsEqual2")
	@TestCase(Author = "Manjunath HM", 
			testCaseDescription = "To Check the objects are equal or not by using overriden equals method, by setting some object properties",
			expectedResult = "Objects should be equal")
	public void testTwoObjectsEqual2() {
		Reporter.log("TestSimpleHashCodeAndEqualsOverride: Start of testTwoObjectsEqual2() method", true);
		
		try {
			SimpleHashCodeAndEqualsOverride sample1 = new SimpleHashCodeAndEqualsOverride();
			SimpleHashCodeAndEqualsOverride sample2 = new SimpleHashCodeAndEqualsOverride();
			
			sample1.setsBoolean(true);
			sample2.setsBoolean(true);
			
			Assert.assertEquals(sample1.equals(sample2), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestSimpleHashCodeAndEqualsOverride: End of testTwoObjectsEqual2() method", true);
	}
	
	@Test(testName = "testTwoObjectsEqual3")
	@TestCase(Author = "Manjunath HM", 
			testCaseDescription = "To Check the objects are equal or not by using overriden equals method, by setting some object properties",
			expectedResult = "Objects should be equal")
	public void testTwoObjectsEqual3() {
		Reporter.log("TestSimpleHashCodeAndEqualsOverride: Start of testTwoObjectsEqual3() method", true);
		
		try {
			SimpleHashCodeAndEqualsOverride sample1 = new SimpleHashCodeAndEqualsOverride();
			SimpleHashCodeAndEqualsOverride sample2 = new SimpleHashCodeAndEqualsOverride();
			
			sample1.setsByte((byte)111);
			sample2.setsByte((byte)111);
			
			Assert.assertEquals(sample1.equals(sample2), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestSimpleHashCodeAndEqualsOverride: End of testTwoObjectsEqual3() method", true);
	}
	
	@Test(testName = "testTwoObjectsEqual4")
	@TestCase(Author = "Manjunath HM", 
			testCaseDescription = "To Check the objects are equal or not by using overriden equals method, by setting some object properties",
			expectedResult = "Objects should be equal")
	public void testTwoObjectsEqual4() {
		Reporter.log("TestSimpleHashCodeAndEqualsOverride: Start of testTwoObjectsEqual4() method", true);
		
		try {
			SimpleHashCodeAndEqualsOverride sample1 = new SimpleHashCodeAndEqualsOverride();
			SimpleHashCodeAndEqualsOverride sample2 = new SimpleHashCodeAndEqualsOverride();
			
			sample1.setsBoolean(true);
			sample1.setsByte((byte)111);
			sample1.setsShort((short)7654);
			sample1.setsInt(123);
			sample1.setsLong(1765);
			sample1.setsFloat(8.6543f);
			sample1.setsDouble(7.654);
			sample1.setsString("sample");
			
			sample2.setsBoolean(true);
			sample2.setsByte((byte)111);
			sample2.setsShort((short)7654);
			sample2.setsInt(123);
			sample2.setsLong(1765);
			sample2.setsFloat(8.6543f);
			sample2.setsDouble(7.654);
			sample2.setsString("sample");
			
			Assert.assertEquals(sample1.equals(sample2), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestSimpleHashCodeAndEqualsOverride: End of testTwoObjectsEqual4() method", true);
	}
	
	@Test(testName = "testSameObjectEqualToItSelf")
	@TestCase(Author = "Manjunath HM", 
			testCaseDescription = "To Check the objects are equal or not by using overriden equals method",
			expectedResult = "Objects should be equal when compared with same object")
	public void testSameObjectEqualToItSelf() {
		Reporter.log("TestSimpleHashCodeAndEqualsOverride: Start of testSameObjectEqualToItSelf() method", true);
		
		try {
			SimpleHashCodeAndEqualsOverride sample1 = new SimpleHashCodeAndEqualsOverride();
			sample1.setsBoolean(true);
			sample1.setsByte((byte)111);
			sample1.setsShort((short)7654);
			sample1.setsInt(123);
			sample1.setsLong(1765);
			sample1.setsFloat(8.6543f);
			sample1.setsDouble(7.654);
			sample1.setsString("sample");
			
			Assert.assertEquals(sample1.equals(sample1), true);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestSimpleHashCodeAndEqualsOverride: End of testSameObjectEqualToItSelf() method", true);
	}
	
	
	@Test(testName = "testTwoObjectsNotEqual")
	@TestCase(Author = "Manjunath HM", 
			testCaseDescription = "To Check the objects are equal or not by using overriden equals method, by setting some object properties",
			expectedResult = "Objects should be unequal")
	public void testTwoObjectsNotEqual() {
		Reporter.log("TestSimpleHashCodeAndEqualsOverride: Start of testTwoObjectsNotEqual() method", true);
		
		try {
			SimpleHashCodeAndEqualsOverride sample1 = new SimpleHashCodeAndEqualsOverride();
			SimpleHashCodeAndEqualsOverride sample2 = new SimpleHashCodeAndEqualsOverride();
			
			sample1.setsByte((byte)111);
			sample2.setsInt((byte)111);
			
			Assert.assertEquals(sample1.equals(sample2), false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestSimpleHashCodeAndEqualsOverride: End of testTwoObjectsNotEqual() method", true);
	}
	
	@Test(testName = "testTwoObjectsNotEqual2")
	@TestCase(Author = "Manjunath HM", 
			testCaseDescription = "To Check the objects are equal or not by using overriden equals method, by setting some object properties",
			expectedResult = "Objects should be unequal")
	public void testTwoObjectsNotEqual2() {
		Reporter.log("TestSimpleHashCodeAndEqualsOverride: Start of testTwoObjectsNotEqual2() method", true);
		
		try {
			SimpleHashCodeAndEqualsOverride sample1 = new SimpleHashCodeAndEqualsOverride();
			SimpleHashCodeAndEqualsOverride sample2 = new SimpleHashCodeAndEqualsOverride();
			
			sample1.setsBoolean(true);
			sample2.setsBoolean(false);
			
			Assert.assertEquals(sample1.equals(sample2), false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestSimpleHashCodeAndEqualsOverride: End of testTwoObjectsNotEqual2() method", true);
	}
	
	@Test(testName = "testCompareNullWithObject")
	@TestCase(Author = "Manjunath HM", 
			testCaseDescription = "To Check the objects are equal or not by using overriden equals method",
			expectedResult = "Objects should be unequal when compared with null")
	public void testCompareNullWithObject() {
		Reporter.log("TestSimpleHashCodeAndEqualsOverride: Start of testCompareNullWithObject() method", true);
		
		try {
			SimpleHashCodeAndEqualsOverride sample1 = new SimpleHashCodeAndEqualsOverride();
			SimpleHashCodeAndEqualsOverride sample2 = null;
			
			Assert.assertEquals(sample1.equals(sample2), false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestSimpleHashCodeAndEqualsOverride: End of testCompareNullWithObject() method", true);
	}
	
	@Test(testName = "testTwoObjectsNotEqual3")
	@TestCase(Author = "Manjunath HM", 
			testCaseDescription = "To Check the objects are equal or not by using overriden equals method, by setting some object properties",
			expectedResult = "Objects should be unequal")
	public void testTwoObjectsNotEqual3() {
		Reporter.log("TestSimpleHashCodeAndEqualsOverride: Start of testTwoObjectsNotEqual3() method", true);
		
		try {
			SimpleHashCodeAndEqualsOverride sample1 = new SimpleHashCodeAndEqualsOverride();
			SimpleHashCodeAndEqualsOverride sample2 = new SimpleHashCodeAndEqualsOverride();
			
			sample1.setsBoolean(true);
			sample1.setsByte((byte)111);
			sample1.setsShort((short)7654);
			sample1.setsInt(123);
			sample1.setsLong(123765);
			sample1.setsFloat(8.6543f);
			sample1.setsDouble(7.654);
			sample1.setsString("sample");
			
			sample2.setsBoolean(true);
			sample2.setsByte((byte)11);
			sample2.setsShort((short)7654);
			sample2.setsInt(123);
			sample2.setsLong(17165);
			sample2.setsFloat(8.65243f);
			sample2.setsDouble(7.6654);
			sample2.setsString("sample");
			
			Assert.assertEquals(sample1.equals(sample2), false);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestSimpleHashCodeAndEqualsOverride: End of testTwoObjectsNotEqual3() method", true);
	}
}
