public class ClosestMultiple {

    // Find the closest number to n that is divisible by m
    public static int closestNumber(int n, int m) {

        // Find the quotient of n divided by m
        int quotient = n / m;

        // Find the two closest multiples of m
        int lower = quotient * m;
        int upper = (quotient + 1) * m;

        // Calculate distance from n to both multiples
        int lowerDistance = Math.abs(n - lower);
        int upperDistance = Math.abs(n - upper);

        // If both are equally close, choose the one
        // having the maximum absolute value
        if (lowerDistance == upperDistance) {
            return Math.abs(lower) > Math.abs(upper) ? lower : upper;
        }

        // Return the closer multiple
        return lowerDistance < upperDistance ? lower : upper;
    }

    public static void main(String[] args) {

        int n = 13;
        int m = 4;

        // Call method and print the closest divisible number
        System.out.println(closestNumber(n, m));
    }
}
