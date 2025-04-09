public class MountianArray {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 7, 8, 6, 5, 4, 3, 2 };
        System.out.println(findingmountain(arr));

    }

    public static int findingmountain(int[] arr) {
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

}
