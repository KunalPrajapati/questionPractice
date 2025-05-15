import java.util.*;

public class Union {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,7};
        
        unionOfArrays(arr1, arr2);
    }
    
    static void unionOfArrays(int[] arr1, int[] arr2) {
        Set<Integer> U = new HashSet<>();
        
        for (int i = 0; i < arr1.length; i++) {
            U.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            U.add(arr2[i]);
        }
        
        for (int val : U) {
            System.out.print(val + " ");
        }
    }
}
