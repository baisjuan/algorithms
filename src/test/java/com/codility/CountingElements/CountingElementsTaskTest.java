package com.codility.CountingElements;

import org.junit.Assert;
import org.junit.Test;

public class CountingElementsTaskTest {

	private CountingElementsTask task;

	@Test
	public void permCheck(){
		int permCheck = task.permCheck(new int[] {1,1,3,4,5,6,7});
		Assert.assertEquals(0, permCheck);
	}
}
