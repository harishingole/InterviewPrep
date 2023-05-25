package DeqodeAssignments;

/*
 * Operations -
 * 1. InsertAtEnd
 * 2. Reverse List
 */
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

	private void insertAtEnd(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = new Node(data);
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
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        } 
		while (tnode != null) {
			System.out.print(tnode.data + "->");
			tnode = tnode.next;
		}
		System.out.println();

	}
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.insertAtEnd(2);
		l1.insertAtEnd(4);
		l1.insertAtEnd(3);
		l1.printList();
		l1.reverseList();
		l1.printList();

	}

	private void reverseList() {
		Node preNode = null;
		Node currNode = head , nextNode = head;
		while(nextNode != null) {
			nextNode = nextNode.next;
			currNode.next = preNode;
			preNode = currNode;
			currNode = nextNode;
		}
		head = preNode;
	}

}