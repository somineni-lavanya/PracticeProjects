package pack;

class LinkedList {
	Node head;

	class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}

	}

	// Initialization of a new LinkedList.
	public LinkedList() {
		this.head = null;
	}

	// some opeartion
	public void insert(int data) {
		Node new_node = new Node(data);

		// case 1 if the LL was empty
		if (this.head == null) {
			this.head = new_node;
		}

		else { // LL has some elements in it already

			Node current_node = this.head;

			while (current_node.next != null) {
				current_node = current_node.next;
			}
			;
			// now current node is at the tail position
			current_node.next = new_node;

		}

	}

	public void deleteByKey(int key) {
		Node current_node = this.head;
		// case 1 head's data is key

		if (this.head.data == key) {
			this.head = this.head.next;
			System.out.println("Found the key at head and deleted ");
		}

		// key is there somewhere the head
		Node prev = current_node;
		while (current_node != null && current_node.data != key) {
			prev = current_node;
			current_node = current_node.next;
		}

		// after the above while loop
		// two possibilities : either current_node stopped at
		// node that has the key
		// OR it would have gone till the tail
		if (current_node != null) // we found the key!!
		{
			prev.next = current_node.next;
			System.out.println("Found the key  and deleted ");
		}

		if (current_node == null) {
			System.out.println("Did not find the given key ");
		}
	}

	public void printLL() {

		Node current_node = this.head;

		while (current_node != null) {
			System.out.print(current_node.data + "->");

			current_node = current_node.next;
		}

		System.out.println();

	}
}

class MyLinkedlistmain {

	public static void main(String[] args) {
		LinkedList LL1 = new LinkedList();

		LL1.insert(8);
		LL1.insert(16);
		LL1.insert(23);
		LL1.insert(7);
		LL1.insert(78);
		LL1.insert(55);

		LL1.printLL();

		LL1.deleteByKey(8);
		LL1.printLL();

		LL1.deleteByKey(23);
		LL1.printLL();

		LL1.deleteByKey(100);
		LL1.printLL();
	}

}
