import java.util.Arrays;

public class ReverseArray {

    // Reverse This Array
    static void reverseArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

    }

    static void swap(int[] arr, int index1, int index2) {
        int teamp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = teamp;
    }

    public static void main(String[] args) {

        int[] arr = { 35, 23, 65, 42, 36, 26, 16, 89 };
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

    }
}
