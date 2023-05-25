package problemsolving.cm;

public class PossibleSequence {

	
	public static void main(String[] args) {
		int [] arr = {1, 2, 3};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
			
			if(i == 2) {
				swap(arr, i);
				System.out.println();
				i = -1;
			}	
		}
	}

	private static void swap(int[] arr, int i) {
		
		int temp = arr[i - 1];
		arr[i - 1] = arr[i];
		arr[i] = temp;
 	}
}
