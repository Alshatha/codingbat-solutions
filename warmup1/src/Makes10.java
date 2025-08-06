public class Makes10 {

    public static boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a + b == 10);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(makes10(9, 1));
        System.out.println(makes10(10, 5));
        System.out.println(makes10(2, 8));
        System.out.println(makes10(3, 7));
        System.out.println(makes10(6, 6));
    }
}
