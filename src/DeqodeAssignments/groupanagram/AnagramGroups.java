package DeqodeAssignments.groupanagram;

import java.util.ArrayList;
import java.util.Map;

public class AnagramGroups {
	private String[] input;
	private String[] sortedStr;
	private Map<String, ArrayList<String>> map;

	public AnagramGroups(String[] input) {
		this.input = input;
	}

	public void setSortedStr() {
		this.sortedStr = new SortString().sortting(input);
	}

	public void setMap() {
		this.map = new GroupBY().createGroupping(sortedStr, input);
	}

	public String[] getInput() {
		return input;
	}

	public String[] getSortedStr() {
		return sortedStr;
	}

	public Map<String, ArrayList<String>> getMap() {
		return map;
	}
}
