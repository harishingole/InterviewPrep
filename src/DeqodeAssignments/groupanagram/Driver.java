package DeqodeAssignments.groupanagram;

public class Driver {

	public static void main(String[] args) {
		String[] in = { "eat", "tea", "tan", "ate", "nat", "bat" };
		AnagramGroups ag = new AnagramGroups(in);
		ag.setSortedStr();
		ag.setMap();
		System.out.println(new ConvertMapToSet().converMapToSet(ag.getMap()));
	}
}
