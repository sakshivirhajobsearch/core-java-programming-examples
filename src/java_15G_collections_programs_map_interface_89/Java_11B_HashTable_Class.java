package java_15G_collections_programs_map_interface_89;

import java.util.Hashtable;

public class Java_11B_HashTable_Class {

	public static void main(String args[]) {

		// No need to mention the
		// Generic type twice
		Hashtable<Integer, String> ht1 = new Hashtable<>();

		// Initialization of a Hashtable
		// using Generics
		Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>();

		// Inserting the Elements
		// using put() method
		ht1.put(1, "one");
		ht1.put(2, "two");
		ht1.put(3, "three");

		ht2.put(4, "four");
		ht2.put(5, "five");
		ht2.put(6, "six");

		// Print mappings to the console
		System.out.println("Mappings of ht1 : " + ht1);
		System.out.println("Mappings of ht2 : " + ht2);
	}
}