package com.concurrent.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/*
 * Fail Fast Iterator Example
 */
public class NeedOfConrColletion {

	public static void main(String[] args) {
		HashSet<Integer> aq = new HashSet<>();
		aq.add(10);
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		
		Iterator<Integer> itr = a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			a.add(40);
		}
	}
}
