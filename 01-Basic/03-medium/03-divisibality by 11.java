/*
Since the number can be extremely large, don't convert the string to long or int.

We can use the divisibility rule for 11:

Find the alternating sum of digits. If the result is divisible by 11, the number is divisible by 11.
  */
class Solution {

    // Function to check whether a large number is divisible by 11
    public static boolean isDivisibleBy11(String s) {

        // Store the alternating sum of digits
        int sum = 0;

        // Traverse every digit of the string
        for (int i = 0; i < s.length(); i++) {

            // Convert character to integer digit
            int digit = s.charAt(i) - '0';

            // Add digits at even positions
            if (i % 2 == 0) {
                sum += digit;
            }

            // Subtract digits at odd positions
            else {
                sum -= digit;
            }
        }

        // If the alternating sum is divisible by 11,
        // then the original number is divisible by 11
        return sum % 11 == 0;
    }

    public static void main(String[] args) {

        // Example 1
        String s1 = "76945";

        // Example 2
        String s2 = "7695";

        // Example 3
        String s3 = "1234567589333892";

        // Print results
        System.out.println(isDivisibleBy11(s1));
        System.out.println(isDivisibleBy11(s2));
        System.out.println(isDivisibleBy11(s3));
    }
}

/*
Output
true
false
true
Example: "76945"

Calculate alternating sum:

7 - 6 + 9 - 4 + 5
= 11

11 % 11 == 0

Therefore:

76945 is divisible by 11
Important DSA concept

This problem teaches modular arithmetic and handling very large numbers using strings.

Time: O(n)
Space: O(1)
  */
