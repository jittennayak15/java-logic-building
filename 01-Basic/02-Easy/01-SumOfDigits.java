public class SumOfDigits {

    // Method to calculate the sum of all digits of n
    public static int sumOfDigits(int n) {

        // Variable to store the running sum
        int sum = 0;

        // Repeat until all digits are processed
        while (n > 0) {

            // Get the last digit of n
            int digit = n % 10;

            // Add the digit to the sum
            sum += digit;

            // Remove the last digit from n
            n = n / 10;
        }

        // Return the final sum
        return sum;
    }

    public static void main(String[] args) {

        int n = 687;

        // Call method and print the result
        System.out.println(sumOfDigits(n));
    }
}
