public class BinearySearch {

    // return the index
    // return -1 if does not exist
    static int indexReturn(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the midile element
            int mid = start + (end - start) / 2; // is a better approache

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

        // Yout Know that ur array was Sorted means that was are desinding order or assending order and in this example we have asending order
        int[] arr = { -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 500;
        System.out.println(indexReturn(arr, target));
    

    }
}



// What if u dont Know ur array was Sorted Or not??

