public class SleepIn {

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        // shortened, clean version
        return !weekday || vacation;
    }

    public static void main(String[] args) {
        // quick manual tests
        System.out.println(sleepIn(false, false)); // true  - weekend, no vacation
        System.out.println(sleepIn(true,  false)); // false - weekday, no vacation
        System.out.println(sleepIn(false, true));  // true  - weekend + vacation
        System.out.println(sleepIn(true,  true));  // true  - weekday but on vacation
    }
}
