public class NoTriples {

    public static boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int first = nums[i];
            if (nums[i + 1] == first && nums[i + 2] == first) {
                return false;
            }
        }
        // No triples found
        return true;
    }

    public static void main(String[] args) {
        System.out.println(noTriples(new int[]{1, 1, 2, 2, 1}));
        System.out.println(noTriples(new int[]{1, 1, 2, 2, 2, 1}));
        System.out.println(noTriples(new int[]{1, 1, 1, 2, 2, 2}));
        System.out.println(noTriples(new int[]{1, 2, 3, 4}));
        System.out.println(noTriples(new int[]{}));
    }
}
