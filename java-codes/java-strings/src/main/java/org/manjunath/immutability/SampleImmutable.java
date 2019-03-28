package org.manjunath.immutability;

/**
 * SampleImmutable class is an example to create Immutable class in java.
 * 
 * The rules need to be followed to create immutable class are:
 * 1. Class must be final (because no other class to extend this class)
 * 2. All variables declared inside class must be private and final.
 * 3. Provide an argument constructor to initialize the private variables.
 * 4. Provide only getters to access the variable values.
 *  
 * @author Manjunath HM
 *
 */
public final class SampleImmutable {
	/*
	 * Declare variables as private 
	 */
	private final int id;
	private final String name;
	private final String email;
	private final double salary;
	
	public SampleImmutable(int id, String name, String email, double salary) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	public int getId() {
		return id;
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
}
