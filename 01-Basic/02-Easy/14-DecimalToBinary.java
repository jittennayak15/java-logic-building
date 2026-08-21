//The standard DSA approach is to repeatedly divide the number by 2 and collect the remainders.
public class DecimalToBinary {

    // Method to convert decimal number to binary
    public static String decimalToBinary(int n) {

        // Special case: binary representation of 0 is "0"
        if (n == 0) {
            return "0";
        }

        // Store the binary digits
        StringBuilder binary = new StringBuilder();

        // Continue until n becomes 0
        while (n > 0) {

            // Get the remainder when n is divided by 2
            int remainder = n % 2;

            // Add the remainder to the result
            binary.append(remainder);

            // Divide n by 2 to process the next digit
            n = n / 2;
        }

        // Digits were generated in reverse order,
        // so reverse them to get the correct binary number
        return binary.reverse().toString();
    }

    public static void main(String[] args) {

        int n = 12;

        // Call the method and print the binary representation
        System.out.println(decimalToBinary(n));
    }
}

/* dryrun--
| `n` | `n % 2` | `n / 2` |
| --: | ------: | ------: |
|  12 |       0 |       6 |
|   6 |       0 |       3 |
|   3 |       1 |       1 |
|   1 |       1 |       0 |

Remainders:  0 → 0 → 1 → 1

Reverse: 1 → 1 → 0 → 0
  Answer = 1100
  */
// Concept: modulo + integer division + StringBuilder
// % 2 gives the next binary digit
// / 2 removes the processed part
// Reverse the collected digits because they are generated backwards
  
