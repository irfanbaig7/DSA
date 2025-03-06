import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        
        int[] arr = {10, 25, 35, 50, 40, 5};
        selection(arr);
        System.out.println(Arrays.toString(arr ));

    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // Find the maximum in the Remaning array and swap with correct INdex.
            int last = arr.length - i - 1; 
            int max = maxyii(arr, 0, last);

            swapArray(arr, max, last);
        }
    }


    public static int maxyii(int[] arr, int start, int end){
        int max = start;
        for (int i = 1; i < arr.length; i++) {
            if (arr[max] > arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swapArray(int[] arr, int first, int second){
        int teamp = arr[first];
        arr[first] = arr[second];
        arr[second] = teamp;
    }


}
