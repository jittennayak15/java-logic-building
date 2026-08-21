/*
A number is a palindrome if it remains the same when its digits are reversed.

Examples:

12321 → 12321 → true
1234  → 4321  → false
-121  → 121   → true   (ignore the sign)
  */
public class PalindromeNumber {

    // Method to check whether n is a palindrome
    public static boolean isPalindrome(int n) {

        // Ignore the negative sign
        n = Math.abs(n);

        // Store the original number
        int original = n;

        // Store the reversed number
        int reverse = 0;

        // Reverse the digits of n
        while (n > 0) {

            // Get the last digit
            int digit = n % 10;

            // Add the digit to the reversed number
            reverse = reverse * 10 + digit;

            // Remove the last digit
            n = n / 10;
        }

        // If original and reverse are same, it is a palindrome
        return original == reverse;
    }

    public static void main(String[] args) {

        int n = 12321;

        // Call the method and print the result
        System.out.println(isPalindrome(n));
    }
}

// Concept: reverse digits + comparison
// Ignore the negative sign using Math.abs()
// Reverse the number using % 10 and / 10
// Compare the original number with the reversed number
