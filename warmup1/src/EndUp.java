public class EndUp {

    public static String endUp(String str) {
        if (str.length() <= 3) return str.toUpperCase();

        int cut = str.length() - 3;
        String front = str.substring(0, cut);
        String back = str.substring(cut);

        return front + back.toUpperCase();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(endUp("Hello"));
        System.out.println(endUp("hi there"));
        System.out.println(endUp("hi"));
        System.out.println(endUp("woo hoo"));
        System.out.println(endUp("xyz"));
    }
}
