public class IntMax {

    public static int intMax(int a, int b, int c) {
        int max;

        // Compare a and b first
        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        // Compare max and c
        if (c > max) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(intMax(1, 2, 3));
        System.out.println(intMax(9, 3, 6));
        System.out.println(intMax(3, 7, 5));
        System.out.println(intMax(10, 10, 10));
        System.out.println(intMax(-1, -2, -3));
    }
}

