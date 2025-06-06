package java_15A_collections_programs_40;

import java.util.LinkedList;

public class Java_01C_Use_Different_Types_Of_Collection_LinkedList {

	// Main Method
	public static void main(String[] args) {

		// Declaring the LinkedList
		LinkedList<Integer> ll = new LinkedList<Integer>();

		// Appending new elements at
		// the end of the list
		for (int i = 1; i <= 5; i++)
			ll.add(i);

		// Printing elements
		System.out.println(ll);

		// Remove element at index 3
		ll.remove(3);

		// Displaying the List
		// after deletion
		System.out.println(ll);

		// Printing elements one by one
		for (int i = 0; i < ll.size(); i++)
			System.out.print(ll.get(i) + " ");
	}
}
