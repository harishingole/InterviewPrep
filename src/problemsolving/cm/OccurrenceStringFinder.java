package problemsolving.cm;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceStringFinder {
	static int MAX = 100;

	public static void main(String[] args) {
		String str = "google microsssssggdddsssssoft heeeeeello worllld";
		StringBuffer tmpStr = new StringBuffer();
		int j = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				tmpStr.append(str.charAt(i));
				j++;
			} else {
				String returnString = checOccurences(map, tmpStr, j);
				j = 0;
			}
		}

	}

	private static String checOccurences(Map<Character, Integer> map, StringBuffer sb, int j) {
		String str = new String(sb);
		for (int i = 0; i < j; i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		str = "";
		return "";
	}
}
