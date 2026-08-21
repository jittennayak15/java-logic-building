public class ReverseDigits {

    // Method to reverse the digits of a number
    public static int reverseNumber(int n) {

        // Store the reversed number
        int reverse = 0;

        // Repeat until all digits are processed
        while (n > 0) {

            // Get the last digit
            int digit = n % 10;

            // Add the digit to the reversed number
            reverse = reverse * 10 + digit;

            // Remove the last digit from n
            n = n / 10;
        }

        // Return the reversed number
        return reverse;
    }

    public static void main(String[] args) {

        int n = 12345;

        // Call the method and print the result
        System.out.println(reverseNumber(n));
    }
}
