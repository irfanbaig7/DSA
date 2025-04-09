
import java.util.ArrayList;
import java.util.List;

public class FindAllNumDisappeared {

    public static void main(String[] args) {
        // int[] arr = {5, 2, 3, 1, 4 };
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 }; // correct idx will be
        // cycleSort(arr);
        // System.out.println(Arrays.toString(arr));
        System.out.println(cycleSort(arr));
    }

    static List<Integer> cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int coorrectIndex = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[coorrectIndex]) {
            // if (arr[i] != arr[coorrectIndex]) {
                swap(arr, i, coorrectIndex);
            } else {
                i++;
            }
        }


        List<Integer> misingNumber = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] !=  j + 1) {
                misingNumber.add(j + 1);
            }

        }
        return misingNumber;

    }

    static void swap(int[] arr, int i, int coorrectIndex) {
        int teamp = arr[i];
        arr[i] = arr[coorrectIndex];
        arr[coorrectIndex] = teamp;
    }

}
