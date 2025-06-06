package java_15A_collections_programs_40;

//Java program to demonstrate 
//working of shuffle() method
//of Collections class

//Importing utility classes
import java.util.ArrayList;
import java.util.Collections;

//Main class
public class Java_06A_Shuffle_The_Elements_Of_A_Collection {

	// Main driver method
	public static void main(String[] args) {

		// Creating an empty ArrayList of string type
		ArrayList<String> mylist = new ArrayList<String>();

		// Adding custom input elements to list object
		mylist.add("code");
		mylist.add("quiz");
		mylist.add("geeksforgeeks");
		mylist.add("quiz");
		mylist.add("practice");
		mylist.add("qa");

		// Printing list before shuffling
		System.out.println("Original List : \n" + mylist);

		// Shuffling the list
		Collections.shuffle(mylist);

		// Printing list after shuffling
		System.out.println("\nShuffled List : \n" + mylist);
	}
}
