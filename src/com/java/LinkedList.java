package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkedList {

	static class Node {
		int val;
		Node next;

		Node(int x) {
			val = x;
		}
	}

	private static int[] stringToIntegerArray(String input) {
		input = input.trim();
		input = input.substring(0, input.length());
		if (input.length() == 0) {
			return new int[0];
		}

		String[] parts = input.split(", ");
		int[] output = new int[parts.length];
		for (int i = 0; i < parts.length; i++) {
			String part = parts[i].trim();
			output[i] = Integer.parseInt(part);
		}
		return output;
	}

	private static Node stringToListNode(String input) {

		// Generating array from the input
		int[] nodeValues = stringToIntegerArray(input);
		Node dummyNode = new Node(0);
		Node ptr = dummyNode;
		for (int item : nodeValues) {
			ptr.next = new Node(item);
			ptr = ptr.next;
		}
		return dummyNode.next;
	}

	public static void prettyPrintLinkedList(Node node) {
		while (node != null && node.next != null) {
			System.out.print(node.val + "->");
			node = node.next;
		}
		if (node != null) {
			System.out.println(node.val);
		} else {
			System.out.println("Empty Linked List");
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter data to create linkedList");
		String line;
		while ((line = in.readLine()) != null) {
			Node node = LinkedList.stringToListNode(line);
			LinkedList.prettyPrintLinkedList(node);
		}
	}

}
