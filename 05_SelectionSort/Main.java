public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        
    }

    static void selectionSort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            if (minIdx != 1) {
                int teamp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = teamp;
            }
        }

    }
}
