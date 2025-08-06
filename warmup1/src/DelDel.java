public class DelDel {

    public static String delDel(String str) {
        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        }
        return str;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(delDel("adelbc"));
        System.out.println(delDel("adelHello"));
        System.out.println(delDel("abcdel"));
        System.out.println(delDel("a"));
        System.out.println(delDel("del"));
    }
}
