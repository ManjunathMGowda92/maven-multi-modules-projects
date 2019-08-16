package org.manjunath.reflections.models;

public class Student {
	private int studentId;
	private String usn;
	private String firstName;
	private String lastName;
	private String email;
	private int marks;
	private double percentage;
	
	public Student() {}

	public Student(int studentId, String usn, String firstName, String lastName, String email, int marks,
			double percentage) {
		this.studentId = studentId;
		this.usn = usn;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.marks = marks;
		this.percentage = percentage;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getUsn() {
		return usn;
	}

	public void setUsn(String usn) {
		this.usn = usn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public double getPercentage() {
		percentage = calculatePercentage(marks);
		return percentage;
	}
	
	private double calculatePercentage(int marks) {
		double percent = marks / 6;
		return percent;
	}
}
