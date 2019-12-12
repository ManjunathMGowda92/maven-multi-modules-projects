package org.manjunath.reflections.models;

/**
 * Class <i> Example</i> is a Singleton class. <br>
 * <p>
 * Singleton is a design pattern and is Simplest design pattern.The singleton
 * pattern is a design pattern that restricts the instantiation of a class to
 * one object. Only one instance of the class is created and this will be shared
 * across entire application.
 * </p>
 * 
 * @author Manjunath HM
 *
 */
public class Example {
	private static Example instance;

	static {
		instance = new Example();
	}

	private Example() {
	}

	public static Example getInstance() {
		return instance;
	}

	public void display() {
		System.out.println(hashCode());
	}
}
