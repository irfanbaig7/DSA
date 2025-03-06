import java.util.Arrays;

public class BubbleSorting {

    public static void main(String[] args) {

        int[] arr = { 3, 1, 5, 2, 4};
        // int[] arr = { 5, 4, 3, 2, 1 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {

        boolean swaped;

        // run the steps N - 1 Timess
        for (int i = 0; i < arr.length; i++) {

            swaped = false;

            // for Each Step, Max item will come at the Last respective Index
            for (int j = 1; j < arr.length - i; j++) {
                // Swap the item are smaller than the Privious Item
                if (arr[j] < arr[j - 1]) {
                    // Swap
                    int teamp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = teamp;
                    swaped = true;
                }

            }

            // if u did not swap for a particular value of i, it means arrya was sorted
            // hence stop the program
            if (!swaped) {
                break;
            }
        }

    }

}


// import java.util.Arrays;

// public class BubbleSorting {

//     public static void main(String[] args) {
//         int[] arr = { 5, 3, 8, 4, 2 };
//         bubbleSort(arr);
//         System.out.println(Arrays.toString(arr));

//     }

//     static void bubbleSort(int[] arr){
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 1; j < arr.length - i; j++) {
//                 if (arr[j] < arr[j - 1]) {
//                     int teamp = arr[j];
//                     arr[j] = arr[j - 1];
//                     arr[j - 1] = teamp;
//                 }
//             }
//         }
        
//     }
// }
