public class FrontBack {

    public static String frontBack(String str) {
        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length() - 1);
        return str.charAt(str.length() - 1) + mid + str.charAt(0);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));
        System.out.println(frontBack("abc"));
        System.out.println(frontBack("hello"));
    }
}

