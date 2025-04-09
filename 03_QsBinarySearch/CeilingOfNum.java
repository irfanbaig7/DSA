
public class CeilingOfNum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 8, 10, 11, 12, 19}; // Acending
        // int[] arr = { 19, 12, 11, 10, 8, 2, 1 }; // Dcending
        int target = -1;
        System.out.println("Ceiling of " + target + " is index No : " + findCeiling(arr, target));
    }

    static int findCeiling(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        if (target <= arr[start]) { // Acending
        return -1;
        }

        // if (target <= arr[end]) { // Dcending
        //     return -1;
        // }

        boolean isAccending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) { // Acending
            return mid - 1;
            }

            // if (target == arr[mid]) { // Dcending
            //     return mid + 1;
            // }

            if (isAccending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return end; // Acending
        // return start; // Dcending
    }
}
