import java.util.Arrays;

public class SwapValue {

    // Creating a function for passing PROCESS for Swaping Values

    static void swap(int[] arr, int index1, int index2) {
        int teamp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = teamp;
    }

    public static void main(String[] args) {

        // Swaping Values into Array

        int[] arr = { 10, 20, 47, 83, 89 };
        System.out.println(Arrays.toString(arr));
        swap(arr, 0, 4);
        System.out.println(Arrays.toString(arr));

    }

}
