public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }
    
    static int singleNumber(int[] arr){
        int xor = 0;
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            xor = xor^arr[i];
        }
        return xor;
    }
}
