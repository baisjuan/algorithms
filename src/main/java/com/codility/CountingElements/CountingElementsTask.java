package com.codility.CountingElements;

import java.util.Arrays;

public class CountingElementsTask {

	public int permCheck(int[] A) {
		// write your code in Java SE 8
		boolean[] seen = new boolean[A.length+1];		
		Arrays.fill(seen, false);
		seen[0] = true;
		for (int i : A) {
			if (i > 0 && i < seen.length) {
				seen[i] = true;
			} else {
				return 0;
			}
		}
		for (boolean b : seen) {
			if (!b) {
				return 0;
			}
		}
		return 1;
	}
}
