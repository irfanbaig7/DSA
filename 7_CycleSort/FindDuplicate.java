

public class FindDuplicate {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 3, 6 };
        System.out.println(cycleSort(arr));;

    }

    static int cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            // Actual Co de was Here
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }

        }

        return -1;

    }

    static void swap(int[] arr, int i, int correct) {
        int teamp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = teamp;
    }
}
