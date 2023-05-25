package string.com;

public class ReverseString {

	public static void main(String[] args) {
		String str = "My Name is XYZ";
		String reverseString = "";
		String tempStr = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				tempStr = tempStr + str.charAt(i);
			} else {
				for (int j = tempStr.length() - 1; j >= -1; j--) {
					if (j != -1) {
						reverseString = reverseString + tempStr.charAt(j);
					} else {
						reverseString = reverseString + " ";
					}
				}
				tempStr = " ";
			}
		}
		for (int j = tempStr.length() - 1; j >= -1; j--) {
			if (j != -1) {
				reverseString = reverseString + tempStr.charAt(j);
			} else {
				reverseString = reverseString + " ";
			}
		}
		String r = reverseString.replaceAll("\\s+", " ");
		System.out.println(r);

	}
}
