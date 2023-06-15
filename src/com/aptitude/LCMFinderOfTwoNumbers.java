package com.aptitude;

/*
 * 12 = 12,24,36,48,60
 * 6  = 6, 12, 18, 
 * Ans = 12
 */
public class LCMFinderOfTwoNumbers {

	public static void main(String[] args) {

		int[] arr = { 12, 48 };
		System.out.println("LCM is :: " + findLcm(arr[0], arr[1]));

	}

	private static int findLcm(int i, int j) {
		int gcf = findHCFIterative(i, j); // 12
		System.out.println("GCF :: " + gcf);
		return (i * j) / gcf; // 48
		/*
		 * LCM = 48, GCF = 12, x = 12, y = ?; LCM = i * j / gcf; 48 = 12 * j / 12; 48 *
		 * 12 = 12 * j; y = 48 * 12 / 12; .'. y = 48;
		 */

	}

	@SuppressWarnings("unused")
	private static int findGCF(int i, int j) {
		if (j == 0)
			return i;
		if (i > j)
			return findGCF(j, i % j);
		else
			return findGCF(j, i);

	}

	@SuppressWarnings("unused")
	private static int findGCFByDivision(int i, int j) {
		if (j == 0)
			return i;
		if (i % j == 0)
			return j;
		else
			return findGCFByDivision(j, i % j);

	}

	@SuppressWarnings("unused")
	private static int findGCFBySubtraction(int i, int j) {
		if (i == j)
			return i;
		if (i > j)
			return findGCFBySubtraction(i - j, j);
		else
			return findGCFBySubtraction(i, j - i);
	}

	private static int findHCFIterative(int i, int j) {
		if (i == 0)
			return j;
		if (j == 0)
			return i;
		while(i != j) {
			if(i > j) {
				i = i - j;
			}else {
				j = j - i;
			}
		}
		return i;

	}

}
