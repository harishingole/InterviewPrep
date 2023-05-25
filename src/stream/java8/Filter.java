package stream.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(5,10,15,20,25,30);
		List<Integer> l1 = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(l1);
		List<Integer> l2 = l.stream().map(i-> i * 2).collect(Collectors.toList());
		System.out.println(l2);
	}
}
