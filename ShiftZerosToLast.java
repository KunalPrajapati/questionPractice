import java.util.Arrays;

public class ShiftZerosToLast {
    public static void main(String[] args) {
        int[] arr = { 1,0,2,3,2,0,0,4,5,1 };
        shiftZerosToLast(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void shiftZerosToLast(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = 0;

        while (i < n) {
            if (arr[i] != 0) {
                // Swap arr[i] with arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
    }
}
