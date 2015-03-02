package com.codility.TimeComplexity;


import org.junit.Before;
import org.junit.Test;

public class TimeComplexityTaskTest {
	
	private TimeComplexityTask task;
	
	@Before
	public void setUp() {
		task = new TimeComplexityTask();
	}
	
	@Test
	public void frogJmpTest() {
		task.frogJmp(10, 85, 30);
	}
	
	@Test
	public void permMissingElemTest() {
		int missElem = task.permMissingElem(new int[] {4,5,3,1});
		System.out.println(missElem);
	}
	
	@Test
	public void permMissingElemTest2() {
		
		int[] a = new int[100000];
		int j=2;
		for (int i=0; i<100000; i++) {
			a [i] = j;
			j++;
		}	
		int missElem = task.permMissingElem(a);
		System.out.println(missElem);
	}
	
	
}
