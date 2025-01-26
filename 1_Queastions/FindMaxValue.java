
public class FindMaxValue {

    // Creating Function For Fid The Maximum Value in Array.

    // public static int max(int[] arr) {
    //     int maxvalue = arr[0];
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] > maxvalue) {
    //             maxvalue = arr[i];
    //         }
    //     }
    //     return maxvalue;
    // }


    // Creating Function For find The Maximum Value in Array but this time range will be Given It.

    // public static int maxRange(int[] arr, int start, int end) {
    //     int maxvalue = arr[start];
    //     for (int i = start; i <= end; i++) {
    //         if (arr[i] > maxvalue) {
    //             maxvalue = arr[i];
    //         }
    //     }
    //     return maxvalue;
    // }



    // Work with edge cases like empty array being null

    public static int maxRange(int[] arr, int start, int end) {

        if (arr == null) {  // if array are null
            return -1;
        }

        int maxvalue = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxvalue) {
                maxvalue = arr[i];
            }
        }
        return maxvalue;
    }




    public static void main(String[] args) {

        int[] arr = { 23, 45, 1, 2, 8, 19, -3, 16, -11, 28 };      //if array are null
        // int[] arr = { 10, 20, 86, 98, 75, 99, 36, 88, 95, 66, 56 };    
        // System.out.println(max(arr));
        System.out.println(maxRange(arr, 2, 8));

    }
}
