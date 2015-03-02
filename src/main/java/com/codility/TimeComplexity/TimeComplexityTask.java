package com.codility.TimeComplexity;


public class TimeComplexityTask {

	public int frogJmp(int X, int Y, int D) {
		double x = X;
		double y = Y;
		double d = D;
		double result = (y - x) / d;

		int entero = (int) result;
		double decimal = result - entero;

		if (decimal > 0) {
			return entero + 1;
		}
		return entero;
	}

	public int permMissingElem(int[] A) {
		int sum = 0;
		int total = (A.length + 1) * (A.length + 1 + 1) / 2;
		for (int i : A) {
			sum += i;
		}
		return total - sum;
	}

	public int tapeEquilibrium(int[] A) {
		int diff = 1000000000;
		int acum = 0, total = 0;
		for (int i : A) {
			total += i;
		}
		for (int p = 0; p < A.length - 1; p++) {
			acum += A[p];
			total -= A[p];

			int currentDiff = Math.abs(acum - total);
			if (currentDiff < diff) {
				diff = currentDiff;
			}
		}
		return diff;
	}
}
