```java
import java.util.Scanner;

public class MathematicalSeries {

    /*
     * ============================================================
     * MATHEMATICAL SERIES - BASIC CONCEPT
     * ============================================================
     *
     * A mathematical series is a sequence of numbers or
     * mathematical expressions that follow a specific pattern.
     *
     * Examples:
     *
     * 1 + 2 + 3 + 4 + 5
     *
     * 2 + 4 + 6 + 8 + 10
     *
     * 1 + 1/2 + 1/3 + 1/4
     *
     * 1 + 1/2! + 1/3! + ...
     *
     *
     * GENERAL APPROACH:
     *
     * 1. Identify the pattern.
     * 2. Identify the first term.
     * 3. Identify how the next term is generated.
     * 4. Use a loop to generate terms.
     * 5. Add or print the terms as required.
     */


    // ============================================================
    // Problem 01
    // ============================================================

    /*
     * QUESTION:
     * Find the sum of the first n natural numbers.
     *
     * Example:
     * Input: 5
     *
     * 1 + 2 + 3 + 4 + 5 = 15
     *
     * Output:
     * Sum = 15
     *
     * CONCEPT:
     *
     * Natural numbers start from 1.
     *
     * We use a loop to add every number from 1 to n.
     */

    static void problem01() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            sum = sum + i;
        }

        System.out.println("Sum = " + sum);
    }


    // ============================================================
    // Problem 02
    // ============================================================

    /*
     * QUESTION:
     * Find the sum of the first n even numbers.
     *
     * Example:
     * Input: 5
     *
     * 2 + 4 + 6 + 8 + 10 = 30
     *
     * CONCEPT:
     *
     * The nth even number is:
     *
     *     2 * i
     *
     * So:
     *
     * i = 1 -> 2
     * i = 2 -> 4
     * i = 3 -> 6
     * ...
     */

    static void problem02() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            int term = 2 * i;

            sum = sum + term;
        }

        System.out.println("Sum of first " + n
                + " even numbers = " + sum);
    }


    // ============================================================
    // Problem 03
    // ============================================================

    /*
     * QUESTION:
     * Find the sum of the first n odd numbers.
     *
     * Example:
     * Input: 5
     *
     * 1 + 3 + 5 + 7 + 9 = 25
     *
     * CONCEPT:
     *
     * The nth odd number is:
     *
     *     2 * i - 1
     *
     * Therefore:
     *
     * i = 1 -> 1
     * i = 2 -> 3
     * i = 3 -> 5
     */

    static void problem03() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            int term = 2 * i - 1;

            sum = sum + term;
        }

        System.out.println("Sum of first " + n
                + " odd numbers = " + sum);
    }


    // ============================================================
    // Problem 04
    // ============================================================

    /*
     * QUESTION:
     * Print and find the sum of the first n terms of an
     * Arithmetic Progression (AP).
     *
     * Given:
     * First term = a
     * Common difference = d
     * Number of terms = n
     *
     * Example:
     *
     * a = 2
     * d = 3
     * n = 5
     *
     * Series:
     *
     * 2 5 8 11 14
     *
     * Sum = 40
     *
     * Formula for nth term:
     *
     *     term = a + (i - 1) * d
     */

    static void problem04() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common difference (d): ");
        int d = sc.nextInt();

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        int sum = 0;

        System.out.print("AP Series: ");

        for (int i = 1; i <= n; i++) {

            int term = a + (i - 1) * d;

            System.out.print(term + " ");

            sum = sum + term;
        }

        System.out.println();
        System.out.println("Sum = " + sum);
    }


    // ============================================================
    // Problem 05
    // ============================================================

    /*
     * QUESTION:
     * Print and find the sum of the first n terms of a
     * Geometric Progression (GP).
     *
     * Given:
     * First term = a
     * Common ratio = r
     * Number of terms = n
     *
     * Example:
     *
     * a = 2
     * r = 3
     * n = 5
     *
     * Series:
     *
     * 2 6 18 54 162
     *
     * CONCEPT:
     *
     * Every term is obtained by multiplying the
     * previous term by the common ratio.
     */

    static void problem05() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        long a = sc.nextLong();

        System.out.print("Enter common ratio (r): ");
        long r = sc.nextLong();

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        long term = a;
        long sum = 0;

        System.out.print("GP Series: ");

        for (int i = 1; i <= n; i++) {

            System.out.print(term + " ");

            sum = sum + term;

            term = term * r;
        }

        System.out.println();
        System.out.println("Sum = " + sum);
    }


    // ============================================================
    // Problem 06
    // ============================================================

    /*
     * QUESTION:
     * Print the first n terms of the Fibonacci series.
     *
     * Example:
     *
     * Input: 7
     *
     * 0 1 1 2 3 5 8
     *
     * CONCEPT:
     *
     * First two values:
     *
     * first = 0
     * second = 1
     *
     * Next:
     *
     * next = first + second
     *
     * Then move forward:
     *
     * first = second
     * second = next
     */

    static void problem06() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter a positive number.");
            return;
        }

        long first = 0;
        long second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {

            System.out.print(first + " ");

            long next = first + second;

            first = second;
            second = next;
        }

        System.out.println();
    }


    // ============================================================
    // Problem 07
    // ============================================================

    /*
     * QUESTION:
     * Find the sum of the first n Fibonacci numbers.
     *
     * Example:
     *
     * Input: 7
     *
     * Series:
     * 0 1 1 2 3 5 8
     *
     * Sum:
     * 20
     */

    static void problem07() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter a positive number.");
            return;
        }

        long first = 0;
        long second = 1;
        long sum = 0;

        for (int i = 1; i <= n; i++) {

            sum = sum + first;

            long next = first + second;

            first = second;
            second = next;
        }

        System.out.println("Fibonacci sum = " + sum);
    }


    // ============================================================
    // Problem 08
    // ============================================================

    /*
     * QUESTION:
     * Find the sum:
     *
     * 1² + 2² + 3² + ... + n²
     *
     * Example:
     *
     * Input: 5
     *
     * 1² + 2² + 3² + 4² + 5²
     *
     * = 1 + 4 + 9 + 16 + 25
     * = 55
     *
     * CONCEPT:
     *
     * Square of a number:
     *
     *     i * i
     */

    static void problem08() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        long sum = 0;

        for (int i = 1; i <= n; i++) {

            long square = (long) i * i;

            sum = sum + square;
        }

        System.out.println("Sum of squares = " + sum);
    }


    // ============================================================
    // Problem 09
    // ============================================================

    /*
     * QUESTION:
     * Find the sum:
     *
     * 1³ + 2³ + 3³ + ... + n³
     *
     * Example:
     *
     * Input: 3
     *
     * 1³ + 2³ + 3³
     *
     * = 1 + 8 + 27
     * = 36
     */

    static void problem09() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        long sum = 0;

        for (int i = 1; i <= n; i++) {

            long cube = (long) i * i * i;

            sum = sum + cube;
        }

        System.out.println("Sum of cubes = " + sum);
    }


    // ============================================================
    // Problem 10
    // ============================================================

    /*
     * QUESTION:
     * Find the sum:
     *
     * 1 + 1/2 + 1/3 + ... + 1/n
     *
     * Example:
     *
     * n = 4
     *
     * 1 + 1/2 + 1/3 + 1/4
     *
     * CONCEPT:
     *
     * We must use double because the answer can contain
     * decimal values.
     *
     * IMPORTANT:
     *
     * 1 / i using integers gives integer division.
     *
     * Example:
     * 1 / 2 = 0
     *
     * Therefore we use:
     *
     * 1.0 / i
     */

    static void problem10() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++) {

            sum = sum + (1.0 / i);
        }

        System.out.println("Series sum = " + sum);
    }


    // ============================================================
    // Problem 11
    // ============================================================

    /*
     * QUESTION:
     * Find the sum:
     *
     * 1 + 2 + 4 + 8 + ... + 2^n
     *
     * Example:
     *
     * Input: 4
     *
     * 1 + 2 + 4 + 8 + 16
     *
     * = 31
     *
     * CONCEPT:
     *
     * Each term is a power of 2.
     *
     * We can calculate:
     *
     * term = 2^i
     *
     * using a loop instead of Math.pow().
     */

    static void problem11() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        long sum = 0;
        long term = 1;

        for (int i = 0; i <= n; i++) {

            sum = sum + term;

            term = term * 2;
        }

        System.out.println("Series sum = " + sum);
    }


    // ============================================================
    // Problem 12
    // ============================================================

    /*
     * QUESTION:
     * Find the sum:
     *
     * 1! + 2! + 3! + ... + n!
     *
     * Example:
     *
     * Input: 4
     *
     * 1! + 2! + 3! + 4!
     *
     * = 1 + 2 + 6 + 24
     * = 33
     *
     * CONCEPT:
     *
     * Instead of calculating factorial from the beginning
     * every time, we can maintain a running factorial.
     *
     * factorial = factorial * i
     *
     * This is more efficient.
     */

    static void problem12() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        long factorial = 1;
        long sum = 0;

        for (int i = 1; i <= n; i++) {

            factorial = factorial * i;

            sum = sum + factorial;
        }

        System.out.println("Sum of factorials = " + sum);
    }


    // ============================================================
    // Problem 13
    // ============================================================

    /*
     * QUESTION:
     * Find the sum:
     *
     * 1 + x + x² + x³ + ... + x^n
     *
     * Example:
     *
     * x = 2
     * n = 4
     *
     * 1 + 2 + 4 + 8 + 16
     *
     * = 31
     *
     * CONCEPT:
     *
     * We maintain the current power.
     *
     * Start:
     * power = 1
     *
     * After each term:
     * power = power * x
     */

    static void problem13() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        long x = sc.nextLong();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        long power = 1;
        long sum = 0;

        for (int i = 0; i <= n; i++) {

            sum = sum + power;

            power = power * x;
        }

        System.out.println("Series sum = " + sum);
    }


    // ============================================================
    // Problem 14
    // ============================================================

    /*
     * QUESTION:
     * Find the sum of the series:
     *
     * x - x²/2! + x³/3! - x⁴/4! + ...
     *
     * up to n terms.
     *
     * Example:
     *
     * x = 2
     * n = 4
     *
     * 2 - 4/2! + 8/3! - 16/4!
     *
     * CONCEPT:
     *
     * There are three changing parts:
     *
     * 1. Power of x
     * 2. Factorial
     * 3. Sign (+ or -)
     *
     * Term:
     *
     * x^i / i!
     *
     *
     * For odd i:
     *     add the term
     *
     * For even i:
     *     subtract the term
     */

    static void problem14() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = sc.nextDouble();

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        double sum = 0;

        double power = 1;
        long factorial = 1;

        for (int i = 1; i <= n; i++) {

            // Calculate x^i
            power = power * x;

            // Calculate i!
            factorial = factorial * i;

            double term = power / factorial;

            if (i % 2 == 1) {

                // Odd position -> positive term
                sum = sum + term;

            } else {

                // Even position -> negative term
                sum = sum - term;
            }
        }

        System.out.println("Series sum = " + sum);
    }


    // ============================================================
    // Problem 15
    // ============================================================

    /*
     * QUESTION:
     * Check whether a number is a Strong Number.
     *
     * A Strong Number is a number whose sum of the factorials
     * of its digits is equal to the original number.
     *
     * Example:
     *
     * 145
     *
     * Digits:
     * 1, 4, 5
     *
     * 1! + 4! + 5!
     *
     * = 1 + 24 + 120
     * = 145
     *
     * Therefore:
     *
     * 145 is a Strong Number.
     *
     *
     * CONCEPT:
     *
     * We need to:
     *
     * 1. Extract each digit.
     * 2. Find factorial of that digit.
     * 3. Add factorial to sum.
     * 4. Compare sum with original number.
     *
     * This problem combines:
     *
     * - Loop
     * - Digit extraction
     * - Factorial
     * - Modulus %
     * - Integer division /
     */

    static void problem15() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Negative numbers are not Strong Numbers.");
            return;
        }

        int original = n;
        int temp = n;

        long sum = 0;

        do {

            // Extract last digit.
            int digit = temp % 10;

            // Find factorial of the digit.
            long factorial = 1;

            for (int i = 1; i <= digit; i++) {

                factorial = factorial * i;
            }

            // Add factorial to total sum.
            sum = sum + factorial;

            // Remove last digit.
            temp = temp / 10;

        } while (temp != 0);

        // Compare factorial sum with original number.
        if (sum == original) {

            System.out.println("Strong Number");

        } else {

            System.out.println("Not a Strong Number");
        }
    }


    // ============================================================
    // MAIN METHOD
    // ============================================================

    /*
     * HOW TO PRACTICE:
     *
     * Uncomment ONE problem at a time.
     *
     * Example:
     *
     * problem01();
     *
     * After understanding it, comment it and try:
     *
     * problem02();
     *
     * Continue until problem15().
     *
     * This keeps all Mathematical Series problems
     * inside ONE organized Java file.
     */

    public static void main(String[] args) {

        // Uncomment ONE problem at a time.

        problem01();

        // problem02();
        // problem03();
        // problem04();
        // problem05();
        // problem06();
        // problem07();
        // problem08();
        // problem09();
        // problem10();
        // problem11();
        // problem12();
        // problem13();
        // problem14();
        // problem15();
    }
}
```
