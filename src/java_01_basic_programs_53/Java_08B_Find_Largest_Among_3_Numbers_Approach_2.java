package java_01_basic_programs_53;

public class Java_08B_Find_Largest_Among_3_Numbers_Approach_2 {

	// Function to find the biggest of three numbers
	static int biggestOfThree(int x, int y, int z) {

		// Comparing all 3 numbers
		if (x >= y && x >= z)

			// Returning 1st number if largest
			return x;

		// Comparing 2nd no with 1st and 3rd no
		else if (y >= x && y >= z)

			// Return z if the above conditions are false
			return y;

		else

			// Returning 3rd no, Its sure it is greatest
			return z;
	}

	public static void main(String[] args) {

		int a, b, c, largest;

		// Considering random integers three numbers
		a = 5;
		b = 10;
		c = 3;
		// Calling the function in main() body
		largest = biggestOfThree(a, b, c);

		// Printing the largest number
		System.out.println(largest + " is the largest number.");
	}
}