public class BackAround {

    public static String backAround(String str) {
        // Get the last character
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(backAround("cat"));
        System.out.println(backAround("Hello"));
        System.out.println(backAround("a"));
        System.out.println(backAround("xyz"));
    }
}

