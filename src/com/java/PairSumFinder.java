package com.java;

import java.util.HashMap;
import java.util.Map;

public class PairSumFinder {

	//Solution 1
	/*public static void main(String[] args) {
		int[] arr = {1,2,2,-1,3,4,-7,8,4,7};
		int givenNumber = 0;
		int temp;
		for (int i = 0; i < arr.length; i++) {
			temp = givenNumber - arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (temp == arr[j]) {
					System.out.println("The sum of pair of " + givenNumber + " is " + temp + " and " + arr[i]);
				}
			}

		}
	}*/
	
	//Solution 2
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int givenNumber = 4;
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(givenNumber - arr[i])) {
				System.out.println("Pair numbers with " + givenNumber + " sum is " + (givenNumber - arr[i]) + " and " + arr[i]);
			}
			map.put(arr[i], i);
		}
	}
}
