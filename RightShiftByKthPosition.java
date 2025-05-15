public class RightShiftByKthPosition {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        int temp[] = new int[k];


        for (int i = 0; i < k; i++) {
            temp[i] = nums[i + k + 1];
        }

        // for (int tem : temp) {
        //     System.out.print(tem + " ");
        // }
        rightShiftByKthPlace(nums, k);

        for (int i = 0 ; i < k; i++) {
            nums[i] = temp[i];
        }

        for(int num: nums){
            System.out.print(num + " ");
        }

    }

    static void rightShiftByKthPlace(int[] nums, int k) {
        k = k % nums.length;
        int n = nums.length;
        for (int i = 0; i < k; i++) {
            nums[i + k] = nums[i];
        }
    };

}
