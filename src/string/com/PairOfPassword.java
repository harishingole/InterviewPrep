package string.com;

import java.util.Arrays;
import java.util.List;

/*
 * Find the total no. of pairs of password and familyPassword in the given list of String.
 * Suppose password is "abc" then its familyPassword becomes "bcd" 
 * {familyPassword of "abc"->{nextChar of "a"+ nextChar of "b"+ nextChar of "c"}}
 * ex{ "abc", "pqr", "bcd", "qrs", "xyz" };
 */
public class PairOfPassword {

//	public static void main(String[] args) {
//	
//		String[] arrayOfString =  { "abc", "pqr", "bcd", "qrs", "xyz" };
//		String nextString = "";
//		int count = 0;
//		for (int i = 0; i < arrayOfString.length; i++) {
//			String temp = arrayOfString[i];
//			for (int j = 0; j < temp.length(); j++) {
//				nextString = nextString + findNextChar(temp.charAt(j));
//			}
//			
//			for (int j = 0; j < arrayOfString.length; j++) {
//				if(nextString.equals(arrayOfString[j])) {
//					System.out.println("The family password of " +"'"+ temp +"'"+ " is " +"'"+  nextString +"'");
//					count++;
//				}
//			}
//			
//			nextString = "";
//			temp = "";
//		}
//		System.out.println("The total no of pairs of password and familyPassword is : "+ count);
//	}

	public static void main(String[] args) {
		List<String> input = Arrays.asList("abc", "pqr", "bcd", "qrs", "cde");
		int count = 0;
		for (String s : input) {

			String newStr = Character.toString(s.charAt(0) + 1) + Character.toString(s.charAt(1) + 1)
					+ Character.toString(s.charAt(2) + 1);

			if (input.stream().anyMatch(str -> str.equals(newStr))) {
				count++;
			}
		}
		System.out.println(count);
	}
//	private static String findNextChar(char c) {
//		String tempStr = "";
//		char nextChar;
//		if (c == 'z') {
//		    nextChar = 'a';
//		    tempStr = tempStr + nextChar;
//		}else if (c == 'Z') {
//		    nextChar = 'A';
//		    tempStr = tempStr + nextChar;
//		}else {
//		    nextChar = (char)(((int)c) + 1);
//		    tempStr = tempStr + nextChar;
//		}
//		return tempStr;
//	}
}
