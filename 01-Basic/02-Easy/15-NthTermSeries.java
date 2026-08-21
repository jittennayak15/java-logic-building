public class TriangularNumber {

    // Method to find the n-th term of the series
    public static int findTerm(int n) {

        // Formula for the n-th triangular number
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        int n = 4;

        // Call the method and print the result
        System.out.println(findTerm(n));
    }
}
/*
Example: n = 4

Using the formula:

T(n) = n × (n + 1) / 2


T(4) = 4 × 5 / 2
     = 20 / 2
     = 10

Output:

10
  */
// Concept: Mathematical formula
// Triangular number = n * (n + 1) / 2
// It represents the sum of the first n natural numbers.
