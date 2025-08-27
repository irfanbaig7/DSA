public class OrderAgnostic {
    public static void main(String[] args) {

        int[] arr = { 1, 4, 7, 12, 15, 16, 19, 25, 31 };
        // int[] arr = { 8, 7, 6, 5, 4, 3, 2 };
        System.out.println(orderAgnosticBS(arr, 4));

    }

    static int orderAgnosticBS(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        boolean isAcce = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }

            if (isAcce) {
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
