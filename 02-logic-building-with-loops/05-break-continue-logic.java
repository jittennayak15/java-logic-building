```java
import java.util.Scanner;

public class BreakContinueProblems {

    /*
     * ============================================================
     * BREAK AND CONTINUE - BASIC CONCEPT
     * ============================================================
     *
     * BREAK:
     * ------------------------------------------------------------
     * The break statement immediately terminates the loop.
     *
     * Example:
     *
     * for (int i = 1; i <= 10; i++) {
     *
     *     if (i == 5) {
     *         break;
     *     }
     *
     *     System.out.println(i);
     * }
     *
     * Output:
     * 1
     * 2
     * 3
     * 4
     *
     * When i becomes 5, break stops the loop completely.
     *
     *
     * CONTINUE:
     * ------------------------------------------------------------
     * The continue statement skips the current iteration
     * and moves to the next iteration of the loop.
     *
     * Example:
     *
     * for (int i = 1; i <= 5; i++) {
     *
     *     if (i == 3) {
     *         continue;
     *     }
     *
     *     System.out.println(i);
     * }
     *
     * Output:
     * 1
     * 2
     * 4
     * 5
     *
     * 3 is skipped, but the loop continues.
     *
     *
     * EASY WAY TO REMEMBER:
     *
     * break    -> STOP the loop
     * continue -> SKIP this iteration
     */


    // ============================================================
    // Problem 01
    // ============================================================

    /*
     * QUESTION:
     * Print numbers from 1 to 100.
     * Stop the loop when you find the first number divisible by 17.
     *
     * Expected output:
     *
     * 1
     * 2
     * 3
     * ...
     * 16
     *
     * Then the loop stops because:
     *
     * 17 % 17 == 0
     *
     * CONCEPT:
     *
     * break is used when we want to stop searching
     * as soon as the required condition is found.
     */

    static void problem01() {

        for (int i = 1; i <= 100; i++) {

            if (i % 17 == 0) {
                break;
            }

            System.out.println(i);
        }
    }


    // ============================================================
    // Problem 02
    // ============================================================

    /*
     * QUESTION:
     * Print numbers from 1 to 100,
     * but skip all numbers divisible by 5.
     *
     * Expected:
     *
     * 1 2 3 4 6 7 8 9 11 ...
     *
     * CONCEPT:
     *
     * We don't want to stop the loop.
     * We only want to skip numbers divisible by 5.
     *
     * Therefore, we use continue.
     *
     * Example:
     *
     * i = 5
     * 5 % 5 == 0
     * continue
     *
     * The current iteration is skipped.
     */

    static void problem02() {

        for (int i = 1; i <= 100; i++) {

            if (i % 5 == 0) {
                continue;
            }

            System.out.print(i + " ");
        }

        System.out.println();
    }


    // ============================================================
    // Problem 03
    // ============================================================

    /*
     * QUESTION:
     * Take 5 numbers as input.
     * Skip 0 values and calculate the sum of the remaining numbers.
     *
     * Example:
     *
     * Input:
     * 10
     * 0
     * 20
     * 0
     * 30
     *
     * Output:
     * Sum = 60
     *
     * CONCEPT:
     *
     * If the user enters 0,
     * we don't want to add it.
     *
     * continue skips that iteration
     * and moves to the next input.
     */

    static void problem03() {

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter number " + i + ": ");
            int number = sc.nextInt();

            if (number == 0) {
                continue;
            }

            sum = sum + number;
        }

        System.out.println("Sum = " + sum);
    }


    // ============================================================
    // Problem 04
    // ============================================================

    /*
     * QUESTION:
     * Search for a number in a list of numbers.
     * Stop searching as soon as the number is found.
     *
     * Example:
     *
     * Input:
     * Array = {10, 25, 30, 45, 50}
     * Search = 30
     *
     * Output:
     * Number found.
     *
     * CONCEPT:
     *
     * Once we find the required number,
     * there is no reason to continue searching.
     *
     * Therefore, we use break.
     *
     * This is a very common use of break in programming:
     *
     * SEARCH -> FIND -> BREAK
     */

    static void problem04() {

        Scanner sc = new Scanner(System.in);

        int[] numbers = {10, 25, 30, 45, 50};

        System.out.print("Enter number to search: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == target) {

                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Number found.");
        } else {
            System.out.println("Number not found.");
        }
    }


    // ============================================================
    // Problem 05
    // ============================================================

    /*
     * QUESTION:
     * Read numbers from the user and print them.
     * Stop reading when the user enters a negative number.
     *
     * Example:
     *
     * Input:
     * 10
     * 20
     * 30
     * 40
     * -5
     *
     * Output:
     * 10
     * 20
     * 30
     * 40
     *
     * CONCEPT:
     *
     * A negative number is our STOP signal.
     *
     * When negative number appears:
     *
     *     break;
     *
     * stops the loop immediately.
     */

    static void problem05() {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            if (number < 0) {
                break;
            }

            System.out.println("You entered: " + number);
        }

        System.out.println("Input stopped.");
    }


    // ============================================================
    // Problem 06
    // ============================================================

    /*
     * QUESTION:
     * Print only even numbers from 1 to 100.
     * Skip all odd numbers using continue.
     *
     * Expected output:
     *
     * 2 4 6 8 10 ... 100
     *
     * CONCEPT:
     *
     * If number is odd:
     *
     *     number % 2 != 0
     *
     * We don't want to print it.
     *
     * So we use continue.
     *
     * continue -> skip odd number
     * next iteration -> check next number
     */

    static void problem06() {

        for (int i = 1; i <= 100; i++) {

            // If i is odd, skip this iteration.
            if (i % 2 != 0) {
                continue;
            }

            System.out.print(i + " ");
        }

        System.out.println();
    }


    // ============================================================
    // Problem 07
    // ============================================================

    /*
     * QUESTION:
     * Keep taking numbers from the user and add them.
     * Stop when the total sum becomes greater than 100.
     *
     * Example:
     *
     * Input:
     * 20
     * 30
     * 40
     * 15
     *
     * Sum:
     * 20
     * 50
     * 90
     * 105
     *
     * Since 105 > 100, stop the loop.
     *
     * CONCEPT:
     *
     * We don't know beforehand how many numbers
     * the user will enter.
     *
     * Therefore, we can use:
     *
     *     while (true)
     *
     * and use break when the required condition is reached.
     *
     * This is called a sentinel/condition-controlled loop.
     */

    static void problem07() {

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (true) {

            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            sum = sum + number;

            System.out.println("Current sum = " + sum);

            if (sum > 100) {
                break;
            }
        }

        System.out.println("Final sum = " + sum);
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
     * Run the program and understand the output.
     *
     * Then comment problem01()
     * and uncomment problem02().
     *
     * This allows all 7 problems to remain
     * organized inside ONE Java file.
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
    }
}
```
