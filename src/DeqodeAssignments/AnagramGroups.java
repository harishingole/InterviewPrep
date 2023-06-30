package DeqodeAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class AnagramGroups {

	private List<List<String>> groupAnagram(String[] input) {
		List<List<String>> groups = new ArrayList<>();
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		String[] sortedStr = new String[input.length];

		sortString(input, sortedStr);

		groupBy(input, map, sortedStr);

		convertMapToSet(groups, map);

		return groups;
	}

	private void convertMapToSet(List<List<String>> groups, HashMap<String, ArrayList<String>> map) {
		Set<Entry<String, ArrayList<String>>> set = map.entrySet();
		set.stream().forEach(e -> {
			groups.add(e.getValue());
		});
	}

	private void groupBy(String[] input, HashMap<String, ArrayList<String>> map, String[] sortedStr) {
		for (int i = 0; i < input.length; i++) {
			String s = sortedStr[i];
			if (!map.containsKey(s)) {
				ArrayList<String> arrayList = new ArrayList<>();
				arrayList.add(input[i]);
				map.put(s, arrayList);
			} else {
				map.get(s).add(input[i]);
			}
		}
	}

	private static void sortString(String[] input, String[] sortedStr) {
		for (int i = 0; i < input.length; i++) {
			char[] c = input[i].toLowerCase().toCharArray();
			Arrays.sort(c);
			sortedStr[i] = String.valueOf(c);
		}
	}

	public static void main(String[] args) {
		String[] input = { "eat", "tea", "tan", "ate", "nat", "bat" };
		new AnagramGroups().groupAnagram(input).stream().forEach(System.out::println);
		;
	}

}
