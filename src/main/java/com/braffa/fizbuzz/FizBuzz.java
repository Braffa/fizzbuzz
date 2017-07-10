package com.braffa.fizbuzz;

public class FizBuzz {
	
	private static String FIZZ = "fizz";  
	private static String BUZZ = "buzz"; 
	private static String SPACE = " "; 
	
	public String  fizBuzz (int [] numbers) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 15 == 0) {
				sb.append(FIZZ + BUZZ); 
			} else if (numbers[i] % 3 == 0 ) {
				sb.append(FIZZ); 
			} else if (numbers[i] % 5 == 0) {
				sb.append(BUZZ);
			} else {
				sb.append(numbers[i]); 
			}
			if (i < numbers.length - 1) {
				sb.append(SPACE); 
			}
		}
		return sb.toString();
	}
}
