package com.ds;

public class BinaryTree {
	Node root;

	public BinaryTree() {
		this.root = null;
	}
	static class Node {
		private Node prev;
		private int data;
		private Node next;

		public Node(int data) {
			this.prev = null;
			this.data = data;
			this.next = null;
		}
	}

//	private Node create(int data) {
//		if (root == null) {
//			return new Node(data);
//		}
//		
//	}

	public static void main(String[] args) {
		BinaryTree b = new BinaryTree();
//		Node n = b.create(10);
	}

}
