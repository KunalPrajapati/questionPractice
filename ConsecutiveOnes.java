public class ConsecutiveOnes {
    public static void main(String[] args) {

        int[] binary = { 1, 1, 0, 1, 1, 1 };
        System.out.println(consecutiveOnes(binary));

    }

    static int consecutiveOnes(int[] nums) {

        int n = nums.length;
        int count = 0;
        int max_count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++;
                max_count = count > max_count ? count : max_count;
            } else {
                count = 0;
            }
        }

        return max_count;

    }
}
