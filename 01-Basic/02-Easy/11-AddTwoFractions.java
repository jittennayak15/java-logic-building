/* We need to:

Add the fractions.
Find the GCD of numerator and denominator.
Reduce the answer to its simplest form.
  */
public class AddFractions {

    // Method to find GCD of two numbers
    public static int findGCD(int a, int b) {

        // Check all numbers from the smaller value down to 1
        for (int i = Math.min(a, b); i >= 1; i--) {

            // Return the first common divisor
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }

        return 1;
    }

    // Method to add two fractions
    public static int[] addFractions(int[] a, int[] b) {

        // Extract numerator and denominator
        int numerator1 = a[0];
        int denominator1 = a[1];

        int numerator2 = b[0];
        int denominator2 = b[1];

        // Find the common denominator
        int numerator = numerator1 * denominator2
                      + numerator2 * denominator1;

        int denominator = denominator1 * denominator2;

        // Find GCD to simplify the fraction
        int gcd = findGCD(numerator, denominator);

        // Divide numerator and denominator by GCD
        numerator = numerator / gcd;
        denominator = denominator / gcd;

        // Return simplified numerator and denominator
        return new int[]{numerator, denominator};
    }

    public static void main(String[] args) {

        int[] a = {1, 3};
        int[] b = {3, 9};

        // Add the two fractions
        int[] result = addFractions(a, b);

        // Print the result
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
// Concept: arrays + fractions + GCD
// Add fractions using cross multiplication
// Find GCD and divide numerator and denominator
// to reduce the fraction to its simplest form
