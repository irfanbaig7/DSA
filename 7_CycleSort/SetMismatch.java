// import java.util.Arrays;

import java.util.Arrays;

public class SetMismatch {

    public static void main(String[] args) {
        // int[] arr = {5, 2, 3, 1, 4 };
        int[] arr = { 1, 2, 2, 4 }; // correct idx will be
        // cycleSort(arr);
        // System.out.println(Arrays.toString(arr));
        int[] result = cycleSort(arr);
        System.out.println(Arrays.toString(result)); 
    }

    static int[] cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int coorrectIndex = arr[i] - 1;
            if (arr[i] != arr[coorrectIndex]) {
                swap(arr, i, coorrectIndex);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return new int[] {arr[j], j + 1};
            }

        }
        return new int[] {-1, -1};

    }

    static void swap(int[] arr, int i, int coorrectIndex) {
        int teamp = arr[i];
        arr[i] = arr[coorrectIndex];
        arr[coorrectIndex] = teamp;
    }

}