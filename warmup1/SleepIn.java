public class SleepIn {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        boolean result1 = sleepIn(false,false);
        System.out.println("Can sleep in? " + result1);
        boolean result2 = sleepIn(true,false);
        System.out.println("Can sleep in? " + result2);
        boolean result3 = sleepIn(true,true);
        System.out.println("Can sleep in? " + result3);



    }
}
