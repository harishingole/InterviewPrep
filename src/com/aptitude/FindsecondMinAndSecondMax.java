package com.aptitude;

public class FindsecondMinAndSecondMax {

	public static void main(String[] args) {
		int[] arr = {10,3,1,2,2,-29,0,6,5,-1};
		findSecondMinAndMax(arr);
	}

	private static void findSecondMinAndMax(int[] arr) {
		int max = 0;
		int secondMax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				secondMax = max;
				max = arr[i];
			}
			if (max > arr[i] && secondMax < arr[i]) {
				secondMax = arr[i];
			}
		}
		System.out.println("Max = " + max + " And " + "SecondMax = " + secondMax);
		System.out.println("Multiplication of Max And SecondMax = " + (max * secondMax));
		int min = arr[0];
		int secondMin = arr[1];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				secondMin = min;
				min = arr[i];
			}
			if (min < arr[i] && secondMin > arr[i]) {
				secondMin = arr[i];
			}
		}
		System.out.println("Min = " + min + " And " + "SecondMin = " + secondMin);
		System.out.println("Multiplication of Max And SecondMax = " + (min * secondMin));
	}
}
