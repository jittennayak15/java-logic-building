public class SwapNumbers {

    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        // Store the value of a temporarily
        int temp = a;

        // Put the value of b into a
        a = b;

        // Put the original value of a into b
        b = temp;

        // Print the swapped values
        System.out.println(a + " " + b);
    }
}
