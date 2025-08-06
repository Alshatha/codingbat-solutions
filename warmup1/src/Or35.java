public class Or35 {

    public static boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(or35(3));
        System.out.println(or35(10));
        System.out.println(or35(8));
        System.out.println(or35(15));
        System.out.println(or35(7));
    }
}
