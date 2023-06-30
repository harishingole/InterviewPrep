package com.ds;

public class Queue {

	static final int MAX = 100;
	int rear;
	int front;
	int [] a = new int[MAX];
	
	Queue() {
		rear = -1;
		front = -1;
	}

	boolean isEmpty() {
		return rear < 0;
	}

	
	private void enque(int data) {
		if(rear == MAX - 1) {
			System.out.println("Queue is Overflow");
		}
		if(rear < MAX) {
			if(front == -1) {
				front = 0;
			}
			a[++rear] = data;
		}
	}
	private int deque() {
		if(!isEmpty()) {
			return a[++front];
		}else {
			System.out.println("Q is empty");
			return 0;
		}
	}
	
	private void display() {
		for (int i = front; i < rear; i++) {
			System.out.println("Q is :: - " +a[i]);
		}
	}
	
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enque(10);
		q.enque(11);
		q.enque(12);
		q.deque();
		q.display();
	}
}
