public class StartHi {

    public static boolean startHi(String str) {
        // Ensure the string is at least 2 characters long
        if (str.length() < 2) return false;

        // Check if the first two characters are "hi"
        String firstTwo = str.substring(0, 2);
        return firstTwo.equals("hi");
    }

    public static void main(String[] args) {

        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("hello"));
        System.out.println(startHi("h"));
        System.out.println(startHi("hiho"));
    }
}
