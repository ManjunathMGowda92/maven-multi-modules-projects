package org.manjunath.sync;

public class SpecialCharSetInStrings {
	
	public static void stringEqualToAlphaNumericWithSPChar(String field, String spset) {

		if (field == null || field.equalsIgnoreCase("")) {
			System.out.println("field is empty");
		}

		String temp = field.replaceAll("[a-zA-Z0-9]", "");

		if (temp.trim().length() == 0) {
			System.out.println("no special characters in field return true");
		}
		char[] tempArray = temp.toCharArray();
		for (int i = 0; i < tempArray.length; i++) {
			Character specialChar = tempArray[i];
			if (spset.contains(specialChar.toString())) {
				System.out.println(specialChar);
			} else {
				System.out.println("spset not contains thi special char :: " + tempArray[i]);
			}
		}
	}
	
	
	public static void main(String[] args) {
		SpecialCharSetInStrings.stringEqualToAlphaNumericWithSPChar("ASDYF7#^89", "%#)(^");
	}
}
