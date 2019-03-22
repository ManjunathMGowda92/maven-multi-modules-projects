package org.manjunath.documentation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface TestCase {
	
	String Author() default "Manjunath HM";
	String testCaseDescription() default "";
	String expectedResult() default "";
}
