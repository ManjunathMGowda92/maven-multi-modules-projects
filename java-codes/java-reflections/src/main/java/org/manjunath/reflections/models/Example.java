package org.manjunath.reflections.models;

public class Example {
	private static Example instance;
	
	static {
		instance = new Example();
	}
	
	private Example(){}
	
	public static Example getInstance(){
		return instance;
	}
	
	public void display(){
		System.out.println(hashCode());
	}
}
