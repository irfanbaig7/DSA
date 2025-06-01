import java.util.Arrays;

public class LeetNo75 {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColor(arr);

        // Print the Answer**

        // for (int i : arr) {
        //     System.out.print(i + " ");
        // }
        System.out.println(Arrays.toString(arr));

    }

    public static void sortColor(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        int index = 0;
        while (index <= end) {
           if (nums[index] == 0) {
            swap(nums, index, start);
            index++;
            start++;
           } 
           else if (nums[index] == 2) {
            swap(nums, index, end);
            end--;
           }
           else {
            index++;
           }
        }
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
