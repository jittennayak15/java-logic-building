public class Factorial {

    // Method to calculate factorial of n
    public static int factorial(int n) {

        // Factorial starts with 1 because multiplying by 1
        // does not change the result, and 0! is also 1
        int fact = 1;

        // Multiply fact by every number from 1 to n
        for (int i = 1; i <= n; i++) {

            // Add the current number to the factorial product
            fact *= i;
        }

        // Return the final factorial
        return fact;
    }

    public static void main(String[] args) {

        int n = 5;

        // Call the method and print the result
        System.out.println(factorial(n));
    }
}
