public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 18, 9 };
        int index = 0;
        int target = 1;
        System.out.println(find(arr, target, index));
        System.out.println(findByIndex(arr, target, index));
    }

    // linearSearchInRecursion return true or false

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    // linearSearchInRecursion return true or false
    static int findByIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        } else {
            return findByIndex(arr, target, index + 1);
        }
    }
}
