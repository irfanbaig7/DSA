public class InfiniteArray {

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;

        }

        return indexReturn(arr, target, start, end);

    }

    static int indexReturn(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

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

    public static void main(String[] args) {

        int[] arr = { -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89, 92, 95 };
        int target = 15;
        System.out.println(ans(arr, target));

    }
}