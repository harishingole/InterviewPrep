package DeqodeAssignments;

import java.util.HashMap;
import java.util.Map;

public class TwoNumbersAddUpToN {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int n = 7;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr1.length; i++) {
			int temp = n - arr1[i];
			if(map.containsKey(temp)) {
				System.out.println("Two numbers are " +temp + " and " + arr1[i] +" add up to " + n);
			}else {
				map.put(arr1[i], i);
			}
		}
	}
}
