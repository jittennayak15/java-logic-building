// [Expected Approach] Using Sum of Two Sides
public class OppositeFaceOfDice {

    // Find the number on the opposite face of the dice
    public static int oppositeFace(int n) {

        // Opposite faces of a standard dice always add up to 7
        return 7 - n;
    }

    public static void main(String[] args) {

        int n = 2;

        // Call method and print the opposite face
        System.out.println(oppositeFace(n));
    }
}

// [Naive Approach] Using if-else Statement----------------------------------->>>>>>>>>>>>>>>>
public class OppositeFaceOfDice {

    // Find the opposite face using if-else
    public static int oppositeFace(int n) {

        // Check each face and return its opposite
        if (n == 1) {
            return 6;
        } else if (n == 2) {
            return 5;
        } else if (n == 3) {
            return 4;
        } else if (n == 4) {
            return 3;
        } else if (n == 5) {
            return 2;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {

        int n = 2;

        // Call method and print the opposite face
        System.out.println(oppositeFace(n));
    }
}
