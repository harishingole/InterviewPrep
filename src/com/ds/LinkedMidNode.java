package com.ds;
public class LinkedMidNode {

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

	private void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + "->");
			tnode = tnode.next;
		}
		System.out.println();

	}
	public static void main(String[] args) {
		LinkedMidNode l1 = new LinkedMidNode();
		for (int i = 12; i > 0; i--) {
			l1.append(i);
		}
		
		l1.printList();
		l1.midFinder();

	}

	private void midFinder() {
		int count = 0;
		Node tnode = head;
		/**
		 * below iterator take O(n) to find the length of the linkedlist
		 */
		while (tnode != null) {
			tnode = tnode.next;
			count++;
		}
		Node midNode = head;
		int mid = (count / 2) + 1;
		int temp = 0;
		/**
		 * take log n to find out mid of the linked list
		 */
		while(midNode != null) {
			temp++;
			if(mid == temp) {
				System.out.print("Mid Node of Linked List -> " + midNode.data);
				break;
			}
			midNode = midNode.next;
			
		}
	}
}