

public class FindMin {


    static int findMinimum(int[] arr){
        if (arr.length == 0) {
            return -1;
        }

        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }    
        }
        return minValue;
    }
    
    public static void main(String[] args) {
        
        int[] nums = { 23, 45, 1, 2, 8, 19, -3, 16, -1, 28 };
        System.out.println(findMinimum(nums));

    }
}
