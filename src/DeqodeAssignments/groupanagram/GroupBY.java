package DeqodeAssignments.groupanagram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroupBY {

	public Map<String, ArrayList<String>> createGroupping(String[] sortedStr, String[] input) {
		HashMap<String, ArrayList<String>> map = new HashMap<>();
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
		return map;
	}

}
