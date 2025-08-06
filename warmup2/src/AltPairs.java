public class AltPairs {

    public static String altPairs(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i += 4) {
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            result += str.substring(i, end);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));
        System.out.println(altPairs(""));
        System.out.println(altPairs("a"));
    }
}
