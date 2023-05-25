package com.java;


public class FindSecondHighestNumber {

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,10,5,8,8};
		int max = 0;
		int secondMax = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				secondMax = max; //0,1,2,3
				max = arr[i];    //1,2,3,45
			}
			if(max > arr[i] && arr[i] > secondMax) {
				secondMax = arr[i];
			}
		}
		System.out.println("Second Highest Number :: " + secondMax);
	}
}
