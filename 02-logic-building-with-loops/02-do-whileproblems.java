```java
import java.util.Scanner;

public class DoWhileProblems {

    /*
     * ============================================================
     * DO-WHILE LOOP - BASIC CONCEPT
     * ============================================================
     *
     * Syntax:
     *
     * do {
     *     // code
     * } while (condition);
     *
     * Important:
     * A do-while loop executes the code AT LEAST ONCE,
     * even if the condition is false initially.
     *
     * Difference:
     *
     * while loop:
     *     condition -> code
     *
     * do-while loop:
     *     code -> condition
     *
     * Use do-while when you want something to happen at least once,
     * such as:
     * - Menu-driven programs
     * - Taking input from the user
     * - Repeating an operation until the user chooses to stop
     */


    // ============================================================
    // Problem 01
    // ============================================================

    /*
     * QUESTION:
     * Print numbers from 1 to 10 using a do-while loop.
     *
     * CONCEPT:
     * The loop starts with i = 1.
     * It prints i and then increases i by 1.
     * The loop continues while i <= 10.
     */

    static void problem01(){
    int i =1;
    do{
        System.out.println(i);
        i++;
    }while(i<= 10);

   } 



    // ============================================================
    // Problem 02
    // ============================================================

    /*
     * QUESTION:
     * Print the multiplication table of a given number
     * from n x 1 to n x 10.
     *
     * Example:
     * Input: 5
     *
     * Output:
     * 5
     * 10
     * 15
     * ...
     * 50
     */

    static void problem02(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number: ");
    int n = sc.nextInt();
    int i = 1;

    do { 
        System.out.println(n + "*" + i + "=" + (n*i));
        i++;
    } while (i<= 10);
} 


    // ============================================================
    // Problem 03
    // ============================================================

    /*
     * QUESTION:
     * Read numbers from the user until the user enters 0.
     * Find the sum of all entered numbers.
     *
     * Example:
     * Input:
     * 10 20 30 0
     *
     * Output:
     * Sum = 60
     *
     * CONCEPT:
     * The do-while loop is useful here because we need to
     * take input first and then check whether the input is 0.
     */

    static void problem03(){
    Scanner sc = new Scanner(System.in);
    int num;
    int sum = 0;
    do { 
        num = sc.nextInt();
        sum += num;
    } while (num != 0);
    System.out.println(sum);

}


    // ============================================================
    // Problem 04
    // ============================================================

    /*
     * QUESTION:
     * Read numbers until the user enters 0.
     * Find the largest number entered.
     *
     * Example:
     * Input:
     * 10 45 20 80 0
     *
     * Output:
     * Largest = 80
     */

    static void problem04(){
    Scanner sc = new Scanner(System.in);
    int num;
    int max = Integer.MIN_VALUE;
    do { 
        num = sc.nextInt();
        if(num > max){
            max = num;
        }
    } while (num != 0);
    System.out.println(max);
}
 
    // ============================================================
    // Problem 05
    // ============================================================

    /*
     * QUESTION:
     * Count the number of digits in a given number.
     *
     * Example:
     * Input: 12345
     * Output: 5
     *
     * CONCEPT:
     * Every time we divide the number by 10,
     * one digit is removed.
     *
     * 12345 -> 1234 -> 123 -> 12 -> 1 -> 0
     */

    static void problem05(){
    int n = 12345;
    int count = 0;
    do { 
        count++;
        n /= 10;
    } while (n>0);
    System.out.println(count);
}


    // ============================================================
    // Problem 06
    // ============================================================

    /*
     * QUESTION:
     * Reverse a given number using a do-while loop.
     *
     * Example:
     * Input: 1234
     * Output: 4321
     *
     * LOGIC:
     * 1. Get last digit using n % 10.
     * 2. Add digit to reversed number.
     * 3. Remove last digit using n / 10.
     */

    static void problem06(){
    int n = 12345;
    int reverse = 0;
    do { 
        int digit = n % 10;
        reverse = reverse * 10 + digit;
        n /= 10;
        
    } while (n>0);
    System.out.println(reverse);
} 

    // ============================================================
    // Problem 07
    // ============================================================

    /*
     * QUESTION:
     * Check whether a number is a palindrome.
     *
     * A palindrome number reads the same from left to right
     * and right to left.
     *
     * Examples:
     * 121 -> Palindrome
     * 1331 -> Palindrome
     * 123 -> Not Palindrome
     *
     * LOGIC:
     * 1. Store original number.
     * 2. Reverse the number.
     * 3. Compare original and reverse.
     */

    static void problem07(){
        int n = 121;
        int original = n;
        int reverse = 0;
        do { 
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        } while (n>0);
        if(original == reverse){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    } 

    // ============================================================
    // Problem 08
    // ============================================================

    /*
     * QUESTION:
     * Check whether a number is an Armstrong number.
     *
     * Example:
     * 153 = 1^3 + 5^3 + 3^3
     *     = 1 + 125 + 27
     *     = 153
     *
     * Therefore, 153 is an Armstrong number.
     *
     * NOTE:
     * This solution works for Armstrong numbers of any digit length.
     */

    static void problem08(){
    int n = 153;
    int original = n;
    int sum =0;
    do { 
        int digit = n % 10;
        sum += digit * digit * digit;
        n /= 10;
    } while (n>0);
    if(sum == original){
        System.out.println("armstrong");
    } else{
        System.out.println("not armstrong");
    }
   }
 


    // ============================================================
    // Problem 09
    // ============================================================

    /*
     * QUESTION:
     * Find the factorial of a given number.
     *
     * Example:
     * 5! = 5 x 4 x 3 x 2 x 1
     *    = 120
     *
     * CONCEPT:
     * factorial = n * (n-1) * ... * 1
     */

    static void problem09(){
    int n = 5;
    int fact = 1;
    do { 
        fact *= n;
        n--;
    } while (n>0);
    System.out.println(fact);
   }


    // ============================================================
    // Problem 10
    // ============================================================

    /*
     * QUESTION:
     * Print the first n terms of the Fibonacci series.
     *
     * Fibonacci:
     *
     * 0 1 1 2 3 5 8 13 ...
     *
     * Each new number is the sum of the previous two numbers.
     */

    static void problem10(){
        int n = 10;
        int a = 0, b =1;
        int i =1;
        do { 
            System.out.println(a+ " ");
            int c = a+b;
            a = b;
            b = c;
            i++;
        } while (i<=n);
    } 

    // ============================================================
    // Problem 11
    // ============================================================

    /*
     * QUESTION:
     * Find the HCF (Highest Common Factor) of two numbers.
     *
     * Example:
     * 12 and 18
     *
     * Factors of 12 = 1, 2, 3, 4, 6, 12
     * Factors of 18 = 1, 2, 3, 6, 18
     *
     * HCF = 6
     *
     * We use the Euclidean Algorithm:
     *
     * a % b becomes the new remainder.
     * Continue until b becomes 0.
     */

    static void problem11(){
        int a = 12;
        int b = 18;
        int i = 1;
        int HCF = 1;

        do { 
            if(a%i ==0 && b%i ==0){
                HCF =i;
            }
            i++;
            
        } while (i<=a && i<=b);

        System.out.println(HCF);
    }
 


    // ============================================================
    // Problem 12
    // ============================================================

    /*
     * QUESTION:
     * Create a menu-driven calculator using do-while.
     *
     * Menu:
     * 1. Addition
     * 2. Subtraction
     * 3. Multiplication
     * 4. Division
     * 5. Exit
     *
     * CONCEPT:
     * This is one of the BEST real-world uses of do-while.
     *
     * The menu must appear at least once.
     * After performing an operation, the menu appears again.
     * The program stops only when the user selects Exit.
     */

    static void problem12(){
        Scanner sc = new Scanner(System.in);
            int number;
            do{
                number = sc.nextInt();
                switch (number) {
                    case 1:
                        System.out.println("rose");
                        break;
                    case 2:
                        System.out.println("lily");
                        break;
                    case 3:
                        System.out.println("sunflower");
                        break;
                    case 4:
                        System.out.println("lotus");
                        
                        break;
                    default:
                        System.out.println("wrong switch");
                        break;
                    }
                }while (number != 4);

            } 


    // ============================================================
    // Problem 13
    // ============================================================

    /*
     * QUESTION:
     * Read numbers until the user enters a negative number.
     * Count how many positive numbers were entered.
     *
     * Example:
     * Input:
     * 10 20 5 7 -1
     *
     * Output:
     * Positive numbers = 4
     */

    static void problem13(){
        Scanner sc = new Scanner(System.in);
        int number;
        int count =0;

        do { 
            number = sc.nextInt();

            if(number > 0){
                count++;
            
            }
        } while (number >= 0);
        System.out.println(count);
    } 



    // ============================================================
    // Problem 14
    // ============================================================

    /*
     * QUESTION:
     * Find the sum of digits of a number.
     *
     * Example:
     * Input: 12345
     *
     * 1 + 2 + 3 + 4 + 5 = 15
     *
     * Output:
     * Sum of digits = 15
     */

    static void problem14(){
        int n = 12345;
        int sum = 0;

        do { 
            int digit = n%10;
            sum += digit;
            n /= 10;
        } while (n>0);
        System.out.println(sum);
    }
 


    // ============================================================
    // Problem 15
    // ============================================================

    /*
     * QUESTION:
     * Find the sum of even digits and the sum of odd digits
     * separately.
     *
     * Example:
     * Input: 123456
     *
     * Even digits = 2 + 4 + 6 = 12
     * Odd digits  = 1 + 3 + 5 = 9
     *
     * Output:
     * Sum of even digits = 12
     * Sum of odd digits = 9
     *
     * CONCEPT:
     * digit % 2 == 0 -> even digit
     * digit % 2 != 0 -> odd digit
     */

    static void problem15(){
        int n = 123456789;
        int evensum =0;
        int oddsum =0;

        do { 
            int digit = n % 10;
            if(digit % 2 == 0){
                evensum += digit;

            }else{
                oddsum += digit;
            }
            n /= 10;
        } while (n > 0);
        System.out.println("evensum =" + evensum);
        System.out.println("oddsum =" + oddsum);
    }
 


    // ============================================================
    // MAIN METHOD
    // ============================================================

    /*
     * HOW TO RUN ONE PROBLEM:
     *
     * Uncomment only the method you want to execute.
     *
     * Example:
     *
     * problem01();
     *
     * Then run the program.
     *
     * This keeps all 15 questions in ONE file while allowing
     * you to practice each problem separately.
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

This structure is excellent for your `java-logic-building` repository: **1 phase → 1 Java file → 1 method per question**, with comments explaining the concept and logic.

After adding it to GitHub, commit it as:

```text
Add do-while loop problems with solutions
```

Then your next folder will be **`03-for-loop/ForLoopProblems.java`** using the exact same method.
