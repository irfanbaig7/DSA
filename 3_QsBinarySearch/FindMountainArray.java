public class FindMountainArray {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 7, 8, 6, 5, 4, 3, 2 };
        int target = 4;
        System.out.println(search(arr, target));

    }

    public static int peakElemen(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // Your are in decreasing part of array.
                // this may be the answer but look at Left.

                end = mid;

            } else {
                // your are an accending part of array
                start = mid + 1;

            }
        }

        // at the end start & end are bothe same so return anyone bcz that are our
        // correct Ans
        return end;

    }

    public static int search(int[] arr, int target) {
        int peak = peakElemen(arr);
        int fristTry = orderAgnosticBS(arr, target, 0, peak);

        if (fristTry != -1) {
            return fristTry;
        }
        // Try to search in scecond half
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);

    }


    static int orderAgnosticBS(int[] arr, int target, int start, int end) {


        // check is it Accending or decending
        boolean isAss = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAss) {
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

        return -1;
    }

}
