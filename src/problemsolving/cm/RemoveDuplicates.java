package problemsolving.cm;


public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int[] arr = { 1, 1, 2, 2, 3, 10, 5, 2,8, 8 };
		int k = 0;
		
		
		k = new RemoveDuplicates().removeDuplicates(arr, k);
		
		for (int i = 0; i < k; i++) {
			System.out.println(arr[i]);
		}
	}

	private int removeDuplicates(int[] arr, int k) {
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i] != arr[i+1]) {
				arr[k++] = arr[i];
			}
		}
		arr[k++] = arr[arr.length - 1];
		return k;
	}
}
