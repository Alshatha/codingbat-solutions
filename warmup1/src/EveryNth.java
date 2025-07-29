public class EveryNth {

    public static String everyNth(String str, int n) {
        String result = "";

        for (int i = 0; i < str.length(); i = i + n) {
            result = result + str.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(everyNth("Miracle", 2));
        System.out.println(everyNth("abcdefg", 2));
        System.out.println(everyNth("abcdefg", 3));
        System.out.println(everyNth("Chocolate", 3));
    }
}
