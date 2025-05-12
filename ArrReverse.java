

public class ArrReverse {
    public static void main(String args[]) {


        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        //two pointer approach
        // reverse(arr, 0, arr.length - 1);

        //single pointer approach
        spreverse(arr, 0, arr.length);
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        
        
    }

//two pointer approach
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

//two pointer approach
    static void reverse(int[] arr, int l, int r) {
        if (l >= r) return;
        swap(arr, l, r);
        reverse(arr, l + 1, r - 1);
    }
    
    
    //single pointer approach
    static void spswap(int[] arr, int i, int n){
       int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
    }
    
    //single pointer approach
    static void spreverse(int[] arr, int i, int n){
        if(i > n/2) return;
        spswap(arr, i, n);
    }
}