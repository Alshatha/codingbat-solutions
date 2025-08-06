public class LastDigit {

    public static boolean lastDigit(int a, int b) {
        return (a % 10 == b % 10);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(lastDigit(27, 57));  // true
        System.out.println(lastDigit(12, 13));  // false
        System.out.println(lastDigit(6, 16));   // true
        System.out.println(lastDigit(3, 113));  // true
        System.out.println(lastDigit(10, 0));   // true
    }
}
