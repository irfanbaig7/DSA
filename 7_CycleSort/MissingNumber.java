// import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        // int[] arr = {5, 2, 3, 1, 4 };
        int[] arr = { 4, 0, 2, 1 }; // correct idx will be
        // cycleSort(arr);
        // System.out.println(Arrays.toString(arr));
        System.out.println(cycleSort(arr));
    }

    static int cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int coorrectIndex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[coorrectIndex]) {
                swap(arr, i, coorrectIndex);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }

        }
        return arr.length;

    }

    static void swap(int[] arr, int i, int coorrectIndex) {
        int teamp = arr[i];
        arr[i] = arr[coorrectIndex];
        arr[coorrectIndex] = teamp;
    }

}