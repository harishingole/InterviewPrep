package problemsolving.cm;

import java.util.HashMap;

public class RomanToInteger {

	private int romanToIntUsingMap(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		char[] ch = s.toCharArray();
		int add = 0, prev = 0;

		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i])) {
				if (map.get(ch[i]) > prev) {
					add += map.get(ch[i]);
				} else {
					add -= map.get(ch[i]);
				}
				prev = map.get(ch[i]);
			}
		}
		return add;
	}

	private int romanToInt(String s) {
		int ans = 0, num = 0, prev = 0;
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case 'I' -> num = 1;
			case 'V' -> num = 5;
			case 'X' -> num = 10;
			case 'L' -> num = 50;
			case 'C' -> num = 100;
			case 'D' -> num = 500;
			case 'M' -> num = 1000;
			}
			if (i + 1 < s.length()) {
				if (num >= prev) {
					ans += num;
				} else {
					ans -= num;
				}
			} else {
				ans += num;
			}
			prev = num;

		}
		return ans;
	}

	public static void main(String[] args) {
		String s = "MMCCIX";
		System.out.println(new RomanToInteger().romanToInt(s));
//		System.out.println(new RomanToInteger().romanToIntUsingMap(s));
	}

}
