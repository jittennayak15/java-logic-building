```java
import java.util.Scanner;

public class NestedLoopProblems {

    /*
     * ============================================================
     * NESTED LOOP - BASIC CONCEPT
     * ============================================================
     *
     * A nested loop means:
     *
     *     One loop is written inside another loop.
     *
     * Example:
     *
     *     for (int i = 1; i <= 3; i++) {
     *
     *         for (int j = 1; j <= 4; j++) {
     *             System.out.print("* ");
     *         }
     *
     *         System.out.println();
     *     }
     *
     * OUTPUT:
     *
     *     * * * *
     *     * * * *
     *     * * * *
     *
     *
     * IMPORTANT:
     *
     * Outer loop -> controls rows / major repetitions.
     * Inner loop -> controls columns / work inside each row.
     *
     *
     * FLOW:
     *
     * Outer loop starts
     *       ↓
     * Inner loop runs completely
     *       ↓
     * Outer loop updates
     *       ↓
     * Inner loop runs completely again
     *       ↓
     * Continue...
     *
     * Nested loops are commonly used for:
     *
     * - Patterns
     * - Tables
     * - Matrix problems
     * - Pair generation
     * - Comparing elements
     * - Prime number checking
     * - Mathematical problems
     */


    // ============================================================
    // Problem 01
    // ============================================================

    /*
     * QUESTION:
     * Print multiplication tables from 1 to 10.
     *
     * Expected output:
     *
     * Table of 1
     * 1 x 1 = 1
     * 1 x 2 = 2
     * ...
     *
     * Table of 2
     * 2 x 1 = 2
     * ...
     *
     * Continue until table 10.
     *
     * CONCEPT:
     *
     * Outer loop -> selects the table number.
     * Inner loop -> multiplies that number from 1 to 10.
     *
     * Example:
     *
     * i = 2
     * inner loop:
     * 2 x 1
     * 2 x 2
     * ...
     * 2 x 10
     */

    static void problem01() {

        for (int i = 1; i <= 10; i++) {

            System.out.println("Table of " + i);

            for (int j = 1; j <= 10; j++) {

                System.out.println(
                        i + " x " + j + " = " + (i * j)
                );
            }

            System.out.println();
        }
    }


    // ============================================================
    // Problem 02
    // ============================================================

    /*
     * QUESTION:
     * Print all possible pairs (i, j) where:
     *
     * 1 <= i <= n
     * 1 <= j <= n
     *
     * Example:
     * Input: 3
     *
     * Output:
     *
     * (1,1)
     * (1,2)
     * (1,3)
     * (2,1)
     * (2,2)
     * (2,3)
     * (3,1)
     * (3,2)
     * (3,3)
     *
     * CONCEPT:
     *
     * For every value of i,
     * j goes from 1 to n.
     *
     * This generates every possible combination of i and j.
     */

    static void problem02() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                System.out.println("(" + i + ", " + j + ")");
            }
        }
    }


    // ============================================================
    // Problem 03
    // ============================================================

    /*
     * QUESTION:
     * Count the number of factors for every number from 1 to n.
     *
     * Example:
     *
     * Input: 5
     *
     * 1 -> 1 factor
     * 2 -> 2 factors
     * 3 -> 2 factors
     * 4 -> 3 factors
     * 5 -> 2 factors
     *
     * CONCEPT:
     *
     * Outer loop:
     *     Selects the number whose factors we want to check.
     *
     * Inner loop:
     *     Checks every number from 1 to that number.
     *
     * A number j is a factor of i if:
     *
     *     i % j == 0
     *
     * Example:
     *
     * i = 6
     *
     * j = 1 -> 6 % 1 == 0
     * j = 2 -> 6 % 2 == 0
     * j = 3 -> 6 % 3 == 0
     * j = 4 -> 6 % 4 != 0
     * j = 5 -> 6 % 5 != 0
     * j = 6 -> 6 % 6 == 0
     *
     * Therefore, 6 has 4 factors.
     */

    static void problem03() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int count = 0;

            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    count++;
                }
            }

            System.out.println(
                    i + " -> " + count + " factors"
            );
        }
    }


    // ============================================================
    // Problem 04
    // ============================================================

    /*
     * QUESTION:
     * Print all prime numbers from 1 to n using nested loops.
     *
     * Example:
     *
     * Input: 20
     *
     * Output:
     * 2 3 5 7 11 13 17 19
     *
     * CONCEPT:
     *
     * A prime number has exactly two factors:
     *
     *     1 and itself.
     *
     * Outer loop:
     *     Selects each number.
     *
     * Inner loop:
     *     Checks whether the selected number has
     *     any divisor other than 1 and itself.
     *
     * If count == 2 -> prime.
     */

    static void problem04() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {

            int count = 0;

            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }


    // ============================================================
    // Problem 05
    // ============================================================

    /*
     * QUESTION:
     * Print Fibonacci numbers row by row using nested loops.
     *
     * Example:
     *
     * Input: 5
     *
     * Output:
     *
     * 0
     * 1 1
     * 2 3 5
     * 8 13 21 34
     * 55 89 144 233 377
     *
     * CONCEPT:
     *
     * Outer loop -> controls the number of rows.
     *
     * Inner loop -> controls how many Fibonacci numbers
     *               are printed in that row.
     *
     * Row 1 -> 1 number
     * Row 2 -> 2 numbers
     * Row 3 -> 3 numbers
     * ...
     */

    static void problem05() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(first + " ");

                int next = first + second;

                first = second;
                second = next;
            }

            System.out.println();
        }
    }


    // ============================================================
    // Problem 06
    // ============================================================

    /*
     * QUESTION:
     * Print the following number triangle:
     *
     * Example:
     *
     * Input: 5
     *
     * Output:
     *
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     * 1 2 3 4 5
     *
     * CONCEPT:
     *
     * Outer loop -> controls rows.
     *
     * Inner loop -> prints numbers from 1 to row number.
     *
     * Row 1 -> print 1
     * Row 2 -> print 1 2
     * Row 3 -> print 1 2 3
     *
     * The condition:
     *
     *     j <= i
     *
     * connects the inner loop with the current row.
     */

    static void problem06() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j + " ");
            }

            System.out.println();
        }
    }


    // ============================================================
    // Problem 07
    // ============================================================

    /*
     * QUESTION:
     * Read a matrix and calculate:
     *
     * 1. Sum of every row
     * 2. Sum of every column
     *
     * Example:
     *
     * Matrix:
     *
     * 1  2  3
     * 4  5  6
     * 7  8  9
     *
     * Row sums:
     * Row 1 = 6
     * Row 2 = 15
     * Row 3 = 24
     *
     * Column sums:
     * Column 1 = 12
     * Column 2 = 15
     * Column 3 = 18
     *
     * CONCEPT:
     *
     * A matrix has rows and columns.
     *
     * Nested loops are perfect for accessing every element.
     *
     * matrix[i][j]
     *
     * i -> row
     * j -> column
     */

    static void problem07() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        // Input matrix
        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                matrix[i][j] = sc.nextInt();
            }
        }

        // Print matrix
        System.out.println("\nMatrix:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        // Row sums
        System.out.println("\nRow sums:");

        for (int i = 0; i < rows; i++) {

            int rowSum = 0;

            for (int j = 0; j < columns; j++) {

                rowSum = rowSum + matrix[i][j];
            }

            System.out.println(
                    "Row " + (i + 1) + " = " + rowSum
            );
        }

        // Column sums
        System.out.println("\nColumn sums:");

        for (int j = 0; j < columns; j++) {

            int columnSum = 0;

            for (int i = 0; i < rows; i++) {

                columnSum = columnSum + matrix[i][j];
            }

            System.out.println(
                    "Column " + (j + 1) + " = " + columnSum
            );
        }
    }


    // ============================================================
    // Problem 08
    // ============================================================

    /*
     * QUESTION:
     * Print all Pythagorean triplets whose values are <= n.
     *
     * A Pythagorean triplet satisfies:
     *
     *     a² + b² = c²
     *
     * Example:
     *
     * 3, 4, 5
     *
     * 3² + 4² = 5²
     * 9 + 16 = 25
     *
     * Therefore:
     *
     * (3, 4, 5) is a Pythagorean triplet.
     *
     * CONCEPT:
     *
     * We need three numbers:
     *
     * a
     * b
     * c
     *
     * Therefore, we use three nested loops.
     *
     * Outer loop   -> a
     * Middle loop  -> b
     * Inner loop   -> c
     *
     * Then check:
     *
     * a*a + b*b == c*c
     *
     * We also use b > a and c > b to avoid duplicate
     * combinations such as:
     *
     * (3,4,5)
     * (4,3,5)
     *
     * We only want one of them.
     */

    static void problem08() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Pythagorean triplets:");

        for (int a = 1; a <= n; a++) {

            for (int b = a + 1; b <= n; b++) {

                for (int c = b + 1; c <= n; c++) {

                    if ((a * a) + (b * b) == (c * c)) {

                        System.out.println(
                                "(" + a + ", " + b + ", " + c + ")"
                        );
                    }
                }
            }
        }
    }


    // ============================================================
    // MAIN METHOD
    // ============================================================

    /*
     * HOW TO RUN:
     *
     * Uncomment ONE problem at a time.
     *
     * Example:
     *
     * problem01();
     *
     * Run the program and study the output.
     *
     * Then comment problem01() and uncomment problem02().
     *
     * This allows all 8 problems to stay in ONE file.
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
    }
}
```

Bestie, this gives you the complete **Phase 4 — Nested Loop Logic** in the same style as your previous files. Notice that **Problem 8 uses three nested loops**, which is a good first step toward understanding more complex algorithmic logic.

For GitHub, commit it with:

```text
Add nested loop logic problems
```

Then your progression is:

**While → Do-While → For → Nested Loop** ✅
