package problemsolving.cm;

import java.util.Arrays;

public class PrefixFinder {

	public static void main(String[] args) {
		Integer[] array = { 5, 10, 15, 25, 20, 51, 52, 55, 55 };

		Integer[] ar = Arrays.stream(array).
				filter(i -> i.toString().contains("5")).
				sorted().
				toArray(Integer[]::new);
		
	}
}
