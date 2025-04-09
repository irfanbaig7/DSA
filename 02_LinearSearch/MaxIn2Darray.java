public class MaxIn2Darray {


    static int maxiValue(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[][] arr = {
            {500, 86, 93},
            {20, 255, 30},
            {2, 8, 6},
            {45, 10},
            {37, 89, 5, 2, 77, 7}
        };
        System.out.println("Mximum Value in our 2D Array was : " + maxiValue(arr));

    }
}
