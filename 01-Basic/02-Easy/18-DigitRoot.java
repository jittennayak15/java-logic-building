/*
A digital root means repeatedly adding the digits until only one digit remains.

Example:

99999
 ↓
9 + 9 + 9 + 9 + 9 = 45
 ↓
4 + 5 = 9

Answer = 9
  */
public class DigitalRoot {

    // Method to find the digital root of n
    public static int digitalRoot(int n) {

        // Continue until n becomes a single digit
        while (n >= 10) {

            // Store the sum of digits
            int sum = 0;

            // Add all digits of n
            while (n > 0) {

                // Get the last digit
                int digit = n % 10;

                // Add the digit to sum
                sum += digit;

                // Remove the last digit
                n = n / 10;
            }

            // Replace n with the sum of its digits
            n = sum;
        }

        // Return the single digit
        return n;
    }

    public static void main(String[] args) {

        int n = 99999;

        // Call the method and print the result
        System.out.println(digitalRoot(n));
    }
}

// Concept: nested while loop + digit extraction
// Keep finding the sum of digits until only one digit remains
// % 10 extracts the last digit
// / 10 removes the last digit
