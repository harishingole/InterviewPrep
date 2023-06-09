package Java8.funtionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Main {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave", "Eve");

		names.stream().filter(name -> name.startsWith("A") && name.length() > 3).forEach(System.out::println);

		// Example 1: Filter names starting with 'A'
		Predicate<String> startsWithAPredicate = name -> name.startsWith("A");

		List<String> namesStartingWithA = filterNames(names, startsWithAPredicate);
		System.out.println("Names starting with 'A': " + namesStartingWithA);

		// Example 2: Filter names with more than 4 characters
		Predicate<String> lengthGreaterThanFourPredicate = name -> name.length() > 4;
		List<String> namesWithLengthGreaterThanFour = filterNames(names, lengthGreaterThanFourPredicate);
		System.out.println("Names with length greater than 4: " + namesWithLengthGreaterThanFour);
	}

	public static List<String> filterNames(List<String> names, Predicate<String> predicate) {
		List<String> filteredNames = new ArrayList<>();
		for (String name : names) {
			if (predicate.test(name)) {
				filteredNames.add(name);
			}
		}
		return filteredNames;
	}
}
