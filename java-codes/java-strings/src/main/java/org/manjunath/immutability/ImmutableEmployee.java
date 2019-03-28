package org.manjunath.immutability;

/**
 * ImmutableEmployee class is an example of immutable class with some mutable injectable object.
 * 
 * Ex: If Employee has an object reference for age from outside and Age Object is 
 * not an immutable object(i.e it is a mutable object).Then our Employee object 
 * should not change based on change in Age object.
 * 
 * Rules to be followed for an immutable class are:
 * 1. Class must be declared as final.
 * 2. All member variables of class must be private final.
 * 3. Member variables need to be initialized via an argument constructor.
 * 4. Provide only getters to access the member variable values.
 * 5. If Class contains any mutable injectable object, then we need to take care that the mutable 
 * 	  object should not change our immutability nature of object.
 * 
 * @author mahm0001
 *
 */
public final class ImmutableEmployee {
	private final int empId;
	private final String name;
	private final String email;
	private final double salary;
	private final Age age;
	
	public ImmutableEmployee(int empId, String name, String email, double salary, Age age) {
		this.empId = empId;
		this.name = name;
		this.email = email;
		this.salary = salary;
		
		/*
		 * age object is mutable object, So don't inject the mutable object directly.
		 * Rather create a new instance of Age and set the values to newly created age,
		 * and associate newly created age object to employee age variable.
		 */
		Age thatAge = new Age();
		thatAge.setDay(age.getDay());
		thatAge.setMonth(age.getMonth());
		thatAge.setYear(age.getYear());
		
		this.age = thatAge;
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public double getSalary() {
		return salary;
	}

	public Age getAge() {
		return age;
	}
	
	
	@Override
	public String toString() {
		return "ImmutableEmployee [empId=" + empId + ", name=" + name + ", email=" + email + ", salary=" + salary
				+ ", age=" + age + "]";
	}
}
