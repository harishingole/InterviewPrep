package problemsolving.cm;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] s = new String[] { "flower", "flight", "flown"};
		String out = new LongestCommonPrefix().longestCommonPrefix(s);
		System.out.println("LongestCommonPrefix :: - "+out);
	}

	private String longestCommonPrefix(String[] s) {
		Arrays.sort(s);
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		String s1 = s[0];
		String s2 = s[s.length - 1];
		int itr = 0;
		while (itr < s1.length()) {
			if (s1.charAt(itr) == s2.charAt(itr)) {
				itr++;
			} else {
				break;
			}
		}
		return s1.substring(0, itr);
	}
}
