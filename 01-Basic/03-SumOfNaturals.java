public class SumOfNaturalNumbers {

    // Method to calculate the sum of first n natural numbers
    public static int sumNaturalNumbers(int n) {

        // Initialize accumulator variable to store the running sum
        int sum = 0;

        // Loop from 1 to n and add each number to sum
        for (int i = 1; i <= n; i++) {
            sum += i; // Same as: sum = sum + i
        }

        // Return the final sum
        return sum;
    }

    public static void main(String[] args) {

        int n = 5;

        // Call the method and print the result
        System.out.println(sumNaturalNumbers(n));
    }
}
