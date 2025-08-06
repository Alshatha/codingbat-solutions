public class Has271 {

    public static boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int val = nums[i];
            if (nums[i + 1] == val + 5 &&
                    Math.abs(nums[i + 2] - (val - 1)) <= 2) {
                return true;
            }
        }
        // No matching pattern found
        return false;
    }

    public static void main(String[] args) {
        System.out.println(has271(new int[]{1, 2, 7, 1}));
        System.out.println(has271(new int[]{2, 7, 1}));
        System.out.println(has271(new int[]{2, 7, 3}));
        System.out.println(has271(new int[]{4, 9, 3, 5}));
        System.out.println(has271(new int[]{4, 9, 2, 5}));
        System.out.println(has271(new int[]{}));
    }
}
