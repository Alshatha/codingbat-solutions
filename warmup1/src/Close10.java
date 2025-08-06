public class Close10 {

    public static int close10(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);

        if (aDiff < bDiff) {
            return a;
        }
        if (bDiff < aDiff) {
            return b;
        }
        return 0;  // aDiff == bDiff
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(close10(8, 13));
        System.out.println(close10(13, 8));
        System.out.println(close10(13, 7));
        System.out.println(close10(9, 10));
        System.out.println(close10(10, 10));
    }
}
