package java_15B_collections_programs_list_interface_42;

import java.util.LinkedList;

public class Java_06K_Linkedlist_Class {

	public static void main(String[] args) {

		// Create a new linked list
		LinkedList<Integer> linkedList = new LinkedList<>();

		// Add elements to the linked list
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);

		// Add an element to the beginning of the linked list
		linkedList.addFirst(0);

		// Add an element to the end of the linked list
		linkedList.addLast(4);

		// Print the elements of the linked list
		for (int i : linkedList) {
			System.out.println(i);
		}
	}
}
