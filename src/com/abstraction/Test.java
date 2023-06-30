package com.abstraction;

class MyClass {

	int a = 8;
	int b;

	MyClass() {

	}

	MyClass(int a) {
		this();
		a = 10;
		b = 20;
	}
}

public class Test extends MyClass {
	public static void main(String[] args) {
		//System.out.println(a);
		//System.out.println(a);
	}
}