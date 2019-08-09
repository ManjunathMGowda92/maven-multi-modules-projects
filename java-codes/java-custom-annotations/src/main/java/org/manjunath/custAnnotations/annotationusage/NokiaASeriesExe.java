package org.manjunath.custAnnotations.annotationusage;

import java.lang.annotation.Annotation;

import org.manjunath.custAnnotations.annotations.SmartPhone;

public class NokiaASeriesExe {
	public static void main(String[] args) {
		NokiaASeries object = new NokiaASeries();
		
		//To fetch the annotations used we need to use Reflections
		Class<? extends NokiaASeries> c= object.getClass();
		
		//get annotation by using Class object
		Annotation annotation = c.getAnnotation(SmartPhone.class);
		SmartPhone smtPhone = (SmartPhone) annotation;
		
		System.out.println("OS is :"+smtPhone.os() +"  Version is:"+smtPhone.version());
	}
}
