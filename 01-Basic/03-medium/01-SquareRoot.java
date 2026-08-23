public class SquareRoot {

    // Method to find floor square root of n
    public static int squareRoot(int n) {

        // Store the answer
        int answer = 0;

        // Check every number from 1 onwards
        for (int i = 1; i <= n; i++) {

            // If i * i is equal to n
            if (i * i == n) {
                return i;
            }

            // If i * i becomes greater than n,
            // then i - 1 is the floor square root
            if (i * i > n) {
                break;
            }

            // Store the current valid value
            answer = i;
        }

        // Return the floor square root
        return answer;
    }

    public static void main(String[] args) {

        int n = 11;

        // Call the method and print the result
        System.out.println(squareRoot(n));
    }
}

/*
Dry Run: n = 11
i = 1 → 1 × 1 = 1  → answer = 1
i = 2 → 2 × 2 = 4  → answer = 2
i = 3 → 3 × 3 = 9  → answer = 3
i = 4 → 4 × 4 = 16 → greater than 11 → stop

Therefore:

floor(√11) = 3

Output:3

Example: n = 4
i = 1 → 1 × 1 = 1
i = 2 → 2 × 2 = 4

We found an exact square:

if (i * i == n) {
    return i;
}

So:
Output: 2

  */
// Concept: loop + multiplication + comparison
// Check numbers until their square becomes greater than n
// The largest i where i * i <= n is floor(√n)
