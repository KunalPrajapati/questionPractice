import java.util.*;

public class ChocolateDistribution {
    public static void main(String[] args) {
        
        int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5;
        distributeChocolates(arr, m);
    }
    
    static int distributeChocolates(int[] arr, int m){
        int n = arr.length;
        int min_diff = Integer.MAX_VALUE;
        Arrays.sort(arr);
        
        for(int i = 0; i < n - m; i++){
            int diff = arr[i+m-1] - arr[i];
            min_diff = Math.min(min_diff, diff);
        }
        return min_diff;
    }
}
