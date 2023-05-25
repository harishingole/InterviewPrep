package problemsolving.cm;

import java.util.HashMap;

public class RomanToInteger {

	private void romanToInt(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		char[] ch = s.toCharArray();
		int add = 0;
		for (int i = 0; i < ch.length; i++) {

			if (map.containsKey(ch[i])) {
				add = add + map.get(ch[i]);
			}

		}
		System.out.println(add);
	}

	public static void main(String[] args) {
		String s = "MCMXCIV";
		new RomanToInteger().romanToInt(s);
	}

}
