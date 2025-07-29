public class In1020 {

    public static boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(in1020(12, 99));
        System.out.println(in1020(21, 12));
        System.out.println(in1020(8, 99));
        System.out.println(in1020(10, 20));
        System.out.println(in1020(5, 9));
    }
}
