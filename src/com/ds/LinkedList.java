package com.ds;

public class LinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	private void append(int i) {
		Node newNode = new Node(i);

		if (head == null) {
			head = new Node(i);
		} else {
			newNode.next = null;
			Node last = head;

			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
	}

	private void insertAtFront(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			newNode.next = null;
		} else {
			newNode.next = head;
		}
		head = newNode;
	}

	private void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + "->");
			tnode = tnode.next;
		}
		System.out.println();

	}

	private void addTwoList(LinkedList l1, LinkedList l2) {
		Node newNode = null;
		while (l1.head.next != null && l2.head.next != null) {
			newNode = new Node(l1.head.data + l2.head.data);
			if(newNode.data == 10) {
				newNode.data = 0;
			}
			if (head == null) {
				head = newNode;
			} else {
				newNode.next = null;
				Node last = head;
				while (last.next != null) {
					last = last.next;
				}
				last.next = newNode;
			}
			l1.head = l1.head.next;
			l2.head = l2.head.next;
		}
		newNode = new Node(l1.head.data + l2.head.data);
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = newNode;
	}

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		l1.append(2);
		l1.append(4);
		l1.append(3);
		l2.append(5);
		l2.append(6);
		l2.append(4);
		l1.printList();
		l2.printList();

		LinkedList l3 = new LinkedList();

		l3.addTwoList(l1, l2);
		l3.printList();
	}

}