```java
import java.util.Scanner;

public class WhileProblems {

    // ============================================================
    // Problem 01: Print all numbers from 1 to 10 using a while loop.
    // ============================================================

    static void problem01() {

        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }


    // ============================================================
    // Problem 02: Print numbers from 10 down to 1 in reverse order.
    // ============================================================

    static void problem02() {

        int i = 10;

        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }


    // ============================================================
    // Problem 03: Print all even numbers between 1 and 100.
    // ============================================================

    static void problem03() {

        int i = 2;

        while (i <= 100) {
            System.out.println(i);
            i += 2;
        }
    }


    // ============================================================
    // Problem 04: Print all odd numbers between 1 and 100.
    // ============================================================

    static void problem04() {

        int i = 1;

        while (i <= 100) {
            System.out.println(i);
            i += 2;
        }
    }


    // ============================================================
    // Problem 05: Print the multiplication table of a given number
    // from n × 1 to n × 10.
    // ============================================================

    static void problem05(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number : ");
    int n = sc.nextInt();

    int i = 1;
    while(i<= 10){
        System.out.println(n + "*" + i + "=" + (n*i));
        i++;

    }

    } 



    // ============================================================
    // Problem 06: Calculate and print the sum of the first
    // n natural numbers.
    // ============================================================

    static void problem06(){
        int n = 15;
        int i =1;
        int sum =0;
        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println(sum);
    } 

    


    // ============================================================
    // Problem 07: Calculate the sum of all even numbers
    // from 1 up to n.
    // ============================================================

   static void problem07(){
   int n = 100;
   int i =2;
   int sum =0;

   while(i<=n){
    sum += i;
    i += 2;

   }
   System.out.println(sum);
   } 


    // ============================================================
    // Problem 08: Calculate the sum of all odd numbers
    // from 1 up to n.
    // ============================================================

    static void problem08(){
    int n = 15;
    int i = 1;
    int sum = 0;

    while(i<= n){
        sum += i;
        i += 2;
    }
    System.out.println(sum);
   } 

    // ============================================================
    // Problem 09: Calculate and print the factorial of
    // a given number.
    // ============================================================

    static void problem09(){
    int n = 5;
    int fact =1;
    while(n>0){
        fact *= n;
        n--;
    }
    System.out.println(fact);
   }  


    // ============================================================
    // Problem 10: Find and print the product of all digits
    // of a given number.
    // ============================================================

    static void problem10(){
    int n = 234;
    int product =1;
    while(n>0){
        int digit = n % 10;
        product *= digit;
        n /= 10;
    }
    System.out.println(product);
   } 
  


    // ============================================================
    // Problem 11: Count and print the total number of digits
    // in a given number.
    // ============================================================

    static void problem11(){
    int n = 754673;
    int count =0;
    while(n>0){
        count++;
        n /= 10;
    }
    System.out.println(count);
   }


    // ============================================================
    // Problem 12: Reverse the given number and print
    // the reversed value.
    // ============================================================

    static void problem12(){
   int n = 1234;
   int reverse =0;
   while(n>0){
    int digit = n % 10;
    reverse = reverse * 10 + digit;
    n /= 10;
   
   }
   System.out.println(reverse);
   }
  // explain>>>>>>>>>>>>
  /* 1) reverse =0
  digit = 4
  reverse = reverse * 10+ digit
          = 0 * 10 + 4 
          = 4
  2) reverse =4
  digit = 3
  reverse = 4 * 10 + 3
          = 43
  3) reverse = 43 * 10 + 2
             = 432
  4) reverse = 432 * 10 + 1
             = 4321 ( ans) */



    // ============================================================
    // Problem 13: Check whether the given number is a palindrome.
    // ============================================================

    static void problem13(){
        int n = 121;
        int original = n;
        int reverse = 0;
        while(n>0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;

        }
        if(original == reverse){
            System.out.println("palindrome");
        } else{
            System.out.println("not palindrome");
        }

  }


    // ============================================================
    // Problem 14: Find and print the sum of digits
    // of the given number.
    // ============================================================

    static void problem14(){
            int n = 123;
            int sum =0;
            while(n>0){
                int digit = n % 10;
                sum += digit;
                n /= 10;
            

            }
            System.out.println(sum);
        }

    // ============================================================
    // Problem 15: Check whether the given number is
    // an Armstrong number.
    // ============================================================

    static void problem15(){
        int n = 1634;
        int original = n;
        int sum = 0;
        while(n>0){
            int lastdigit = n % 10;
            sum += lastdigit * lastdigit * lastdigit * lastdigit;
            n /= 10;

        }
        if(sum == original){
            System.out.println("armstrong");
        } else{
            System.out.println("not armstrong");
        }
    }
// armstrong numbers-->>>>>>>>>>>>
  // 153 >>>> 3^3 = 27, 5^3 = 125; 1^3 = 1 =>>> 27+ 125+ 1 = 153 armstrong number 
  /* single digit : 0 to 9;
  3-digit : 153, 370, 371, 407
  4-digit : 1634, 8208, 9474 */

    // ============================================================
    // Problem 16: Check whether the given number is
    // a Perfect number.
    // ============================================================


  // def :-  perfect number = sum of all divisiors( excluding the number itself) == number 
  // ex - 6 >>> 1+ 2 + 3 = 6
  // 28  >>> 1+ 2+4+7+14 = 28
  // 496 >>> 1+2+4+8+16+31+62+124+248 = 496
  // 8128 >>> 1+2+4+8+16+32+64+127+254+508+1016+2032+4064 = 8128
  // 6, 28, 496, 8128 these four numbers are first four perfect number.
    static void problem16(){
        int n = 28;
        int i = 1;
        int sum = 0;
        while(i<n){
            if(n % i == 0){
                sum += i;
            }
            i++;
        }
        if(sum == n){
            System.out.println("perfect number");
        } else{
            System.out.println("not perfect number");
        }
    }

    // ============================================================
    // Problem 17: Print all prime numbers between 1 and 100.
    // ============================================================

  // A prime number is a whole number greater than 1 that can be divided evenly only by 1 and itself
  // ex - 2,3,5,7,11,13,17,19,23,29,31,37,41,47,53,59,61,67,71,73,79,83,89,97 so on .
    static void problem17(){
    int number = 8;
    while(number <= 100){
        int divisiors = 2;
        boolean prime = true;

        while(divisiors < number){
            if(number % divisiors == 0){
                prime = false;
                break;
            
            }
            divisiors++;
        }
        if(prime){
            System.out.println(number);
        } 
        number++;
    }
   }
  

    // ============================================================
    // Problem 18: Check whether the given number is a prime number.
    // ============================================================


  static void problem18(){
    int number = 11;
    int divisiors = 2;
    boolean prime = true;
    while(divisiors < number){
        if(number % divisiors == 0){
            prime = false;
            break;
        }
        divisiors++;
    }
    if(prime && number>1){
        System.out.println("prime");
    } else{
        System.out.println("not prime");
    }
   }
    

    // ============================================================
    // Problem 19: Print the Fibonacci series up to n terms.
    // ============================================================

    // fibonacci series :- the fibonacci series is a sequence of numbers where each number is 
    // the sum of the two preceding ones, usually starting with 0 and 1.
    // 0 1 1 2 3 5 8 13 21 34 ........and so on. 
    static void problem19(){
        int n = 10;
        int a = 0, b = 1;
        int i =1;
        while(n>=i){
            System.out.println(a + " ");
            int c = a + b ;
            a = b;
            b = c;
            i++;
        }
    }
  


    // ============================================================
    // Problem 20: Find and print the sum of the Fibonacci
    // series up to n terms.
    // ============================================================


    // 0 + 1+1+2+3+5+8+13+21+34 = 88 (sum of the fibonacci series upto 10 terms) 
    static void problem20(){
        int n = 10;
        int a =0, b = 1;
        int i =1;
        int sum =0;
        while (i<=n){
            sum += a;
            int c = a+b;
            a =b ;
            b = c;
            i++;
        }
        System.out.println(sum);
    }



    // ============================================================
    // Problem 21: Print the square of each number from 1 to n.
    // ============================================================

    static void problem21(){
        int n = 5;
        int i = 1;
        while(n>=i){
            System.out.println(i * i);
            i++;
        }
    }


    // ============================================================
    // Problem 22: Print the cube of each number from 1 to n.
    // ============================================================

    static void problem22(){
        int n = 5;
        int i =1;
        while(n>=i){
            System.out.println(i*i*i);
            i++;
        }
    }

    // ============================================================
    // Problem 23: Print all numbers between a and b
    // that are divisible by 7.
    // ============================================================

    static void problem23(){
        int a = 10;
        int b = 50;
        while(a<=b){
            if(a % 7 == 0){
                System.out.println(a);
            }
            a++;
        }
    }


    // ============================================================
    // Problem 24: Print all factors of the given number.
    // ============================================================

    static void problem24(){
    int n = 12;
    int i = 1;
    while(i<=n){
        if(n % i == 0){
            System.out.println(i);
        }
        i++;
    }
   }
  // 1,2,3,4,6,12 factors ofnumber 12.

    // ============================================================
    // Problem 25: Find and print the sum of all factors
    // of the given number.
    // ============================================================

    static void problem25(){
    int n = 15;
    int i = 1;
    int sum = 0;
    while(n>=i){
        if(n % i == 0){
            sum += i;

        }
        i++;
    }
    System.out.println(sum);
   }

  // n = 15 , 1+3+5+15 = 24 ans

    // ============================================================
    // Problem 26: Find the HCF (Highest Common Factor)
    // of two given numbers.
    // ============================================================

    static void problem26(){
    int a = 12;
    int b = 18;
    int i = 1;
    int hcf = 0;
    while(a>= i && b>=i){
        if(a%i ==0 && b% i ==0){
            hcf = i;
        }
        i++;
    }
    System.out.println(hcf);
   }
  // a = 12 , b = 18
  // 12 divisiors = 1,2,3,4,6,12
  // 18 divisiors = 1,2,3,6,9,18
  // common divisiors = 1,2,3,6
  // the largest is : 6 
  // highest common factor(HCF) : 6

    // ============================================================
    // Problem 27: Find the LCM (Least Common Multiple)
    // of two given numbers.
    // ============================================================

    static void problem27(Scanner sc) {

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("LCM = 0");
            return;
        }

        int lcm = Math.max(a, b);

        while (true) {

            if (lcm % a == 0 && lcm % b == 0) {
                break;
            }

            lcm++;
        }

        System.out.println("LCM = " + lcm);
    }


    // ============================================================
    // Problem 28: Find the smallest digit in the given number.
    // ============================================================

    static void problem28(){
    int n = 837963;
    int smallest = 9;
    while(n>0){
        int digit = n%10;
        if(digit < smallest){
            smallest = digit;
        }
        n /= 10;
    }
    System.out.println(smallest);
   }
// 3 ans.
    // ============================================================
    // Problem 29: Find the largest digit in the given number.
    // ============================================================

    static void problem29(){
    int n = 479354;
    int largest =0;
    while(n>0){
        int digit = n % 10;
        if(largest < digit){
            largest = digit;

        }
        n /= 10;
    }
    System.out.println(largest);

   }
// 9 ans. 


    // ============================================================
    // Main Method
    // ============================================================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Call the problem you want to practice.

        problem01();

        // Example:
        // problem02();
        // problem03();
        // problem04();
        // problem05(sc);
        // problem06(sc);
        // problem07(sc);
        // problem08(sc);
        // problem09(sc);
        // problem10(sc);
        // problem11(sc);
        // problem12(sc);
        // problem13(sc);
        // problem14(sc);
        // problem15(sc);
        // problem16(sc);
        // problem17();
        // problem18(sc);
        // problem19(sc);
        // problem20(sc);
        // problem21(sc);
        // problem22(sc);
        // problem23(sc);
        // problem24(sc);
        // problem25(sc);
        // problem26(sc);
        // problem27(sc);
        // problem28(sc);
        // problem29(sc);

        sc.close();
    }
}
```
