package org.manjunath.reflections;

import java.lang.reflect.Field;

public class AccessPrivateFiledsUsingReflections {

	/**
	 * Method accessPrivateFileds() is used to access the private field
	 * variables of any class by using the Class Object. The method just
	 * iterates all the fields and prints out the Name of the field, Type of the
	 * field and Access Modifier value of field in int value
	 * 
	 * @param classObj
	 *            Class Object for iterating the declared fields
	 */
	@SuppressWarnings("rawtypes")
	public void accessPrivateFileds(Class classObj) {
		// access all private fields from class using Class Object
		Field[] fields = classObj.getDeclaredFields();

		System.out.println("*************************************************************************************");
		System.out.println("Declared Fields in " + classObj.getName() + " Class are: ");
		System.out.println("Declared Field Name ---- Field Type ---- Access Modifier Value");
		System.out.println("--------------------------------------------------------------------------------------");

		// Iterate through the fields and print the info : field name, field
		// type and field modifiers value
		for (Field field : fields) {
			System.out.println(field.getName()+" ---- "+field.getType()+" ---- "+field.getModifiers());
		}
		
		System.out.println("-------------------------------------------------------------------------------------- \n \n \n");
	}
	
	
	@SuppressWarnings("rawtypes")
	public void executeReflectionConcepts(String qualifiedName) {
		
		try {
			Class classObj = Class.forName(qualifiedName);
			accessPrivateFileds(classObj);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		AccessPrivateFiledsUsingReflections reflex = new AccessPrivateFiledsUsingReflections();
		reflex.executeReflectionConcepts("org.manjunath.reflections.models.Employee");
		reflex.executeReflectionConcepts("org.manjunath.reflections.models.Student");
		
	}
}
