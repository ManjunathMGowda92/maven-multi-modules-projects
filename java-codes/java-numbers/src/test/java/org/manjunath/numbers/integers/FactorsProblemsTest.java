package org.manjunath.numbers.integers;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FactorsProblemsTest {
	private FactorsProblems factors;

	@BeforeClass
	public void doInitialization() {
		factors = new FactorsProblems();
	}

	@Test(testName = "test_getAllFactors_1", alwaysRun = true)
	public void test_getAllFactors_1() {
		Reporter.log("FactorsProblemsTest: Start of test_getAllFactors_1() method", true);
		List<Integer> expectedFactors = Arrays.asList(1, 2, 3, 4, 6, 12, 13, 26, 39, 52, 78, 156);
		List<Integer> actualFactors = factors.getAllFactors(156);

		assertEquals(expectedFactors, actualFactors);
		assertEquals(expectedFactors.size(), actualFactors.size());
		Reporter.log("FactorsProblemsTest: End of test_getAllFactors_1() method", true);
	}

	@Test(testName = "test_getAllFactors_2", alwaysRun = true)
	public void test_getAllFactors_2() {
		Reporter.log("FactorsProblemsTest: Start of test_getAllFactors_2() method", true);
		List<Integer> expectedFactors = Arrays.asList(1, 3, 9);
		List<Integer> actualFactors = factors.getAllFactors(9);

		assertEquals(expectedFactors, actualFactors);
		assertEquals(expectedFactors.size(), actualFactors.size());
		Reporter.log("FactorsProblemsTest: End of test_getAllFactors_2() method", true);
	}

	@Test(testName = "test_getAllFactors_for_prime", alwaysRun = true)
	public void test_getAllFactors_for_prime() {
		Reporter.log("FactorsProblemsTest: Start of test_getAllFactors_for_prime() method", true);
		List<Integer> expectedFactors = Arrays.asList(1, 13);
		List<Integer> actualFactors = factors.getAllFactors(13);

		assertEquals(expectedFactors, actualFactors);
		assertEquals(expectedFactors.size(), actualFactors.size());
		Reporter.log("FactorsProblemsTest: End of test_getAllFactors_for_prime() method", true);
	}

	@Test(testName = "test_getAllFactors_for_negativeInteger", alwaysRun = true, expectedExceptions = RuntimeException.class)
	public void test_getAllFactors_for_negativeInteger() {
		Reporter.log("FactorsProblemsTest: Start of test_getAllFactors_for_prime() method", true);
		factors.getAllFactors(-2);
	}
	
	@Test(testName = "test_sumOfFactors_1", alwaysRun = true)
	public void test_sumOfFactors_1() {
		Reporter.log("FactorsProblemsTest: Start of test_sumOfFactors_1() method", true);
		int actualSum = factors.sumOfFactors(9);
		assertEquals(actualSum, 13);
		Reporter.log("FactorsProblemsTest: End of test_sumOfFactors_1() method", true);
	}
	
	@Test(testName = "test_sumOfFactors_2", alwaysRun = true)
	public void test_sumOfFactors_2() {
		Reporter.log("FactorsProblemsTest: Start of test_sumOfFactors_2() method", true);
		int actualSum = factors.sumOfFactors(156);
		assertEquals(actualSum, 392);
		Reporter.log("FactorsProblemsTest: End of test_sumOfFactors_2() method", true);
	}
	
	@Test(testName = "test_sumOfFactors_for_negativeInteger", alwaysRun = true, expectedExceptions = RuntimeException.class)
	public void test_sumOfFactors_for_negativeInteger() {
		Reporter.log("FactorsProblemsTest: Start of test_sumOfFactors_for_negativeInteger() method", true);
		factors.sumOfFactors(-156);
	}

}
