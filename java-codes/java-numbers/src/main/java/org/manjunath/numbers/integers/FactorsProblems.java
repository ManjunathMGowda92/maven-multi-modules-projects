package org.manjunath.numbers.integers;

import java.util.ArrayList;
import java.util.List;

public class FactorsProblems {

	/**
	 * Calculates and Returns the sum of all divisors of given integer.
	 * 
	 * @param num Integer variable for which divisor sum need to be calculated.
	 * @return Sum of divisors of given integer.
	 */
	public static int sumOfFactors(int num) {
		int i = 1;
		int sum = 0;
		while (i <= num) {
			int remainder = num % i;
			if (remainder == 0)
				sum += i;

			i++;
		}
		return sum;
	}

	/**
	 * Returns List of Factors for the given integer.
	 * 
	 * @param num Number for which factors need to be find.
	 * @return List of factors available for the given integer.
	 */
	public List<Integer> getAllFactors(int num) {
		if (num < 0)
			throw new RuntimeException("Number is below the range : Please pass positive value");

		int i = 1;
		int mid = num / 2;
		List<Integer> factorsList = new ArrayList<>();
		while (i <= mid) {
			int remainder = num % i;
			if (remainder == 0)
				factorsList.add(i);
			
			i++;
		}
		factorsList.add(num);
		return factorsList;
	}

}
