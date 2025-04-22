public class SortedArray {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 6, 8, 9 };
        int index = 0;
        System.out.println(checkSorted(arr, index));
    }


    // Return ture or false
    static boolean checkSorted(int[] arr, int index) {
        if (arr[index] == arr.length) {
            return true;
        }
        return arr[index] < arr[index + 1] && checkSorted(arr, index + 1);
    }

}
