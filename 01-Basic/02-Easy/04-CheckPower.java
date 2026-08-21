public class PowerOfAnother {

    // Method to check whether y is a power of x
    public static boolean isPower(int x, int y) {

        // 1 is x raised to the power 0
        if (y == 1) {
            return true;
        }

        // Keep dividing y by x while it is completely divisible
        while (y % x == 0) {

            // Divide y by x
            y = y / x;
        }

        // If y becomes 1, then y was a power of x
        return y == 1;
    }

    public static void main(String[] args) {

        int x = 2;
        int y = 8;

        // Call the method and print the result
        System.out.println(isPower(x, y));
    }
}
