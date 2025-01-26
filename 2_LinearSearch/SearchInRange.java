
// some particular's Range we like 0 to 4 then check our value are exists our Not



public class SearchInRange {


    static int rangeSearch(int[] arr, int start, int end, int target){
        if (arr.length == 0) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;


    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 79, 85, -63, 15, -42, 5, 9, 78};
        int target = 85;
        // System.out.println("Founded the Value : " + rangeSearch(arr, start, end, target));
        System.out.println("Founded the Value with Index : " + rangeSearch(arr, 1, 4, target));
        
        
    }
}