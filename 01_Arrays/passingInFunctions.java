import java.util.Arrays;

public class passingInFunctions {

    static void change(int[] arr) {
        arr[0] = 800;
    }

    public static void main(String[] args) {

        // Array Passing as a Functions

        int[] nums = { 3, 4, 45, 12 };
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums)); // now changes is here

    }
}
