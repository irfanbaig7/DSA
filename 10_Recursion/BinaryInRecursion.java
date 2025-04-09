public class BinaryInRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 45, 56, 65, 78, 85, 97};
        int target = 65;
        System.out.println(searchINbinary(arr, target, 0, arr.length - 1));
    }

    static int searchINbinary(int[] arr, int target, int start, int end){
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (target > arr[mid]) {
            return searchINbinary(arr, target, mid + 1, end);
        } 
        return searchINbinary(arr, target, start, mid - 1);
    }

}
