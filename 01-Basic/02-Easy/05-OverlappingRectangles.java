public class RectangleOverlap {

    // Method to check whether two rectangles overlap
    public static boolean doOverlap(int[] l1, int[] r1, int[] l2, int[] r2) {

        // Check if the first rectangle is completely to the left
        // of the second rectangle
        if (l1[0] >= r2[0] || l2[0] >= r1[0]) {
            return false;
        }

        // Check if the first rectangle is completely above
        // the second rectangle
        if (r1[1] >= l2[1] || r2[1] >= l1[1]) {
            return false;
        }

        // If they are not separate, they overlap
        return true;
    }

    public static void main(String[] args) {

        int[] l1 = {0, 10};
        int[] r1 = {10, 0};

        int[] l2 = {5, 5};
        int[] r2 = {15, 0};

        // Check and print the result
        if (doOverlap(l1, r1, l2, r2)) {
            System.out.println("Rectangles Overlap");
        } else {
            System.out.println("Rectangles Don't Overlap");
        }
    }
}
