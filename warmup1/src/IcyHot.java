public class IcyHot {

    public static boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        } else {
            return false;
        }
        // return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(icyHot(-1, 101));
        System.out.println(icyHot(120, -5));
        System.out.println(icyHot(2, 120));
        System.out.println(icyHot(-10, 80));
        System.out.println(icyHot(0, 100));
    }
}
