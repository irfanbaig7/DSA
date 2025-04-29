public class CountEven {

    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 7, 8 };
        int index = 0;
        System.out.println(countEven(arr, index));
    }

    static int countEven(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }

        if (arr[index] % 2 == 0) {

            return 1 + countEven(arr, index + 1);
        } else {
            return countEven(arr, index + 1);
        }

    }
}