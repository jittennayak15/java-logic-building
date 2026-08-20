public class SumOfSquares {

    // Method to calculate sum of squares from 1 to n
    public static int sumOfSquares(int n) {

        // Accumulator variable to store the total sum
        int sum = 0;

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {

            // Add the square of current number to sum
            sum += i * i;
        }

        // Return the final sum
        return sum;
    }

    public static void main(String[] args) {

        int n = 8;

        // Call method and print the result
        System.out.println(sumOfSquares(n));
    }
}
