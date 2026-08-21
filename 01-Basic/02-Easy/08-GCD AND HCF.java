//GCD (Greatest Common Divisor) is the largest number that divides both numbers without leaving a remainder.
/*Example:
a = 12
b = 18

Common divisors:
1, 2, 3, 6

GCD = 6*/
public class GCD {

    // Method to find GCD (HCF) of two numbers
    public static int findGCD(int a, int b) {

        // Check every number from 1 to the smaller number
        for (int i = Math.min(a, b); i >= 1; i--) {

            // If i divides both a and b, it is the GCD
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }

        // This line is never reached for positive numbers
        return 1;
    }

    public static void main(String[] args) {

        int a = 12;
        int b = 18;

        // Call the method and print the GCD
        System.out.println(findGCD(a, b));
    }
}
// Concept: for loop + modulo operator
// A GCD is the largest number that divides both numbers
// Start from the smaller number and move downward
// The first common divisor found is the GCD
