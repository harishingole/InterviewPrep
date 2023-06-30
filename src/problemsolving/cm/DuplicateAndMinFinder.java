package problemsolving.cm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DuplicateAndMinFinder {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 0, 7, 9, 3, 1, 4);
		Stream<Integer> l1 = list.stream().filter(i -> list.stream().filter(j -> j.equals(i)).count() > 0);
		System.out.println(l1.toList());
		
		Stream<Integer> l2 = list.stream().filter(i -> list.stream().filter(j -> j.equals(i)).count() > 1);
		System.out.println(l2.toList());		
	}
}
