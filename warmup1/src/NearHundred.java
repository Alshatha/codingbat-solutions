public class NearHundred {

    public static boolean nearHundred(int n) {
        return (Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(nearHundred(93));
        System.out.println(nearHundred(90));
        System.out.println(nearHundred(89));
        System.out.println(nearHundred(110));
        System.out.println(nearHundred(209));
        System.out.println(nearHundred(250));
    }
}

