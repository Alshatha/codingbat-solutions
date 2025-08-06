public class SumDouble {

    public static int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b) {
            sum = sum * 2;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(sumDouble(1, 2));
        System.out.println(sumDouble(3, 2));
        System.out.println(sumDouble(2, 2));
        System.out.println(sumDouble(0, 0));
        System.out.println(sumDouble(-1, -1));
    }
}

