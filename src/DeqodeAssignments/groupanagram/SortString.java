package DeqodeAssignments.groupanagram;

import java.util.Arrays;

public class SortString {

	public String[] sortting(String[] input) {
		String[] sortedStr = new String[input.length];
		
		for (int i = 0; i < input.length; i++) {
			char[] c = input[i].toLowerCase().toCharArray();
			Arrays.sort(c);
			sortedStr[i] = String.valueOf(c);
		}
		return sortedStr;
	}

}
