package com.multithreading;

import java.util.Hashtable;
import java.util.Set;

//Different Threads are performming different task

class MyThread extends Thread {
	Hashtable<Integer, Integer> hs = new Hashtable<>();
	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			hs.put(i, i);
			System.out.println("User-Defined Thread 0");
		}
	

		Set<Integer> set = hs.keySet();
		for (Integer i1 : set) {
			System.out.println(i1);
		}
		
	}

}

class MyThread1 extends Thread {

	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("User-Defined Thread1");
		}
	}

}

class MyThread2 extends Thread {

	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("User-Defined Thread2");
		}
	}

}

