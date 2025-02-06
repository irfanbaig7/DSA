
public class FloorOfNum {

    public static void main(String[] args) {
        // Floor of given number.
        int[] arr = { 95, 89, 45, 22, 18, 16, 15, 4, 3, 2, 0, -4, -12, -18 };
        int target = -20;
        System.out.println(findFloor(arr, target));

    }

    static int findFloor(int[] arr, int target) {

        if (target < arr[arr.length - 1] || target > arr[0]) {
            return -1; // Invalid case
        }

        int start = 0;
        int end = arr.length - 1;

        boolean isAccending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

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

        return end;

    }
}
