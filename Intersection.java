import java.util.*;

public class Intersection {

    public static void main(String[] args) {
        int[] arr1 = {1,2,2,3,3,4,5,6};
        int[] arr2 = {2,3,3,5,6,6,7};
        
        intersection(arr1, arr2);
        
    }
    
    static void intersection(int[] arr1, int[] arr2){
        
        // int Intersection = new int[];
        ArrayList<Integer> Intersect = new ArrayList<>();
        
        int j = 0;
        int i = 0;
        
        while(i < arr1.length){
            
            if(arr1[i] == arr2[j]){
                Intersect.add(arr1[i]);
                i++;
                j++;
            }
            else {i++;}
        }
        
        for(int intersect: Intersect){
            System.out.println(intersect + "");
        }
    }
}