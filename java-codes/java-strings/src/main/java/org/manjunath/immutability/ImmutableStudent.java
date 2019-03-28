package org.manjunath.immutability;

public final class ImmutableStudent {
	
	private final int studentId;
	private final String sName;
	private final Department department;
	private final Age age;
	
	public ImmutableStudent(int studentId, String sName, Department department, Age age) {
		this.studentId = studentId;
		this.sName = sName;
		
		Department dept = new Department();
		dept.setDeptId(department.getDeptId());
		dept.setDeptName(department.getDeptName());
		
		Age otherAge = new Age();
		otherAge.setDay(age.getDay());
		otherAge.setMonth(age.getMonth());
		otherAge.setYear(age.getYear());
		
		this.department = dept;
		this.age = otherAge;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getsName() {
		return sName;
	}

	public Department getDepartment() {
		return department;
	}

	public Age getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "ImmutableStudent [studentId=" + studentId + ", sName=" + sName + ", department=" + department + ", age="
				+ age + "]";
	}
}
