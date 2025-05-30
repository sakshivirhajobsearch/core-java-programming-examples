package java_01_basic_programs_53;

//Main class
//TestEvenOddByCheckingLSB
public class Java_07E_Check_Even_Or_Odd_Integers_LSB {

	// Method 1
	// To test number is even or odd
	public static String testOddEvenByCheckingLSB(int a) {

		if (a != 0) {
			if (Integer.toBinaryString(a).endsWith("0")) {
				return "Even";
			} else {
				return "Odd";
			}
		}

		// Here we will land if
		// it does not ends with 0
		else {
			return "Zero";
		}
	}

	// Method 2
	public static void main(String[] args) {

		// Iterationg over using for loop
		for (int i = 0; i <= 10; i++) {

			// Calling the function and printing
			// corresponding number is even or odd
			System.out.println(i + " : " + testOddEvenByCheckingLSB(i));
		}
	}
}
