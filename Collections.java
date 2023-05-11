package package2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

public class Collections {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();// ArrayList
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Mango");
		System.out.println("ArrayList:");
		for (String fruit : arrayList) {
			System.out.println(fruit);
		}
		System.out.println("");
		Vector<String> cityVector = new Vector<String>();// vector
		cityVector.addElement("Banglore");
		cityVector.addElement("Karnataka");
		cityVector.addElement("Pune");
		cityVector.addElement("Hyderabad");
		System.out.println("VectorList:");

		for (String city : cityVector) {
			System.out.println(city);
		}
		HashSet<Integer> hashSet = new HashSet<Integer>();// HashSet
		hashSet.add(100);
		hashSet.add(200);
		hashSet.add(300);

		System.out.println("\nHashSet");
		for (int number : hashSet) {
			System.out.println(number);
		}
		LinkedList<String> linkedList = new LinkedList<>();//LinkedList
		linkedList.add("Cat");
		linkedList.add("Dog");
		linkedList.add("Elephant");

		System.out.println("\nLinkedList:");
		for (String animal : linkedList) {
			System.out.println(animal);
		}
	}
}


