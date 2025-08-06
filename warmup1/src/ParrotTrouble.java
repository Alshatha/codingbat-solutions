public class ParrotTrouble {

    public static boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(parrotTrouble(true, 6));
        System.out.println(parrotTrouble(true, 7));
        System.out.println(parrotTrouble(false, 6));
        System.out.println(parrotTrouble(true, 21));
        System.out.println(parrotTrouble(false, 22));
    }
}

