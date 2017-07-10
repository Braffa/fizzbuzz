package com.braffa.fizbuzz;

import java.util.ArrayList;

public class FizBuzz {

	private static String FIZZ = "fizz";
	private static String BUZZ = "buzz";
	private static String SPACE = " ";
	private static String LUCKY = "lucky"; 
	
	private int fizzCount = 0;
	private int buzzCount = 0;
	private int fizzBuzzCount = 0;
	private int luckyCount = 0;
	private int intCount = 0;
	
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
			fizzBuzzCount++;
			return FIZZ + BUZZ;
		} else if (number % 3 == 0) {
			fizzCount++;
			return FIZZ;
		} else if (number % 5 == 0) {
			buzzCount++;
			return BUZZ;
		}
		intCount++;
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
				luckyCount++;
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
	
	public void printReport (ArrayList<String> report) {
		for (String st : report) {
			System.out.println(st);
		}
	}
	
	public ArrayList<String> report (int [] numbers) {
		ArrayList<String> al = new ArrayList<String> ();
		String st = lucky (numbers);
		al.add(st);
		al.add("fizz: " + fizzCount);
		al.add("buzz: " + buzzCount);
		al.add("fizzbuzz: " + fizzBuzzCount);
		al.add("lucky: " + luckyCount);
		al.add("integer: " + intCount);
		return al;	
	}
}
