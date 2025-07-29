public class MixStart {

    public static boolean mixStart(String str) {
        if (str.length() < 3) return false;

        String two = str.substring(1, 3);
        return two.equals("ix");
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(mixStart("mix snacks"));  // true
        System.out.println(mixStart("pix snacks"));  // true
        System.out.println(mixStart("piz snacks"));  // false
        System.out.println(mixStart("mi"));          // false
        System.out.println(mixStart(""));            // false
    }
}

