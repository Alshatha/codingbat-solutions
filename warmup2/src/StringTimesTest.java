public class StringTimesTest {

    public static String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
        }
        return result;
    }

    public static void main(String[] args) {
        // Example usage
        String output = stringTimes("Hi", 3);
        System.out.println(output);
    }
}
