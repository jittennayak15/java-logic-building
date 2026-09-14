```java
import java.util.Scanner;

public class ForLoopProblems {

    /*
     * ============================================================
     * FOR LOOP - BASIC CONCEPT
     * ============================================================
     *
     * Syntax:
     *
     * for (initialization; condition; update) {
     *     // code
     * }
     *
     * Example:
     *
     * for (int i = 1; i <= 10; i++) {
     *     System.out.println(i);
     * }
     *
     * HOW IT WORKS:
     *
     * 1. Initialization runs only once.
     * 2. Condition is checked.
     * 3. If condition is true, loop body executes.
     * 4. Update runs.
     * 5. Condition is checked again.
     * 6. Steps 3-5 continue until condition becomes false.
     *
     * FOR LOOP IS BEST WHEN:
     * We already know how many times we want to repeat something.
     *
     * Example:
     * Print 1 to 10 -> we know it runs 10 times.
     */


    // ============================================================
    // Problem 01
    // ============================================================

    /*
     * QUESTION:
     * Print numbers from 1 to 10 using a for loop.
     *
     * OUTPUT:
     * 1 2 3 4 5 6 7 8 9 10
     *
     * CONCEPT:
     * Start i from 1.
     * Continue while i <= 10.
     * Increase i by 1 after every iteration.
     */

    static void problem01() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }


    // ============================================================
    // Problem 02
    // ============================================================

    /*
     * QUESTION:
     * Print numbers from 10 down to 1.
     *
     * OUTPUT:
     * 10 9 8 7 6 5 4 3 2 1
     *
     * CONCEPT:
     * Here we start from 10.
     * Instead of i++, we use i-- because we are moving backwards.
     */

    static void problem02() {

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }


    // ============================================================
    // Problem 03
    // ============================================================

    /*
     * QUESTION:
     * Print all even numbers between 1 and 100.
     *
     * OUTPUT:
     * 2 4 6 8 10 ... 100
     *
     * CONCEPT:
     * A number is even when:
     *
     * number % 2 == 0
     *
     * Instead of checking every number, we can start from 2
     * and increase by 2.
     */

    static void problem03() {

        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
    }


    // ============================================================
    // Problem 04
    // ============================================================

    /*
     * QUESTION:
     * Print all odd numbers between 1 and 100.
     *
     * OUTPUT:
     * 1 3 5 7 9 ... 99
     *
     * CONCEPT:
     * Odd numbers are not divisible by 2.
     *
     * We start from 1 and increase by 2.
     */

    static void problem04() {

        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);
        }
    }


    // ============================================================
    // Problem 05
    // ============================================================

    /*
     * QUESTION:
     * Print the multiplication table of a given number
     * from n x 1 to n x 10.
     *
     * Example:
     *
     * Input: 5
     *
     * Output:
     * 5 x 1 = 5
     * 5 x 2 = 10
     * ...
     * 5 x 10 = 50
     */

    static void problem05() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }


    // ============================================================
    // Problem 06
    // ============================================================

    /*
     * QUESTION:
     * Find the factorial of a given number.
     *
     * Example:
     *
     * Input: 5
     *
     * 5! = 5 x 4 x 3 x 2 x 1
     *    = 120
     *
     * CONCEPT:
     * Start factorial from 1 because multiplying by 1
     * does not change the result.
     */

    static void problem06(){
        int n = 5;
        int fact = 1;
        for(int i =1; i<=n; i++){
            fact *= i;
        }
        System.out.println(fact);
    } 

    // ============================================================
    // Problem 07
    // ============================================================

    /*
     * QUESTION:
     * Find the factorial of every number from 1 to n.
     *
     * Example:
     *
     * Input: 5
     *
     * Output:
     * 1! = 1
     * 2! = 2
     * 3! = 6
     * 4! = 24
     * 5! = 120
     *
     * CONCEPT:
     * We need an outer loop to visit every number.
     *
     * For each number, calculate its factorial.
     *
     * This introduces the idea of nested loops.
     */

    static void problem07(){
        int n = 5;
        for(int i =1; i<=n; i++){
            int fact = 1;
            for(int j = 1; j<= i; j++){
                fact *= j;
            }
            System.out.println(i + "!=" + fact);
        }
    } 


    // ============================================================
    // Problem 08
    // ============================================================

    /*
     * QUESTION:
     * Print all prime numbers between 1 and 100.
     *
     * OUTPUT:
     * 2 3 5 7 11 13 ...
     *
     * CONCEPT:
     * A prime number has exactly two factors:
     * 1 and itself.
     *
     * We use an inner loop to check whether each number
     * has any divisor other than 1 and itself.
     */

    static void problem08(){
        for(int number = 1; number<=100; number++){
            boolean prime = true;
        for(int i =2; i< number; i++){
            if(number % i == 0){
                prime = false;
                break;
            }
        }
        if(prime){
            System.out.println(number);
        }
        }
    } 

    // ============================================================
    // Problem 09
    // ============================================================

    /*
     * QUESTION:
     * Check whether a given number is prime.
     *
     * Example:
     *
     * Input: 7
     * Output: Prime Number
     *
     * Input: 10
     * Output: Not a Prime Number
     *
     * CONCEPT:
     * Try dividing the number by values from 2 to number - 1.
     *
     * If any number divides it completely,
     * then it is not prime.
     */

    static void problem09(){
        int n = 11;
        boolean prime = true;
        for(int i = 2; i<n; i++){
            if(n % i == 0){
                prime = false;
                break;
            }
        }
        if(prime && n>1){
            System.out.println("prime");
        } else{
            System.out.println("not prime");
        }
    } 



    // ============================================================
    // Problem 10
    // ============================================================

    /*
     * QUESTION:
     * Print the first n terms of the Fibonacci series.
     *
     * Example:
     *
     * Input: 7
     *
     * Output:
     * 0 1 1 2 3 5 8
     *
     * CONCEPT:
     *
     * Fibonacci:
     *
     * next = first + second
     *
     * Then move:
     *
     * first  = second
     * second = next
     */

    static void problem10(){
        int n = 10;
        int a =0, b=1;
        for(int i=1; i<=n; i++){
            System.out.println(a + " ");
            int c = a+b;
            a =b;
            b = c;
        }
    }

    

    // ============================================================
    // Problem 11
    // ============================================================

    /*
     * QUESTION:
     * Find the sum of the first 6 Fibonacci numbers.
     *
     * GIVEN DATA:
     * Number of terms = 6
     *
     * Fibonacci series:
     * 0 1 1 2 3 5
     *
     * Sum = 12
     *
     * CONCEPT:
     * Fibonacci:
     *
     * next = first + second
     *
     * After every iteration:
     *
     * first  = second
     * second = next
     */

    static void problem11() {

        int n = 6;

        int first = 0;
        int second = 1;

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            // Add current Fibonacci number to sum
            sum = sum + first;

            // Calculate next Fibonacci number
            int next = first + second;

            // Move the numbers forward
            first = second;
            second = next;
        }

        System.out.println("Sum of Fibonacci numbers = " + sum);
    }


    // ============================================================
    // Problem 12
    // ============================================================

    /*
     * QUESTION:
     * Print all factors of the given number.
     *
     * GIVEN DATA:
     * Number = 12
     *
     * Factors:
     * 1, 2, 3, 4, 6, 12
     *
     * CONCEPT:
     * A factor divides the number completely.
     *
     * If:
     *
     * number % i == 0
     *
     * then i is a factor.
     */

    static void problem12() {

        int n = 12;

        System.out.println("Factors of " + n + ":");

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }


    // ============================================================
    // Problem 13
    // ============================================================

    /*
     * QUESTION:
     * Find the sum of all factors of the given number.
     *
     * GIVEN DATA:
     * Number = 12
     *
     * Factors:
     * 1, 2, 3, 4, 6, 12
     *
     * Sum:
     * 1 + 2 + 3 + 4 + 6 + 12 = 28
     */

    static void problem13() {

        int n = 12;

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            // Check whether i is a factor
            if (n % i == 0) {

                sum = sum + i;
            }
        }

        System.out.println("Sum of factors = " + sum);
    }


    // ============================================================
    // Problem 14
    // ============================================================

    /*
     * QUESTION:
     * Find the HCF (Highest Common Factor) of two numbers.
     *
     * GIVEN DATA:
     * a = 12
     * b = 18
     *
     * Common factors:
     * 1, 2, 3, 6
     *
     * HCF = 6
     *
     * CONCEPT:
     * A common factor must divide BOTH numbers.
     *
     * We check numbers from 1 to the smaller number.
     * Every time we find a common factor, we store it.
     * The last/largest one will be the HCF.
     */

    static void problem14() {

        int a = 12;
        int b = 18;

        int hcf = 1;

        // Find the smaller number
        int smaller = Math.min(a, b);

        for (int i = 1; i <= smaller; i++) {

            // Check if i divides both numbers
            if (a % i == 0 && b % i == 0) {

                hcf = i;
            }
        }

        System.out.println("HCF = " + hcf);
    }


    // ============================================================
    // Problem 15
    // ============================================================

    /*
     * QUESTION:
     * Find the LCM (Least Common Multiple) of two numbers.
     *
     * GIVEN DATA:
     * a = 4
     * b = 6
     *
     * Multiples of 4:
     * 4, 8, 12, 16...
     *
     * Multiples of 6:
     * 6, 12, 18...
     *
     * LCM = 12
     *
     * CONCEPT:
     * Start checking from the larger number.
     *
     * The first number that is divisible by BOTH
     * a and b is the LCM.
     */

    static void problem15() {

        int a = 4;
        int b = 6;

        int start = Math.max(a, b);

        int lcm = start;

        for (int i = start; ; i += start) {

            // Check if i is divisible by both numbers
            if (i % a == 0 && i % b == 0) {

                lcm = i;

                // Stop the loop after finding LCM
                break;
            }
        }

        System.out.println("LCM = " + lcm);
    }


    // ============================================================
    // Problem 16
    // ============================================================

    /*
     * QUESTION:
     * Print the squares of numbers from 1 to n.
     *
     * GIVEN DATA:
     * n = 5
     *
     * Output:
     * 1² = 1
     * 2² = 4
     * 3² = 9
     * 4² = 16
     * 5² = 25
     *
     * FORMULA:
     *
     * square = number * number
     */

    static void problem16() {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            int square = i * i;

            System.out.println(i + "² = " + square);
        }
    }


    // ============================================================
    // Problem 17
    // ============================================================

    /*
     * QUESTION:
     * Print the cubes of numbers from 1 to n.
     *
     * GIVEN DATA:
     * n = 5
     *
     * Output:
     * 1³ = 1
     * 2³ = 8
     * 3³ = 27
     * 4³ = 64
     * 5³ = 125
     *
     * FORMULA:
     *
     * cube = number * number * number
     */

    static void problem17() {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            int cube = i * i * i;

            System.out.println(i + "³ = " + cube);
        }
    }


    // ============================================================
    // Problem 18
    // ============================================================

    /*
     * QUESTION:
     * Print all numbers between a and b that are divisible by 7.
     *
     * GIVEN DATA:
     * a = 10
     * b = 50
     *
     * Output:
     * 14
     * 21
     * 28
     * 35
     * 42
     * 49
     *
     * CONCEPT:
     * A number is divisible by 7 when:
     *
     * number % 7 == 0
     */

    static void problem18() {

        int a = 10;
        int b = 50;

        System.out.println(
                "Numbers divisible by 7 between " + a + " and " + b + ":"
        );

        for (int i = a; i <= b; i++) {

            if (i % 7 == 0) {

                System.out.println(i);
            }
        }
    }


    // ============================================================
    // Problem 19
    // ============================================================

    /*
     * QUESTION:
     * Find the sum of the first n natural numbers.
     *
     * GIVEN DATA:
     * n = 10
     *
     * Calculation:
     *
     * 1 + 2 + 3 + ... + 10
     *
     * Sum = 55
     *
     * CONCEPT:
     * Natural numbers start from 1.
     */

    static void problem19() {

        int n = 10;

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            sum = sum + i;
        }

        System.out.println("Sum of natural numbers = " + sum);
    }


    // ============================================================
    // Problem 20
    // ============================================================

    /*
     * QUESTION:
     * Find the sum of all even numbers from 1 to n.
     *
     * GIVEN DATA:
     * n = 10
     *
     * Even numbers:
     * 2 + 4 + 6 + 8 + 10
     *
     * Sum = 30
     *
     * CONCEPT:
     * Even numbers are divisible by 2.
     *
     * We can start from 2 and increase by 2.
     */

    static void problem20() {

        int n = 10;

        int sum = 0;

        for (int i = 2; i <= n; i += 2) {

            sum = sum + i;
        }

        System.out.println("Sum of even numbers = " + sum);
    }


    // ============================================================
    // Problem 21
    // ============================================================

    /*
     * QUESTION:
     * Find the sum of all odd numbers from 1 to n.
     *
     * GIVEN DATA:
     * n = 10
     *
     * Odd numbers:
     * 1 + 3 + 5 + 7 + 9
     *
     * Sum = 25
     *
     * CONCEPT:
     * Odd numbers are not divisible by 2.
     *
     * We start from 1 and increase by 2.
     */

    static void problem21() {

        int n = 10;

        int sum = 0;

        for (int i = 1; i <= n; i += 2) {

            sum = sum + i;
        }

        System.out.println("Sum of odd numbers = " + sum);
    }


    // ============================================================
    // MAIN METHOD
    // ============================================================

    /*
     * Run ONE problem at a time.
     *
     * Uncomment the problem you want to practice.
     */

    public static void main(String[] args) {

        problem01();

        // problem12();
        // problem13();
        // problem14();
        // problem15();
        // problem16();
        // problem17();
        // problem18();
        // problem19();
        // problem20();
        // problem21();
    }
}
```

### Small correction for your GitHub learning style

For **Problems 11–21**, this is actually better for learning the `for` loop because there is **no `Scanner` distraction**.

Your progression is:

```text
01–10 → Basic for-loop practice
11–15 → Number logic + nested/conditional logic
16–17 → Mathematical calculation
18–21 → Range + sum logic
```

After adding these to your existing `ForLoopProblems.java`, commit:

```text
Add for loop problems 11 to 21
```

**One important thing:** Problem 11 assumes the Fibonacci series starts with `0, 1`, which is the standard convention used here.
