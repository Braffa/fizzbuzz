package com.braffa.fizbuzz;

public class FizBuzz {

	private static String FIZZ = "fizz";
	private static String BUZZ = "buzz";
	private static String SPACE = " ";
	private static String LUCKY = "lucky"; 
	
	private boolean contains3 (int number) {
		char [] chars = String.valueOf(number).toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars [i] == '3') {
				return true;
			}
		}
		return false;
	}

	private String fizBuzz(int number) {
		if (number % 15 == 0) {
			return FIZZ + BUZZ;
		} else if (number % 3 == 0) {
			return FIZZ;
		} else if (number % 5 == 0) {
			return BUZZ;
		}
		return String.valueOf(number);
	}

	public String fizBuzz(int[] numbers) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < numbers.length; i++) {
			sb.append(fizBuzz(numbers[i]));
			if (i < numbers.length - 1) {
				sb.append(SPACE);
			}
		}
		return sb.toString();
	}

	public String  lucky (int [] numbers) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < numbers.length; i++) {
			if (contains3 (numbers [i])) {
				sb.append(LUCKY);
			} else {
				sb.append(fizBuzz (numbers[i]));
			}
			if (i < numbers.length - 1) {
				sb.append(SPACE); 
			}
		}
		return sb.toString();
	}
}
