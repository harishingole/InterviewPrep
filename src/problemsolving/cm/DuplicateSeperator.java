package problemsolving.cm;

import java.util.Arrays;
import java.util.List;


public class DuplicateSeperator {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 2, 5, 3, 6, 4, 6, 7, 2, 8, 8 };
//		int[] dup = new int[arr.length];
//		Arrays.sort(arr);
//		int k = 0;
//		for (int i = 0; i < arr.length - 1; i++) {
//			if (arr[i] == arr[i + 1]) {
//				dup[k++] = arr[i + 1];
//			}
//		}
//
//		for (int i = 0; i < k; i++) {
//			System.out.print(dup[i] + " ");
//		}
		List<Integer> al = Arrays.asList(1, 2, 3, 4, 2, 5, 3, 6, 4, 6, 7, 2, 8, 8);

		Integer min = al.stream().filter(i -> al.stream().filter(j -> j.equals(i)).count() > 1).distinct()
				.min(Integer::compareTo).orElseThrow();
		System.out.println(min);
	}
}
