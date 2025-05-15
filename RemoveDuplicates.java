import java.util.Set;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 5, 6, 6, 9, 8 , 6 , 7, 7 };

        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        System.out.println(set);
    }
}
