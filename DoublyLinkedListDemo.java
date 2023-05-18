package pack;

public class DoublyLinkedListDemo {
      private static class Node {
		int data;
		Node prev;
		Node next;
         Node(int data) {
			this.data = data;
		}
	    }
      private static class DoublyLinkedList {
		Node head;

		// Method to traverse the doubly linked list in the forward direction
		void traverseForward() {
			if (head == null) {
				System.out.println("Doubly linked list is empty.");
				return;
			}

			Node current = head;
			System.out.print("Forward traversal: ");
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
			System.out.println();
		}

		// Method to traverse the doubly linked list in the backward direction
		void traverseBackward() {
			if (head == null) {
				System.out.println("Doubly linked list is empty.");
				return;
			}

			Node current = head;
			// Move to the last node
			while (current.next != null) {
				current = current.next;
			}

			System.out.print("Backward traversal: ");
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.prev;
			}
			System.out.println();
		}

		// Method to insert a node at the beginning of the doubly linked list
		void insertAtBeginning(int data) {
			Node newNode = new Node(data);
			newNode.next = head;
			if (head != null) {
				head.prev = newNode;
			}
			head = newNode;
		}

		public static void main(String[] args) {
			DoublyLinkedList list = new DoublyLinkedList();

			list.insertAtBeginning(1);
			list.insertAtBeginning(6);
			list.insertAtBeginning(5);

			list.traverseForward();
			list.traverseBackward();
		}

	}
}
