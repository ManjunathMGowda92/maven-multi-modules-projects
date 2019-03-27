package org.manjunath.documentation;

public @interface TestCase {
	String Author() default "Manjunath HM";
	String testCaseDescription() default "";
	String expectedResult() default "";
}
