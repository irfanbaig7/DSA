public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);

        // if u dont find a pivot it means the array is not rotated!
        if (pivot == -1) {
            // just do normal binary search.
            return binarySearch(arr, target, 0, arr.length - 1);

        }

        // if pivot found u have pass to accending sorted arrays
        if (arr[pivot] == target) {
            return pivot;
        }

        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }
        return binarySearch(arr, target, pivot + 1, arr.length - 1);

    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        // int start = 0;
        // int end = arr.length - 1;

        while (start <= end) {
            // find the midile element
            int mid = start + (end - start) / 2; // is a better approache

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }

        return -1;

    };



    // This well not working on duplicate value 

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }


    static int findPivotWithDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }


            // if element at middle, start, end are equal then skip the duplicate

            // if (arr[]) {
                
            // }

        }
        return -1;
    }

}
