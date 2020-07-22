package org.manjunath.arrays;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArrayRotationsTest {
	private ArrayRotations arrayRotate;

	@BeforeClass
	public void doInitialization() {
		arrayRotate = new ArrayRotations();
	}

	@Test(testName = "test_rotateLeft_1", alwaysRun = true)
	public void test_rotateLeft_1() {
		Reporter.log("ArrayRotationsTest: Start of test_rotateLeft_1() method", true);
		int[] actualArr = { 1, 2, 3, 4, 5, 6 };
		int[] expectedArr = { 5, 6, 1, 2, 3, 4 };
		arrayRotate.rotateLeft(actualArr, 4);

		assertEquals(actualArr, expectedArr);
		Reporter.log("ArrayRotationsTest: End of test_rotateLeft_1() method", true);
	}

	@Test(testName = "test_rotateLeft_2", alwaysRun = true)
	public void test_rotateLeft_2() {
		Reporter.log("ArrayRotationsTest: Start of test_rotateLeft_2() method", true);
		int[] actualArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] expectedArr = { 3, 4, 5, 6, 7, 8, 9, 1, 2 };
		arrayRotate.rotateLeft(actualArr, 2);

		assertEquals(actualArr, expectedArr);
		Reporter.log("ArrayRotationsTest: End of test_rotateLeft_2() method", true);
	}

	@Test(testName = "test_rotateRight_1", alwaysRun = true)
	public void test_rotateRight_1() {
		Reporter.log("ArrayRotationsTest: Start of test_rotateRight_1() method", true);
		int[] actualArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] expectedArr = { 8, 9, 1, 2, 3, 4, 5, 6, 7 };
		arrayRotate.rotateRight(actualArr, 2);

		assertEquals(actualArr, expectedArr);
		Reporter.log("ArrayRotationsTest: End of test_rotateRight_1() method", true);
	}

	@Test(testName = "test_rotateRight_2", alwaysRun = true)
	public void test_rotateRight_2() {
		Reporter.log("ArrayRotationsTest: Start of test_rotateRight_2() method", true);
		int[] actualArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] expectedArr = { 5, 6, 7, 8, 9, 1, 2, 3, 4 };
		arrayRotate.rotateRight(actualArr, 5);

		assertEquals(actualArr, expectedArr);
		Reporter.log("ArrayRotationsTest: End of test_rotateRight_2() method", true);
	}

	@Test(testName = "test_rotateLeft_for_NullPointerException", alwaysRun = true, expectedExceptions = NullPointerException.class)
	public void test_rotateLeft_for_NullPointerException() {
		Reporter.log("ArrayRotationsTest: Start of test_rotateLeft_for_NullPointerException() method", true);
		arrayRotate.rotateLeft(null, 2);

	}

	@Test(testName = "test_rotateRight_for_NullPointerException", alwaysRun = true, expectedExceptions = NullPointerException.class)
	public void test_rotateRight_for_NullPointerException() {
		Reporter.log("ArrayRotationsTest: Start of test_rotateRight_for_NullPointerException() method", true);
		arrayRotate.rotateRight(null, 2);

	}
	
	@Test(testName = "test_rotateLeft_for_NegativeValue", alwaysRun = true, expectedExceptions = RuntimeException.class)
	public void test_rotateLeft_for_NegativeValue() {
		Reporter.log("ArrayRotationsTest: Start of test_rotateLeft_for_NegativeValue() method", true);
		int[] actualArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		arrayRotate.rotateLeft(actualArr, -8);

	}
	
	@Test(testName = "test_rotateRight_for_NegativeValue", alwaysRun = true, expectedExceptions = RuntimeException.class)
	public void test_rotateRight_for_NegativeValue() {
		Reporter.log("ArrayRotationsTest: Start of test_rotateRight_for_NegativeValue() method", true);
		int[] actualArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		arrayRotate.rotateRight(actualArr, -8);

	}
	
	@Test(testName = "test_rotateRight_for_ZeroValue", alwaysRun = true)
	public void test_rotateRight_for_ZeroValue() {
		Reporter.log("ArrayRotationsTest: Start of test_rotateRight_for_ZeroValue() method", true);
		int[] actualArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] expectedArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		arrayRotate.rotateRight(actualArr, 0);
		assertEquals(actualArr, expectedArr);
		Reporter.log("ArrayRotationsTest: End of test_rotateRight_for_ZeroValue() method", true);
	}
	
	@Test(testName = "test_rotateLeft_for_ZeroValue", alwaysRun = true)
	public void test_rotateLeft_for_ZeroValue() {
		Reporter.log("ArrayRotationsTest: Start of test_rotateLeft_for_ZeroValue() method", true);
		int[] actualArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] expectedArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		arrayRotate.rotateLeft(actualArr, 0);
		assertEquals(actualArr, expectedArr);
		Reporter.log("ArrayRotationsTest: End of test_rotateLeft_for_ZeroValue() method", true);
	}

}
