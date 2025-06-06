package java_15F_collections_programs_sorted_set_interface_22;

//Java program to demonstrate the working 
//of add(), last(), pollFirst(), size()
import java.util.concurrent.ConcurrentSkipListSet;

public class Java_03C_ConcurrentSkipListSet_Class {

	public static void main(String[] args) {

		// Initializing the set using
		// ConcurrentSkipListSet()
		ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<Integer>();

		// Adding elements to this set
		// using add() method
		set.add(78);
		set.add(64);
		set.add(12);
		set.add(45);
		set.add(8);

		// Printing the ConcurrentSkipListSet
		System.out.println("ConcurrentSkipListSet: " + set);

		// Printing the highest element of the set
		// using last() method
		System.out.println("The highest element of the set: " + set.last());

		// Retrieving and removing first element of the set
		System.out.println("The first element of the set: " + set.pollFirst());

		// Checks if 9 is present in the set
		// using contains() method
		if (set.contains(9))
			System.out.println("9 is present in the set.");
		else
			System.out.println("9 is not present in the set.");

		// Printing the size of the set
		// using size() method
		System.out.println("Number of elements in the set = " + set.size());
	}
}