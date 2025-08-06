public class StringBits {

    public static String stringBits(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i += 2) {
            result += str.substring(i, i + 1);

        }
        return result;
    }

    public static void main(String[] args) {
        // Test examples
        System.out.println(stringBits("Hello"));
        System.out.println(stringBits("Hi"));
        System.out.println(stringBits("Heeololeo"));
        System.out.println(stringBits(""));
        System.out.println(stringBits("H"));
    }
}

