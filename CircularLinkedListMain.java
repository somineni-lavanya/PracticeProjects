package pack;



class CircularLinkedList {

	Node head;

	class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	// Initialization of a new CircularLinkedList.
	public CircularLinkedList() {
		this.head = null;
	}

	// operations
	void sortedInsert(int data) {
		Node new_node = new Node(data);

		// case 1 if the CLL was empty
		if (this.head == null) {
			this.head = new_node;
			new_node.next = new_node;
		}
	
	Node current = this.head;
	// case 2.1
	// new node data is less than head's data.
	if (new_node.data < current.data) {
		while (current.next != head)
			current = current.next;

		current.next = new_node;
		new_node.next = this.head;
		this.head = new_node;
	}

	// 2.1 new node data is greater than head's data.
	if (new_node.data >= current.data) {
		while (current.next != head && current.next.data < new_node.data) {
			current = current.next;
		}
		new_node.next = current.next;
		current.next = new_node;
	}

}

public void printCLL() {

	Node current_node = this.head;

	do {
		System.out.print(current_node.data + "->");

		current_node = current_node.next;
	} while (current_node != this.head);

	System.out.println();

}
}

public class CircularLinkedListMain {

	public static void main(String[] args) {

		CircularLinkedList CLL1 = new CircularLinkedList();

		CLL1.sortedInsert(5);
		CLL1.printCLL();

		CLL1.sortedInsert(3);
		CLL1.printCLL();
		
		CLL1.sortedInsert(23);
	CLL1.printCLL();
	CLL1.sortedInsert(34);
	CLL1.printCLL();
	CLL1.sortedInsert(33);
	CLL1.printCLL();
	
	}

}
