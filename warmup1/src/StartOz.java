public class StartOz {

    public static String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result += str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result += str.charAt(1);
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(startOz("ozymandias"));
        System.out.println(startOz("bzoo"));
        System.out.println(startOz("oxx"));
        System.out.println(startOz("abc"));
        System.out.println(startOz("o"));
        System.out.println(startOz("z"));
    }
}
