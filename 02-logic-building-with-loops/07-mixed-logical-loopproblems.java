```java
import java.util.Scanner;

public class MixedLoopProblems {

    /*
     * ============================================================
     * MIXED LOGICAL LOOP PROBLEMS
     * ============================================================
     *
     * In previous phases, we learned individual concepts:
     *
     * 1. While Loop
     * 2. Do-While Loop
     * 3. For Loop
     * 4. Nested Loops
     * 5. Break / Continue
     * 6. Mathematical Series
     *
     * Now we combine multiple concepts together.
     *
     * MIXED LOGIC means:
     *
     *     Loop + Condition + Number Logic + Pattern
     *
     * These problems are closer to the type of thinking
     * required in DSA.
     */


    // ============================================================
    // Problem 01
    // ============================================================

    /*
     * QUESTION:
     * Print all numbers from 1 to 100 whose digit sum is even.
     *
     * Example:
     *
     * 12 -> 1 + 2 = 3 -> Odd -> Don't print
     * 13 -> 1 + 3 = 4 -> Even -> Print
     *
     * CONCEPT:
     *
     * Outer loop:
     *     Generates numbers from 1 to 100.
     *
     * Digit logic:
     *     Extract every digit using % 10.
     *
     * Condition:
     *     Check whether digit sum % 2 == 0.
     */

    static void problem01() {

        for (int number = 1; number <= 100; number++) {

            int temp = number;
            int digitSum = 0;

            while (temp != 0) {

                int digit = temp % 10;

                digitSum = digitSum + digit;

                temp = temp / 10;
            }

            if (digitSum % 2 == 0) {

                System.out.print(number + " ");
            }
        }

        System.out.println();
    }


    // ============================================================
    // Problem 02
    // ============================================================

    /*
     * QUESTION:
     * Count how many numbers from 1 to 500 are divisible by 7
     * but NOT divisible by 5.
     *
     * Condition:
     *
     * number % 7 == 0
     * AND
     * number % 5 != 0
     *
     * CONCEPT:
     *
     * This combines:
     *
     * - for loop
     * - modulus %
     * - logical AND &&
     * - counting
     */

    static void problem02() {

        int count = 0;

        for (int i = 1; i <= 500; i++) {

            if (i % 7 == 0 && i % 5 != 0) {

                count++;
            }
        }

        System.out.println(
                "Count = " + count
        );
    }


    // ============================================================
    // Problem 03
    // ============================================================

    /*
     * QUESTION:
     * Print all palindrome numbers from 1 to 500.
     *
     * Examples:
     *
     * 1
     * 2
     * ...
     * 11
     * 22
     * 101
     * 111
     * 121
     * ...
     *
     * CONCEPT:
     *
     * For every number:
     *
     * 1. Store original number.
     * 2. Reverse the number.
     * 3. Compare original and reverse.
     *
     * This combines:
     *
     *     Loop + Digit Extraction + Reverse + Condition
     */

    static void problem03() {

        for (int number = 1; number <= 500; number++) {

            int original = number;
            int temp = number;
            int reverse = 0;

            while (temp != 0) {

                int digit = temp % 10;

                reverse = reverse * 10 + digit;

                temp = temp / 10;
            }

            if (original == reverse) {

                System.out.print(number + " ");
            }
        }

        System.out.println();
    }


    // ============================================================
    // Problem 04
    // ============================================================

    /*
     * QUESTION:
     * Print all numbers from 1 to 100 whose digit sum
     * is a multiple of 3.
     *
     * Example:
     *
     * 12 -> 1 + 2 = 3
     * 3 is divisible by 3.
     *
     * Therefore 12 should be printed.
     *
     * CONDITION:
     *
     * digitSum % 3 == 0
     *
     * CONCEPT:
     *
     * Number Range
     *     +
     * Digit Extraction
     *     +
     * Modulus
     */

    static void problem04() {

        for (int number = 1; number <= 100; number++) {

            int temp = number;
            int digitSum = 0;

            while (temp != 0) {

                int digit = temp % 10;

                digitSum = digitSum + digit;

                temp = temp / 10;
            }

            if (digitSum % 3 == 0) {

                System.out.print(number + " ");
            }
        }

        System.out.println();
    }


    // ============================================================
    // Problem 05
    // ============================================================

    /*
     * QUESTION:
     * Print all numbers from 1 to n whose binary representation
     * contains an EVEN number of 1s.
     *
     * Example:
     *
     * Number = 5
     *
     * Binary of 5 = 101
     *
     * Number of 1s = 2
     *
     * 2 is even.
     *
     * Therefore 5 qualifies.
     *
     * CONCEPT:
     *
     * To find binary digits:
     *
     *     n % 2
     *
     * gives the last binary digit.
     *
     * Then:
     *
     *     n = n / 2
     *
     * removes that binary digit.
     *
     * We count how many 1s appear.
     */

    static void problem05() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println(
                "Numbers with even number of 1s in binary:"
        );

        for (int number = 1; number <= n; number++) {

            int temp = number;
            int countOnes = 0;

            while (temp > 0) {

                int bit = temp % 2;

                if (bit == 1) {
                    countOnes++;
                }

                temp = temp / 2;
            }

            if (countOnes % 2 == 0) {

                System.out.print(number + " ");
            }
        }

        System.out.println();
    }


    // ============================================================
    // Problem 06
    // ============================================================

    /*
     * QUESTION:
     * Print a pattern where the ith row contains i*i.
     *
     * Example:
     *
     * Input: 5
     *
     * Output:
     *
     * 1
     * 4 4
     * 9 9 9
     * 16 16 16 16
     * 25 25 25 25 25
     *
     * CONCEPT:
     *
     * Outer loop -> controls rows.
     *
     * i * i -> calculates square of row number.
     *
     * Inner loop -> prints that square i times.
     */

    static void problem06() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int square = i * i;

            for (int j = 1; j <= i; j++) {

                System.out.print(square + " ");
            }

            System.out.println();
        }
    }


    // ============================================================
    // Problem 07
    // ============================================================

    /*
     * QUESTION:
     * Find the sum of odd digits and even digits separately
     * in a given number.
     *
     * Example:
     *
     * Input: 123456
     *
     * Odd digits:
     * 1 + 3 + 5 = 9
     *
     * Even digits:
     * 2 + 4 + 6 = 12
     *
     * CONCEPT:
     *
     * Extract every digit.
     *
     * Check:
     *
     *     digit % 2 == 0
     *
     * If true -> even digit.
     *
     * Otherwise -> odd digit.
     */

    static void problem07() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        n = Math.abs(n);

        int evenSum = 0;
        int oddSum = 0;

        while (n != 0) {

            int digit = n % 10;

            if (digit % 2 == 0) {

                evenSum = evenSum + digit;

            } else {

                oddSum = oddSum + digit;
            }

            n = n / 10;
        }

        System.out.println(
                "Sum of even digits = " + evenSum
        );

        System.out.println(
                "Sum of odd digits = " + oddSum
        );
    }


    // ============================================================
    // Problem 08
    // ============================================================

    /*
     * QUESTION:
     * Print all Armstrong numbers from 1 to 1000.
     *
     * Example:
     *
     * 153 is Armstrong because:
     *
     * 1³ + 5³ + 3³ = 153
     *
     * Other common Armstrong numbers:
     *
     * 0
     * 1
     * 153
     * 370
     * 371
     * 407
     *
     * CONCEPT:
     *
     * For every number:
     *
     * 1. Count digits.
     * 2. Extract digits.
     * 3. Raise each digit to digit count.
     * 4. Add powers.
     * 5. Compare with original number.
     */

    static void problem08() {

        for (int number = 1; number <= 1000; number++) {

            int temp = number;
            int digitCount = 0;

            // Count digits.
            while (temp != 0) {

                digitCount++;

                temp = temp / 10;
            }

            temp = number;

            int sum = 0;

            // Calculate Armstrong sum.
            while (temp != 0) {

                int digit = temp % 10;

                int power = 1;

                for (int i = 1; i <= digitCount; i++) {

                    power = power * digit;
                }

                sum = sum + power;

                temp = temp / 10;
            }

            if (sum == number) {

                System.out.print(number + " ");
            }
        }

        System.out.println();
    }


    // ============================================================
    // Problem 09
    // ============================================================

    /*
     * QUESTION:
     * Print all Perfect Numbers from 1 to 1000.
     *
     * A Perfect Number is a number whose proper divisors
     * add up to the number itself.
     *
     * Example:
     *
     * 6
     *
     * Proper divisors:
     * 1, 2, 3
     *
     * 1 + 2 + 3 = 6
     *
     * Therefore 6 is a Perfect Number.
     *
     * CONCEPT:
     *
     * Outer loop:
     *     Selects each number.
     *
     * Inner loop:
     *     Finds its proper divisors.
     *
     * Then compare:
     *
     *     divisorSum == number
     */

    static void problem09() {

        for (int number = 1; number <= 1000; number++) {

            int divisorSum = 0;

            for (int divisor = 1; divisor <= number / 2; divisor++) {

                if (number % divisor == 0) {

                    divisorSum = divisorSum + divisor;
                }
            }

            if (divisorSum == number) {

                System.out.print(number + " ");
            }
        }

        System.out.println();
    }


    // ============================================================
    // Problem 10
    // ============================================================

    /*
     * QUESTION:
     * Find the number from 1 to n having the maximum digit sum.
     *
     * Print:
     *
     * 1. The number
     * 2. Its digit sum
     *
     * Example:
     *
     * Input: 100
     *
     * The program checks:
     *
     * 1 -> digit sum = 1
     * 2 -> digit sum = 2
     * ...
     * 99 -> digit sum = 18
     * 100 -> digit sum = 1
     *
     * Therefore:
     *
     * Maximum digit sum = 18
     * Number = 99
     *
     * CONCEPT:
     *
     * This is an important MAXIMUM pattern.
     *
     * Maintain:
     *
     *     maxSum
     *     maxNumber
     *
     * Whenever a larger sum is found,
     * update both variables.
     */

    static void problem10() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int maxSum = -1;
        int maxNumber = 0;

        for (int number = 1; number <= n; number++) {

            int temp = number;
            int digitSum = 0;

            while (temp != 0) {

                int digit = temp % 10;

                digitSum = digitSum + digit;

                temp = temp / 10;
            }

            if (digitSum > maxSum) {

                maxSum = digitSum;
                maxNumber = number;
            }
        }

        System.out.println(
                "Number = " + maxNumber
        );

        System.out.println(
                "Maximum digit sum = " + maxSum
        );
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
     * Understand the logic and output.
     *
     * Then move to:
     *
     * problem02();
     *
     * Continue until problem10().
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
    }
}
```
