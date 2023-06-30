package com.multithreading;

public class ThreadDemo {
	public static void main(String... s) {

		new MyThread().start();
		new MyThread1().start();
		new MyThread2().start();
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Main Thread");
		}
	}
}
