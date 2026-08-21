public class PairCubeCount {

    // Method to count pairs (a, b) such that a³ + b³ = n
    public static int countPairs(int n) {

        // Variable to store the number of valid pairs
        int count = 0;

        // Try every possible value of a
        for (int a = 1; a * a * a <= n; a++) {

            // Try every possible value of b
            for (int b = 1; b * b * b <= n; b++) {

                // Check whether a³ + b³ equals n
                if (a * a * a + b * b * b == n) {

                    // Count the pair
                    count++;
                }
            }
        }

        // Return the total number of pairs
        return count;
    }

    public static void main(String[] args) {

        int n = 9;

        // Call the method and print the result
        System.out.println(countPairs(n));
    }
}
