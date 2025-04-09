

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 1, 6, 8, 2, 6 };
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int teamp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = teamp;
                }
            }
        }

    }
}
