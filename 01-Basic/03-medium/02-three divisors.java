/*
A number has exactly 3 divisors if and only if it is the square of a prime number.

Examples:

4 = 2² → divisors: 1, 2, 4 → 3 divisors
9 = 3² → divisors: 1, 3, 9 → 3 divisors
16 = 4² → divisors: 1, 2, 4, 8, 16 → 5 divisors, not valid
*/
import java.util.*;

class Solution {

    // Function to count numbers <= n
    // that have exactly 3 divisors
    public static int countNumbers(int n) {

        // A number has exactly 3 divisors
        // if and only if it is the square of a prime number.
        //
        // Example:
        // 4 = 2 * 2 -> divisors: 1, 2, 4
        // 9 = 3 * 3 -> divisors: 1, 3, 9

        // We only need to check prime numbers
        // up to sqrt(n).
        int limit = (int) Math.sqrt(n);

        // Stores the number of valid numbers
        int count = 0;

        // Check every number from 2 to sqrt(n)
        for (int i = 2; i <= limit; i++) {

            // If i is prime, then i*i has exactly 3 divisors
            if (isPrime(i)) {
                count++;
            }
        }

        return count;
    }

    // Function to check whether a number is prime
    public static boolean isPrime(int n) {

        // Numbers less than 2 are not prime
        if (n < 2) {
            return false;
        }

        // Check divisibility from 2 to sqrt(n)
        for (int i = 2; i * i <= n; i++) {

            // If n is divisible by i, it is not prime
            if (n % i == 0) {
                return false;
            }
        }

        // No divisor found, so n is prime
        return true;
    }

    // Function to process all queries
    public static int[] solve(int[] queries) {

        // Create an array to store answers
        int[] result = new int[queries.length];

        // Process each query
        for (int i = 0; i < queries.length; i++) {

            // Find the count for the current query
            result[i] = countNumbers(queries[i]);
        }

        return result;
    }

    public static void main(String[] args) {

        // Example input
        int[] queries = {3, 10};

        // Process all queries
        int[] result = solve(queries);

        // Print the result
        System.out.println(Arrays.toString(result));
    }
}


