import java.util.Arrays;

public class BubbleSortWithRecursion {
    
    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 2, 3, 1};
        sortwithRecursion(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void sortwithRecursion(int[] arr, int n){
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        sortwithRecursion(arr, n - 1);
    }
}
