package com.ds;

public class ReverseArrayOfGivenLength {
	static int input = 2;

	/*
	 * Input 3,1,5,4,8,6,8,3,2
	 * ouput 5,1,3,6,8,4,2,3,8
	 */
	
	public static void main(String[] args) {
		int[] arr = {3,1,5,4,8,6,8,3,2};
		int [] arr1 = reverseArray(arr, input);
		for (int j = 0; j < arr1.length; j++) {
			System.out.print(arr1[j]+ " ");
		}
		
	}

	private static int[] reverseArray(int[] arr, int s) {
		int k = s;
		int tmp;
		for (int i = 0; i < arr.length; i++) {
			if(i < s) {
				tmp = arr[i];
				arr[i] = arr[s];
				arr[s] = tmp;
				s--;
			}else {
				s = k + (input+1);
				i = k;
				k = s;
			}
		}
		return arr;
	}
}
