package org.manjunath.immutability;

import org.manjunath.documentation.TestCase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestImmutableStudent {
	
	@Test(testName = "testImmutableStudentByChangingMutableObjectValues")
	@TestCase(Author = "Manjunath HM",
				testCaseDescription = "To test the immutability nature of ImmutableStudent Object by injecting mutable Age and Department Objects",
				expectedResult = "The values of ImmutableStudent object should remain same")
	public void testImmutableStudentByChangingMutableObjectValues() {
		Reporter.log("TestImmutableStudent: Start of testImmutableStudentByChangingMutableObjectValues() method", true);
		
		try {
			Age age = new Age(31, 10, 1999);
			Department department = new Department(10, "Computer Science");
			
			ImmutableStudent student = new ImmutableStudent(5, "Deepa", department, age);
			
			//Get department_name of student
			String deptName = student.getDepartment().getDeptName();
			//Get student age(year value)
			int year = student.getAge().getYear();
			
			Assert.assertEquals(student.getDepartment().getDeptName(), deptName);
			Assert.assertEquals(student.getAge().getYear(), year);
			
			//Change age object year value and department name
			age.setYear(1996);
			department.setDeptName("Electronics and Communication");
			
			//Check for age and department name of student
			Assert.assertEquals(student.getDepartment().getDeptName(), deptName);
			Assert.assertEquals(student.getAge().getYear(), year);
			
			//Check for changed values of Department name and age
			Assert.assertEquals(department.getDeptName(), "Electronics and Communication");
			Assert.assertEquals(age.getYear(), 1996);
			
			//Check student age and department values are not changed by change in age and department
			Assert.assertNotEquals(student.getDepartment().getDeptName(), department.getDeptName());
			Assert.assertNotEquals(student.getAge().getYear(), age.getYear());
			
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestImmutableStudent: End of testImmutableStudentByChangingMutableObjectValues() method", true);
	}
}
