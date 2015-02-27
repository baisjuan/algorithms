package com.betterprogramming;



import org.junit.Assert;
import org.junit.Test;

public class BetterProgrammerTaskTest {
	
	private BetterProgrammerTask task;

	@Test
	public void palindromeTest() {
		Assert.assertTrue(task.isPalindrome("v"));
	}
	
	@Test
	public void getCountOfOnesTest() {
		Assert.assertEquals(1, task.getCountOfOnes(1));
	}
}
