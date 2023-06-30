package DeqodeAssignments.groupanagram;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertMapToSet {

	public List<List<String>> converMapToSet(Map<String, ArrayList<String>> map) {
		List<List<String>> groups = new ArrayList<>();
		Set<Entry<String, ArrayList<String>>> set = map.entrySet();
		groups = set.stream().map(Entry::getValue).collect(Collectors.toList());
		return groups;
	}

}
