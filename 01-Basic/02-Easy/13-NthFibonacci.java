//use the iterative approach first. It is simple and avoids the repeated calculations of recursion.
public class Fibonacci {

    // Method to find the nth Fibonacci number
    public static int fibonacci(int n) {

        // Base cases
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        // Store the first two Fibonacci numbers
        int first = 0;
        int second = 1;

        // Calculate Fibonacci numbers from 2 to n
        for (int i = 2; i <= n; i++) {

            // Current number is the sum of previous two numbers
            int third = first + second;

            // Move the values forward
            first = second;
            second = third;
        }

        // second contains the nth Fibonacci number
        return second;
    }

    public static void main(String[] args) {

        int n = 5;

        // Call method and print the result
        System.out.println(fibonacci(n));
    }
}
// Concept: iteration + variables
// Each Fibonacci number is the sum of the previous two numbers
// first and second are shifted forward after every iteration
/* >>>>>>>>>>>>>>>>>>>>>>>>>>examplr 
Example 1: n = 5
Index:      0  1  2  3  4  5
Fibonacci:  0  1  1  2  3  5

Therefore:

Input:  n = 5
Output: 5
🔄 Dry Run of n = 5
first = 0
second = 1


third = 0 + 1 = 1
first = 1
second = 1


third = 1 + 1 = 2
first = 1
second = 2


third = 1 + 2 = 3
first = 2
second = 3


third = 2 + 3 = 5
first = 3
second = 5

Finally:

return second
       ↓
       5

Output: 5
  */
