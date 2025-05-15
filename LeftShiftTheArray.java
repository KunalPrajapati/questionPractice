public class LeftShiftTheArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        int temp[] = new int[k];

        // shiftBy1thPlace(arr);

        for(int i = 0; i < k; i++){
            temp[i] = arr[i];
        }

        // for(int tem: temp){
        //     System.out.print(tem + " ");
        // }

        shiftByKthPlace(arr, k);

        for(int i = arr.length - k; i < arr.length; i++){
            arr[i] = temp[i - (arr.length - k)];
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }


    static void shiftByKthPlace(int[] arr, int k){
        k = k % arr.length;
        for(int i = k; i < arr.length; i++){
            arr[i - k] = arr[i];
        }
    }



    static void shiftBy1thPlace(int[] arr){
        int temp = arr[0];
        for(int i =1; i < arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }
}
