package DeqodeAssignments;

public class RearrangeIntegers {

	public static void main(String[] args) {
		int[] arr = { 2, 4, -6, 8, -5, -10 };
		int len = arr.length;

		int[] result = new int[len];
		int p = 0, n = len / 2;

		for (int i = 0; i < len; i++) {
			if (arr[i] > 0)
				result[p++] = arr[i];
			else
				result[n++] = arr[i];
		}
		p = 0;
		n = len / 2;
		
		for (int i = 0; i < len; i++) {
			if (i % 2 == 0)
				arr[i] = result[p++];
			else
				arr[i] = result[n++];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
