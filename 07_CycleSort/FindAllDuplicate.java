
// LeetCode Question NO. 442 

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicate {

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
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }


        List<Integer> dupliNums = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] !=  j + 1) {
                dupliNums.add(arr[j]);
            }

        }
        return dupliNums;

    }

    static void swap(int[] arr, int i, int correct) {
        int teamp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = teamp;
    }

}