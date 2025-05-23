import java.util.Arrays;

public class MergeSorting {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr){
        if (arr.length == 1) {
            return arr;
        }
        
        int mid = arr.length / 2;
        
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        
        return merge(left, right);
    }

    private static int[] merge(int[] frist, int[] second){
        int[] mix = new int[frist.length + second.length];

        int i = 0, j = 0, k = 0;
        while (i < frist.length && j < second.length) {
            if (frist[i] < second[j]) {
                mix[k] = frist[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;

        }

        // it may be possibale that one of the arrays is not complete
        while (i < frist.length) {
            mix[k] = frist[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix; 

    }

}