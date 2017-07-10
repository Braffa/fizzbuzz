package com.braffa.fizbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FizBuzzTest {
	
	FizBuzz fizBuzz;

	@Before
	public void setUp() throws Exception {
		fizBuzz = new FizBuzz();
	}

    @Test
    public void testFizBuzz () {
    	String expectedResult = new String  ("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz");    	
    	int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    	String result = fizBuzz.fizBuzz(numbers);
    	assertEquals(result, expectedResult);
    }
    
    @Test
    public void testLucky () {
    	String expectedResult = new String  ("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz");
    	int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    	String result = fizBuzz.lucky (numbers);
    	assertEquals(expectedResult, result);
    	
    }

}
