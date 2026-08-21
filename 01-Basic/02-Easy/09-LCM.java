//LCM (Least Common Multiple) is the smallest positive number that is divisible by both numbers.
/*
a = 5
b = 11

Multiples of 5:  5, 10, 15, 20, ..., 55
Multiples of 11: 11, 22, 33, 44, 55

LCM = 55 
  */
//Naive Approach--------------
public class LCM {

    // Method to find LCM of two numbers
    public static int findLCM(int a, int b) {

        // Start checking from the larger number
        int lcm = Math.max(a, b);

        // Keep checking until we find a number
        // divisible by both a and b
        while (true) {

            // Check if lcm is divisible by both numbers
            if (lcm % a == 0 && lcm % b == 0) {

                // First such number is the LCM
                return lcm;
            }

            // Move to the next number
            lcm++;
        }
    }

    public static void main(String[] args) {

        int a = 5;
        int b = 11;

        // Call the method and print the LCM
        System.out.println(findLCM(a, b));
    }
}
//The expected efficient approach uses:----------------
// formula approach-->>>>   LCM(a, b) = (a × b) / GCD(a, b)
public class LCM {

    // Method to find GCD using Euclidean Algorithm
    public static int findGCD(int a, int b) {

        // Continue until b becomes 0
        while (b != 0) {

            // Store the remainder
            int remainder = a % b;

            // Move b to a
            a = b;

            // Move remainder to b
            b = remainder;
        }

        // a is the GCD
        return a;
    }

    // Method to find LCM using the formula
    public static int findLCM(int a, int b) {

        // LCM = (a × b) / GCD(a, b)
        return (a * b) / findGCD(a, b);
    }

    public static void main(String[] args) {

        int a = 5;
        int b = 11;

        // Call method and print the LCM
        System.out.println(findLCM(a, b));
    }
}
// Concept: LCM using GCD formula
// LCM(a, b) = (a × b) / GCD(a, b)

// Euclidean Algorithm:
// GCD(a, b) = GCD(b, a % b)






