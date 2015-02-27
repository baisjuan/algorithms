package com.betterprogramming;

import java.util.ArrayList;
import java.util.List;

public class BetterProgrammerTask {

	public static boolean isPalindrome(String s) {
		/*
		 * Definition: A palindrome is a string that reads the same forward and
		 * backward. For example, "abcba" is a palindrome, "abab" is not. Please
		 * implement this method to return true if the parameter is a palindrome
		 * and false otherwise.
		 */

		char[] chars = new char[s.length()];
		s.getChars(0, s.length(), chars, 0);

		int i = 0, j = chars.length - 1;

		while (i < j) {
			if (chars[i] != chars[j]) {
				return false;
			} else {
				i++;
				j--;
			}
		}
		return true;
	}

	public static int getCountOfOnes(int n) {
		/*
		 * Please implement this method to return the number of '1's in the
		 * binary representation of n for any integer n, where n > 0
		 * 
		 * Example: for n=6 the binary representation is '110' and the number of
		 * '1's in that representation is 2
		 */
		int count = 0;
		String binaryString = Integer.toBinaryString(n);
		char[] chars = binaryString.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '1') {
				count++;
			}
		}

		return count;
	}

	// Please do not change this interface
	interface ListNode {
		int getItem();

		ListNode getNext();

		void setNext(ListNode next);
	}

	public static ListNode reverse(ListNode node) {
		/*
		 * Please implement this method to reverse a given linked list.
		 */

		if (node.getNext() == null) {
			return node;
		} else {
			ListNode auxNode = reverse(node.getNext());
			auxNode.setNext(node);
			return auxNode;
		}
	}

	public static List<Integer> getReversalsToSort(int[] a) {
		/*
		 * You need to sort an array of integers by repeatedly reversing the
		 * order of the first several elements of it.
		 * 
		 * For example, to sort [12,13,11,14], you need to reverse the order of
		 * the first two (2) elements and get [13,12,11,14] and then reverse the
		 * order of the first three (3) elements and get [11,12,13,14]
		 * 
		 * The method should return the shortest(!) possible list of integers
		 * corresponding to the required reversals. For the previous example,
		 * given an array [12,13,11,14] the method should return a list with
		 * Integers 2 and 3.
		 */

		boolean reverse = false;
		
		List<Integer> toReturn = new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {

			if (!reverse) {
				if (a[i] > a[i + i]) {
					a = reverse(a,i);
					reverse = !reverse;
					toReturn.add(i+1);
					i = 0;					
				}
			}
			else {
				if (a[i] < a[i + i]) {
					a = reverse(a,i);
					reverse = !reverse;
					toReturn.add(i+1);
					i = 0;	
				}
			}
		}
		return toReturn;
	}

	private static int[] reverse(int[] a, int to) {
		int[] toReturn = new int[a.length];

		int i = 0, j = to;

		while (i <= to) {
			toReturn[i] = a[j];
			j--;
			i++;
		}

		for (int k = i; k < a.length; k++) {
			toReturn[k] = a[k];
		}

		return toReturn;
	}
}
