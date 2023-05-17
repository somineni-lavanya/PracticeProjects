package pack;

import java.util.Queue;
import java.util.LinkedList;

public class QueueImpl {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();

		// Inserting elements into the queue
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		queue.offer(50);

		System.out.println("Queue after inserting elements: " + queue);

		// Removing elements from the queue
		int removedElement = queue.poll();
		System.out.println("Removed element: " + removedElement);

		System.out.println("Queue after removing an element: " + queue);

	}
}
