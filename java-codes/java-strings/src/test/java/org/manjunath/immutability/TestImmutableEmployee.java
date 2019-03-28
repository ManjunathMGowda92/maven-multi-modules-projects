package org.manjunath.immutability;

import org.manjunath.documentation.TestCase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestImmutableEmployee {
	
	@Test(testName = "testImmutablityOfEmployeeByChangingAgeValues")
	@TestCase(Author = "Manjunath HM",
				testCaseDescription = "To test the immutablity nature of ImmutableEmployee class by injecting mutable Age Object",
				expectedResult = "Immutablity nature of ImmutableEmployee objcet should remain same after injecting the mutable Age object")
	public void testImmutablityOfEmployeeByChangingAgeValues() {
		Reporter.log("TestImmutableEmployee: Start of testImmutablityOfEmployeeByChangingAgeValues() methods", true);
		
		try {
			Age age = new Age(12, 10, 1999);
			ImmutableEmployee employee = new ImmutableEmployee(1, "Deepa", "d@gmail.com", 1234.112, age);
			
			//Get employee age year value
			int year = employee.getAge().getYear();
			Assert.assertEquals(age.getYear(), year);
			
			//Change the value of age
			age.setYear(1988);
			
			Assert.assertEquals(age.getYear(), 1988);
			
			//Check age of employee has not changed
			Assert.assertEquals(employee.getAge().getYear(), year);
			
			//Check employee age year value and age Object year value are not same
			Assert.assertNotEquals(employee.getAge().getYear(), age.getYear());
			
			
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestImmutableEmployee: End of testImmutablityOfEmployeeByChangingAgeValues() methods", true);
	}
}
