package java_15B_collections_programs_list_interface_42;

//Java program to change elements
//in a LinkedList
import java.util.LinkedList;

public class Java_06D_Linkedlist_Class {

	public static void main(String args[]) {

		LinkedList<String> ll = new LinkedList<>();

		ll.add("Geeks");
		ll.add("Geeks");
		ll.add(1, "Geeks");

		System.out.println("Initial LinkedList " + ll);

		ll.set(1, "For");

		System.out.println("Updated LinkedList " + ll);
	}
}
