public class LoneTeen {

    public static boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);

        return (aTeen && !bTeen) || (!aTeen && bTeen);
        // or use: return aTeen ^ bTeen;  // XOR operator
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(loneTeen(13, 99));  // true
        System.out.println(loneTeen(21, 19));  // true
        System.out.println(loneTeen(13, 13));  // false
        System.out.println(loneTeen(14, 20));  // true
        System.out.println(loneTeen(20, 22));  // false
    }
}
