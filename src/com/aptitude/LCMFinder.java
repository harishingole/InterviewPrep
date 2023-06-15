package com.aptitude;

public class LCMFinder {

	public static void main(String[] args) {
		int[] arr = { 12, 15, 18, 27 };
		System.out.println("Lcm is :- " + findLcm(arr));
	}

	private static int findLcm(int[] arr) {
		int x = arr[0];
		for (int i = 1; i < arr.length; i++) {
			x = calculateLcm(x, arr[i]);
		}
		return x;
	}

	private static int calculateLcm(int x, int y) {
		return (x * y) / calculateGCD(x, y);
	}

	private static int calculateGCD(int x, int y) {
		if (x % y == 0)
			return y;
		else
			return calculateGCD(y, x % y);
	}

}
