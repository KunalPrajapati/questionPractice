class SecondLargest {
    public static void main(String args[]) {
        int[] arr = { 5, 6, 7, 9, 2, 4, 5 };

        System.out.println(secondLargestFromArray(arr));
    }

    static int secondLargestFromArray(int[] arr) {
        int largest = arr[0];
        int sLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                sLargest = largest;
                largest = arr[i];
            }
        }
        return sLargest;

    }

}