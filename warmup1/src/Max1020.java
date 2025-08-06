public class Max1020 {

    public static int max1020(int a, int b) {
        // Make sure 'a' is the bigger value
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Check 'a' first, then 'b'
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(max1020(11, 19));  // 19
        System.out.println(max1020(19, 11));  // 19
        System.out.println(max1020(11, 9));   // 11
        System.out.println(max1020(9, 21));   // 0
        System.out.println(max1020(20, 20));  // 20
    }
}

