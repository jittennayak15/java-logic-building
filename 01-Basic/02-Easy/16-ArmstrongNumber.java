/*
Number of digits = 3

1³ + 5³ + 3³
= 1 + 125 + 27
= 153
  */
public class ArmstrongNumber {

    // Method to check whether n is an Armstrong number
    public static boolean isArmstrong(int n) {

        // Store the original number
        int original = n;

        // Count the number of digits
        int digits = 0;
        int temp = n;

        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        // Store the sum of powered digits
        int sum = 0;

        // Extract each digit and calculate its power
        temp = n;

        while (temp > 0) {

            // Get the last digit
            int digit = temp % 10;

            // Calculate digit^digits
            sum += Math.pow(digit, digits);

            // Remove the last digit
            temp = temp / 10;
        }

        // Compare the sum with the original number
        return sum == original;
    }

    public static void main(String[] args) {

        int n = 153;

        // Call the method and print the result
        System.out.println(isArmstrong(n));
    }
}

// Concept: digit extraction + loops + Math.pow()
// Count the number of digits first
// Extract each digit using % 10
// Raise each digit to the number of digits
// Add all powered digits
// Compare the sum with the original number

/* example---
153  → true
370  → true
371  → true
407  → true
9474 → true
123  → false
  */
