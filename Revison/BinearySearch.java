public class BinearySearch {

    static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
             if (target  == arr[mid]) {
                return  mid;
            }

            if (target < arr[mid]) {
                low = mid + 1;   // this is for deccending
                // high= mid = 1;   // this is for Accending
            } else if (target > arr[mid]) {
                high = mid - 1;  // this is for deccending
                // low = mid + 1;  // this is for Accending
            } else {
                return mid;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        // int[]  arr = { 1, 4, 7, 12, 15, 16, 19, 25, 31 };
        int[] arr = { 8, 7, 6, 5, 4, 3, 2}; 
        // int[] arr = { 12, 30, 13, 45, 25, 78, 4 };
        System.out.println(search(arr, 4));
    }
}
