package DeqodeAssignments;

public class DoublyLinkedList {

	Node head, tail;

	static class Node {
		Node prev;
		int data;
		Node next;

		public Node(int d) {
			this.prev = null;
			this.data = d;
			this.next = null;

		}
	}

	private void insert(int d) {
		Node newNode = new Node(d);
		if (head == null) {
			head = tail = newNode;
			head.prev = null;
			tail.prev = null;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			tail.next = null;
		}
	}

	public void print() {
		Node current = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of doubly linked list: ");
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DoublyLinkedList d = new DoublyLinkedList();
		d.insert(1);
		d.insert(2);
		d.insert(3);
		d.insert(2);
		d.insert(1);
		d.print();
		if (d.isListPalindrome()) {
			System.out.println("Doubly LinkedList is Palindrome");
		} else {
			System.out.println("Doubly LinkedList is not Palindrome");
		}

	}

	private boolean isListPalindrome() {
		Node tmp1 = head;

		// Check head is null or not
		if (tmp1 == null) {
			return true;
		} else {
			Node tmp2 = tmp1;
			// Iterate till null
			while (tmp2.next != null) {
				tmp2 = tmp2.next;
			}
			// compare
			while (tmp1 != tmp2) {
				if (tmp1.data != tmp2.data) {
					return false;
				}
				tmp1 = tmp1.next;
				tmp2 = tmp2.prev;
			}
		}
		return true;
	}

}
