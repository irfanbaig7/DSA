

public class sample {
    static int findingWithAscending(int[] arr, int target){


        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
            
        }
        return -1;
    };

    static int findingWithDescending(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            
            // int[] arr = {9, 8, 7, 6, 5, 4};
            if (target < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
                end = mid - 1;                 
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        // Accending order
        int[] arr1 = {4, 5, 6, 7, 8, 9};
        int target1 = 7;

        // desendding order
        int[] arr = {9, 8, 7, 6, 5, 4};
        int target = 8;
        
        System.out.println(findingWithAscending(arr1, target1));
        System.out.println(findingWithDescending(arr, target));

        

    }
}
