public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,1,4,2,5};
        System.out.println(isSorted(arr));
        
    }

    static boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}