//A perfect number is a number whose proper divisors add up to the number itself.
/*
6 → divisors: 1, 2, 3
1 + 2 + 3 = 6
  */
//The naive approach checks every number from 1 to n - 1 and finds all proper divisors.
public class PerfectNumber {

    // Method to check whether n is a perfect number
    public static boolean isPerfect(int n) {

        // Store the sum of proper divisors
        int sum = 0;

        // Check every number from 1 to n-1
        for (int i = 1; i < n; i++) {

            // If i divides n completely, it is a proper divisor
            if (n % i == 0) {

                // Add the divisor to the sum
                sum += i;
            }
        }

        // Check whether sum of divisors equals n
        return sum == n;
    }

    public static void main(String[] args) {

        int n = 6;

        // Call method and print the result
        System.out.println(isPerfect(n));
    }
}
//Dry Run: n = 6
/*
i = 1 → 6 % 1 = 0 → sum = 1
i = 2 → 6 % 2 = 0 → sum = 3
i = 3 → 6 % 3 = 0 → sum = 6
i = 4 → 6 % 4 ≠ 0
i = 5 → 6 % 5 ≠ 0
*/
// Naive approach:
// Check every number from 1 to n-1
// Find proper divisors and add them
// If their sum equals n, n is a perfect number

//Beginner Approach---------------------------------------------->>>>>>>>>>>>>>
public class PerfectNumber {

    // Method to check whether n is a perfect number
    public static boolean isPerfect(int n) {

        // Numbers less than or equal to 1 are not perfect
        if (n <= 1) {
            return false;
        }

        // Store the sum of proper divisors
        int sum = 0;

        // Check divisors from 1 to n/2
        for (int i = 1; i <= n / 2; i++) {

            // If i divides n completely, it is a proper divisor
            if (n % i == 0) {

                // Add the divisor to the sum
                sum += i;
            }
        }

        // A perfect number equals the sum of its proper divisors
        return sum == n;
    }

    public static void main(String[] args) {

        int n = 6;

        // Call method and print the result
        System.out.println(isPerfect(n));
    }
}
/*
Dry Run: n = 15
sum = 0


i = 1 → 15 % 1 = 0 → sum = 1
i = 2 → 15 % 2 ≠ 0
i = 3 → 15 % 3 = 0 → sum = 4
i = 4 → 15 % 4 ≠ 0
i = 5 → 15 % 5 = 0 → sum = 9
i = 6 → not divisor
i = 7 → not divisor
...

Final:

sum = 9
n = 15


9 == 15 → false
  */
// Concept: divisor checking + accumulator
// Find all proper divisors of n
// Add the divisors and compare their sum with n

