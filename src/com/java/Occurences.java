package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Occurences {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,5,3,4,4,4,4,4,5,5,5,5};
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i : arr) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			}else {
				map.put(i, 1);
			}
		}
		
		Set<Entry<Integer, Integer>> set = map.entrySet();
		
		set.stream().filter(p-> p.getKey() >= 4).forEach(System.out::println);
	}
}
