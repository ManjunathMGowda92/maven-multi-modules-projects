package org.manjunath.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import org.manjunath.reflections.models.Example;
import org.manjunath.reflections.models.ExampleSingleton;

public class AccessPrivateConstructor {

	/**
	 * Method privateConstructorAccess() is used to access the private
	 * constructor of the Singleton class by using the Reflections. Example
	 * class is a Singleton class and here we are using reflections to create a
	 * new instance of the Singleton class
	 */
	public static void privateConstructorAccess() {

		// get all declared constructors from the class
		Constructor<?>[] constructors = Example.class.getDeclaredConstructors();

		// iterate through the constructors
		for (Constructor<?> constructor : constructors) {

			// check whether the constructor is private or not
			if (Modifier.isPrivate(constructor.getModifiers())) {
				// set access for the private constructor
				constructor.setAccessible(true);

				// as we are not having many constructors in the Singleton
				// class, we are not differentiating them by parameter count

				try {
					Object obj = constructor.newInstance();
					Example instance = (Example) obj;

					instance.display();
				} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * Method <i>throwErrorForSingletonNewInstance</i> is checking whether the
	 * singleton class throws Exception while try to create a new instance using
	 * the Reflections.
	 */
	public static void throwErrorForSingletonNewInstance() {
		// get all declared constructors from the class
		Constructor<?>[] constructors = ExampleSingleton.class.getDeclaredConstructors();

		// iterate through the constructors array
		for (Constructor<?> constructor : constructors) {
			// check if the Modifier is private or not
			if (Modifier.isPrivate(constructor.getModifiers())){
				//as the constructor is private set the access.
				constructor.setAccessible(true);
				
				//create an object of the class using private constructor
				// as we have a check in private constructor it will throw a RuntimeException.
				try {
					Object obj = constructor.newInstance();
					
					if (obj instanceof ExampleSingleton){
						ExampleSingleton instance = (ExampleSingleton) obj;
						instance.display();
					}
				} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void main(String[] args) {
		privateConstructorAccess();
		throwErrorForSingletonNewInstance();
	}
}
