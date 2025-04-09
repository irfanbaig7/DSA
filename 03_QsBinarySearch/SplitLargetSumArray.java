public class SplitLargetSumArray {
    public static void main(String[] args) {

        int[] nums = { 7, 2, 5, 10, 8 };
        System.out.println(splitArray(nums));

    }

    static int splitArray(int[] nums) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // in the end of loop this will conatain max item in the array that is it.
            end += nums[i]; // totle sum
        }

        // we have both start and end so apply binary search
        while (start < end) {

            // try for the middle as potential ans
            int mid = start + (end - start) / 2;

            // calculate the how many pieces you can divide this in with max sum
            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    // you cannot add this in this subarray, make new One.
                    // say you can add this num into in the subarray then sum = num
                    sum = num;
                    pieces++;
                } else {
                    start += sum;
                }
            }

            if (pieces > mid) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end; // here start == end so if U Anything return

    }

}
