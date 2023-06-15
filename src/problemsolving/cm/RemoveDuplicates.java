package problemsolving.cm;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 1, 5, 6, 3, 4};

        int[] uniqueArray = removeDuplicates(array);

        System.out.println(Arrays.toString(uniqueArray));
    }

    public static int[] removeDuplicates(int[] array) {
        int n = array.length;

        // Find the maximum element in the array
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        
        System.out.println("Max = "+ max);

        // Create a frequency array to count occurrences of each element
        int[] freq = new int[max + 1];
        for (int num : array) {
            freq[num]++;
        }

        // Count the number of unique elements
        int uniqueCount = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        // Create a result array with unique elements
        int[] result = new int[uniqueCount];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (freq[array[i]] > 0) {
                result[index++] = array[i];
                freq[array[i]] = 0; // Mark the element as visited
            }
        }

        return result;
    }
}
