public class MissingChar {

    public static String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n + 1);
        return front + back;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(missingChar("kitten", 1));
        System.out.println(missingChar("kitten", 0));
        System.out.println(missingChar("kitten", 4));
        System.out.println(missingChar("code", 2));
        System.out.println(missingChar("java", 3));
    }
}

