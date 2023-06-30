package com.ds;

public class Stack {

	static final int MAX = 100;
	int top;
	int [] a = new int[MAX];

	Stack() {
		top = -1;
	}

	boolean isEmpty() {
		return top < 0;
	}

	boolean push(int x) {
		if (top >= (MAX - 1)) {
			System.out.println("Stack is Overflow");
			return false;
		} else {
			a[++top] = x;
			System.out.println(x + " push into stack");
			return true;
		}
	}

	int pop() {
		if (isEmpty() == true) {
			System.out.println("Stack is Underflow");
			return 0;
		} else {
			int x = a[top--];
			return x;
		}
	}

	int peek() {
		if (isEmpty() == true) {
			System.out.println("Stack is Underflow");
			return 0;
		} else {
			int x = a[top];
			return x;
		}
	}

	void printStack() {
		for (int i = top; i > -1; i--) {
			System.out.print(" " + a[i]);
		}
	}
	public static void main(String[] args) {
		Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.println("Elements present in stack :");
        s.printStack();
	}
}
