package org.manjunath.reflections.models;

/**
 * Class <i> ExampleSingleton</i> is a Singleton Class.
 * <p>
 * Singleton is a design pattern and is Simplest design pattern.The singleton
 * pattern is a design pattern that restricts the instantiation of a class to
 * one object. Only one instance of the class is created and this will be shared
 * across entire application.
 * </p>
 * 
 * <p>
 * This class will not allow the Reflection to create the new instance. By using
 * reflections we can invoke the private constructor of Singleton class. But
 * using a check at constructor level we are not allowing to create a new
 * instance.
 * </p>
 * 
 * @author Manjunath HM
 *
 */
public class ExampleSingleton {
	private static ExampleSingleton instance;
	
	static {
		instance = new ExampleSingleton();
	}
	
	private ExampleSingleton(){
		if (instance != null)
			throw new RuntimeException("Unable to create new Instance:: Reason -> Class is Singleton");
	}
	
	public static ExampleSingleton getInsatnce(){
		return instance;
	}
	
	public void display(){
		System.out.println(hashCode());
	}
}
