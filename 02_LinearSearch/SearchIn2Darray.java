import java.util.Arrays;

public class SearchIn2Darray {

    static int[] search2dArray(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };

                }
            }
        }
        return new int[] { -1, -1 };

    }

    public static void main(String[] args) {

        int[][] arr = {
                { 75, 55, 85, 25, 88 },
                { 12, 38, 69, 64 },
                { 68, 76 },
                { 82, 43, 24, 78 }
        };
        int target = 64;
        int[] ans = search2dArray(arr, target); // format like this return value (row, col)

        System.out.println(Arrays.toString(ans));

    }

}
