import java.util.*;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr = { 0, 1 };
        missingNumber(arr);
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int i = 0;

        while (i < n) {
            if (arr[i] != i) {
                return i;
            }
            i++;
        }
        return n;
    }
}
