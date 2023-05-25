package DeqodeAssignments;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int[] arr1 = {1,12,14,17,23,38,49}, arr2 = {11,19,27,28,50};
		int n1 = arr1.length;
		int[] outcome = new int[arr1.length + arr2.length];
		int j = 0;
		for (int i = 0; i < outcome.length; i++) {
			if(i < n1) {
				outcome[i] = arr1[i];
			}else {
				outcome[i] = arr2[j++];
			}
		}
		Arrays.sort(outcome);
		for (int i = 0; i < outcome.length; i++) {
			System.out.print(outcome[i] + " ");
		}
	}
}
