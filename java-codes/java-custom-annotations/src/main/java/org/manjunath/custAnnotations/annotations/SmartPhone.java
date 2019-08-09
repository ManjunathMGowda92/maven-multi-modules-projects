package org.manjunath.custAnnotations.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * SmartPhone annotation is a simple annotation which will be live on
 * Runtime(RetentionPolicy.RUNTIME) and this annotation can be applied on
 * Classes
 * 
 * @author Manjunath
 *
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface SmartPhone {
	String os() default "Symbian";
	int version() default 1;
}
