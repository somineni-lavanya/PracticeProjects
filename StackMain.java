package pack;

public class StackMain {

	public static void main(String[] args) {
		Stack myStack = new Stack();

		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
	}

}

class Stack {

	static final int MAX = 1000;

	int top;

	int a[] = new int[MAX];

	// helper methods
	boolean isEmpty() {
		return (top < 0);
	}

	public Stack() {
		top = -1;
	}

	// main operations (push and pop)
	boolean push(int x) {

		// check for fullness of the stack
		if (top > MAX - 1) {
			System.out.println("Stack Overflow!");
			return false;
		}

		else {
			a[++top] = x;
			System.out.println("Inserted " + x);
			return true;
		}

	}

	int pop() {

		// check for empty status
		if (isEmpty()) {
			System.out.println("Stack Underflow!");
			return -1;
		}

		else {
			int poppedVal = a[top];
			top--;
			System.out.println("Popped " + poppedVal);
			return poppedVal;
		}

	}

}
