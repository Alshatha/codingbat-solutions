public class ArrayFront9 {

    public static boolean arrayFront9(int[] nums) {
        int end = nums.length;
        if (end > 4) end = 4;

        for (int i = 0; i < end; i++) {
            if (nums[i] == 9) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(arrayFront9(new int[]{1, 2, 9, 3, 4}));
        System.out.println(arrayFront9(new int[]{1, 2, 3, 4, 9}));
        System.out.println(arrayFront9(new int[]{1, 2, 3, 4, 5}));
        System.out.println(arrayFront9(new int[]{9, 2, 3}));
        System.out.println(arrayFront9(new int[]{}));
    }
}
