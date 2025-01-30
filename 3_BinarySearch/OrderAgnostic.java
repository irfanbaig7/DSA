public class OrderAgnostic {

    public static void main(String[] args) {
        // int[] arr = { -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89 };
        int[] arr = { 89, 45, 22, 18, 16, 15, 4, 3, 2, 0, -4, -12, -18 };
        int target = 22;
        System.out.println(orderAgnosticBS(arr, target));
    }

    static int orderAgnosticBS(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

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