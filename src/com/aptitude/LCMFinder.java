package com.aptitude;

public class LCMFinder {

	
	public static void main(String[] args) {
		int[] arr = { 12, 15, 18, 27 };
		System.out.println("Lcm is :- " + findLcm(arr));
	}

	/**
	 * @param arr ehich has element
	 * @return find LCM of an array
	 */
	private static int findLcm(int[] arr) {
		int lcm = arr[0];
		for (int i = 1; i < arr.length; i++) {
			lcm = calculateLcm(lcm, arr[i]);
		}
		return lcm;
	}

	/**
	 * @param x for first number
	 * @param y for second number
	 * @return calculated LCM
	 */
	private static int calculateLcm(int x, int y) {
		return (x * y) / calculateGCD(x, y);
	}
	
	/**
	 * @param x for first number
	 * @param y for second number
	 * @return calculate GCD of two number
	 */
	private static int calculateGCD(int x, int y) {
		if (x % y == 0)
			return y;
		else
			return calculateGCD(y, x % y);
	}

}
