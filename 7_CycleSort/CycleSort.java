import java.util.Arrays;

public class CycleSort {

    public static void main(String[] args) {
        // int[] arr = {5, 2, 3, 1, 4 };
        int[] arr = { 5, 2, 3, 1, 0, 4, 6 }; // correct idx will be
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int coorrectIndex = arr[i] - 1;
            if (arr[i] != arr[coorrectIndex]) {
                swap(arr, i, coorrectIndex);
            } else {
                i++;
            }
        }

    }

    static void swap(int[] arr, int i, int coorrectIndex) {
        int teamp = arr[i];
        arr[i] = arr[coorrectIndex];
        arr[coorrectIndex] = teamp;
    }

}