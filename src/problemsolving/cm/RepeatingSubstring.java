package problemsolving.cm;

public class RepeatingSubstring {

	public static void main(String[] args) {

		String str = "rammarrammarmrammarram";
		String pattern = "ram";
		int j = 0;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == pattern.charAt(j)) {
				j++;
			}
			if (j % pattern.length() == 0 && j != 0) {
				count++;
			}
			if (j == pattern.length()) {
				j = 0;
			}
		}
		System.out.println(count);
	}

}
