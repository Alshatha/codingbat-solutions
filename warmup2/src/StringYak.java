public class StringYak {

    public static String stringYak(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i = i + 2; // skip 'a' and 'k'
            } else {
                result += str.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(stringYak("yakpak"));
        System.out.println(stringYak("pakyak"));
        System.out.println(stringYak("yak123yak"));
        System.out.println(stringYak("yak"));
        System.out.println(stringYak("yakxxxyak"));
    }
}
