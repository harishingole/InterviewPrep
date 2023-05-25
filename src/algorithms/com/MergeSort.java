package algorithms.com;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1 };
		int l = 0;
		int r = arr.length - 1;
		mergeSort(arr,l,r);
	}
	private static void merge(int[] arr, int l, int m, int r) {
		int size1 = m - l + 1;
		int size2 = r - m;
		
		int[] a1 = new int[size1];
		int[] a2 = new int[size2];
		
		//Copy data to temp Arrays
		for (int i = 0; i < a1.length; i++) {
			a1[i] = arr[l + i];
		}
		for (int j = 0; j < a2.length; j++) {
			a2[j] = arr[m + 1 + j];
		}
		
		int i = 0, j = 0;
		int k = l;
		while(i < size2 && j < size2) {
			if(a1[i] <= a2[j]) {
//				arr[k] = 
			}
		}
	}
	private static void mergeSort(int[] arr, int l, int r) {
		
		if(l < r) {
			int m = l + (r - l) /2;
			mergeSort(arr,l,m);
			mergeSort(arr,m + 1, r);
			merge(arr,l,m,r);
		}
		
		
	}


}
