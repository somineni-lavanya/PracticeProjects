package pack;

import java.util.Stack;

public class StackImpl {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();

		// Inserting elements into the stack
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		System.out.println("Stack after inserting elements: " + stack);

		// Removing elements from the stack
		int removedElement = stack.pop();
		System.out.println("Removed element: " + removedElement);

		System.out.println("Stack after removing an element: " + stack);
	}
}