package Backup.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
	
	
	public static void main(String[] args) {
		String[] input = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(groupAnagram(input));

	}
	
	private static List<List<String>> groupAnagram(String[] input) {
		Map<String, List<String>> result = new HashMap<>();
		for (String str : input) {
			char[] arrayChar = str.toCharArray();
			Arrays.sort(arrayChar);
			result.computeIfAbsent(new String(arrayChar), k -> new ArrayList<>()).add(str);
		}
		return new ArrayList<>(result.values());
	}

//		public List<List<String>> groupAnagrams(String[] strs) {
//		    List<List<String>> res = new ArrayList<>();
//		    HashMap<String, ArrayList<String>> map = new HashMap<>();
//			//to store the "sorted" string element with an ArrayList containing the different permutations found in the provided string array
//		    String[] sortedStr = new String[strs.length]; 
//			//this String array will contain sorted values of the original array, mapped to the same position which will later be used to retrieve the original permutation
//		    int n = strs.length;
//		    for(int i = 0; i< n; i++){
//		        char[] cs = strs[i].toCharArray();
//		        Arrays.sort(cs);
//		        sortedStr[i] = String.valueOf(cs);
//		    }
//
//		    for (int i = 0; i < n; i++) {
//		        String s = sortedStr[i];
//		        if(!map.containsKey(s)){
//		            ArrayList<String> arrayList = new ArrayList<>();
//		            arrayList.add(strs[i]);
//		            map.put(s, arrayList);
//		        }else {
//		            //if map contains the key
//		            map.get(s).add(strs[i]);
//		        }
//		    }
//		    
//		    for(Map.Entry<String, ArrayList<String>> elem : map.entrySet()){
//		        res.add(elem.getValue());
//		    }
//
//		    return res;
//		}
}
