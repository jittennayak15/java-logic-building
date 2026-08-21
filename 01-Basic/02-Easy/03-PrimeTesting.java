public class CheckPrime {

    // Method to check whether n is a prime number
    public static boolean isPrime(int n) {

        // Numbers less than or equal to 1 are not prime
        if (n <= 1) {
            return false;
        }

        // Check whether n is divisible by any number from 2 to n-1
        for (int i = 2; i < n; i++) {

            // If n is divisible by i, then n is not prime
            if (n % i == 0) {
                return false;
            }
        }

        // No divisor was found, so n is prime
        return true;
    }

    public static void main(String[] args) {

        int n = 7;

        // Call the method and print the result
        System.out.println(isPrime(n));
    }
}
