
public class FloorOfNum {

    public static void main(String[] args) {
        // Floor of given number.
        int[] arr = { 1, 2, 8, 10, 11, 12, 19 }; // Accending
        // int[] arr = { 19, 12, 11, 10, 8, 2, 1 }; // deccending
        int target = 5;
        System.out.println("Flooring of " + target + " is index No : " + findFloor(arr, target));


    }

    static int findFloor(int[] arr, int target) {
        
        int start = 0;
        int end = arr.length - 1;


        if (target >= arr[end]) { // for Accending
            return -1; // Invalid case
        }

        // if (target >= arr[start]) { // for deccending
        // return -1; // Invalid case
        // }


        boolean isAccending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) { // for Acending
                return mid + 1;
            }

            // if (target == arr[mid]) { // for decending
            // return mid - 1;
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

        return start; // for acending

        // return end; // for decending

    }
}
