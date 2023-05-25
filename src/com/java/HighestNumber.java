package com.java;

public class HighestNumber {

	public static void main(String[] args) {
		int[] arr = {10,20,33,88,22,99,44,11,9,5,2};
		int temp = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(temp < arr[i]) {
				temp = arr[i];
			}
		}
		System.out.println("Highest Number :: " +temp);
	}
}
