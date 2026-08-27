class Solution {

    // Function to check whether a large number is divisible by 13
    public boolean isDivisibleBy13(String s) {

        // Store the remainder while processing each digit
        int remainder = 0;

        // Process the number digit by digit
        for (int i = 0; i < s.length(); i++) {

            // Convert character digit into integer
            int digit = s.charAt(i) - '0';

            // Update remainder
            // Instead of creating the complete large number,
            // we only keep its remainder when divided by 13
            remainder = (remainder * 10 + digit) % 13;
        }

        // If remainder is 0, the number is divisible by 13
        return remainder == 0;
    }
}
/*
How it works

For s = "2911285":

We process one digit at a time:

remainder = 0

2  → (0 × 10 + 2) % 13 = 2
9  → (2 × 10 + 9) % 13 = 3
1  → (3 × 10 + 1) % 13 = 5
1  → (5 × 10 + 1) % 13 = 12
2  → (12 × 10 + 2) % 13 = 5
8  → (5 × 10 + 8) % 13 = 6
5  → (6 × 10 + 5) % 13 = 0

Final remainder = 0, therefore:

2911285 is divisible by 13 → true
Why this works

Suppose the current remainder is r and the next digit is d.

Appending d to the number means:

newNumber = oldNumber × 10 + d

So its remainder can be calculated as:

newRemainder = (r × 10 + d) % 13

We only keep the remainder, so even a number containing thousands or millions of digits can be processed.

Complexity
Time: O(n) — one pass through the string
Space: O(1) — only one remainder variable
  */
