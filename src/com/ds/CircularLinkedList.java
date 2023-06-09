package com.ds;

import com.ds.LinkedList.Node;

public class CircularLinkedList {
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
		if(head == null) {
			head = newNode;
			head.next = head;
		}else {
			Node last = head;
			while(last.next != null) {
				last = last.next;
			}
			newNode.next = head;
			last.next = newNode;
			head = newNode;
		}
	}
	private void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + "->");
			tnode = tnode.next;
		}
		System.out.println();

	}
	public static void main(String[] args) {
		CircularLinkedList cl = new CircularLinkedList();
		cl.append(10);
	}
}
