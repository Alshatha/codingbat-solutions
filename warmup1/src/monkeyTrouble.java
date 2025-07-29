public class monkeyTrouble {

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        // You can use the clean one-liner if you like:
        return aSmile == bSmile;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(monkeyTrouble(true, true));
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble(true, false));
        System.out.println(monkeyTrouble(false, true));
    }
}
