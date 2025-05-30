package java_01_basic_programs_53;

//Java program to print all
//primes smaller than or equal to
//n using Sieve of Eratosthenes

public class Java_11C_Display_All_Prime_Numbers_From_1_To_N_Sieve_Of_Eratosthenes {

	void sieveOfEratosthenes(int n) {

		// Create a boolean array
		// "prime[0..n]" and
		// initialize all entries
		// it as true. A value in
		// prime[i] will finally be
		// false if i is Not a
		// prime, else true.
		boolean prime[] = new boolean[n + 1];
		for (int i = 0; i <= n; i++)
			prime[i] = true;

		for (int p = 2; p * p <= n; p++) {
			// If prime[p] is not changed, then it is a
			// prime
			if (prime[p] == true) {
				// Update all multiples of p
				for (int i = p * p; i <= n; i += p)
					prime[i] = false;
			}
		}

		// Print all prime numbers
		for (int i = 2; i <= n; i++) {
			if (prime[i] == true)
				System.out.print(i + " ");
		}
	}

	public static void main(String args[]) {

		int N = 45;
		System.out.println("All the Prime numbers within 1 and " + N + " are:");
		Java_11C_Display_All_Prime_Numbers_From_1_To_N_Sieve_Of_Eratosthenes g = new Java_11C_Display_All_Prime_Numbers_From_1_To_N_Sieve_Of_Eratosthenes();
		g.sieveOfEratosthenes(N);

	}
}