package com.ds;

public class RemoveElement {

	public static void main(String[] args) {
		int[] nums = {3,2,2,3};
		int val = 3;
		int i = 0, count = 0;
		for (i = 0; i < nums.length - 1; i++) {
			if(val == nums[i]) {
				nums[i] = nums[i+1];
				count++;
			}
		}		
	}
}
