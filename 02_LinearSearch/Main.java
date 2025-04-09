// import javax.swing.text.html.HTMLDocument.BlockElement;

public class Main {

    // L1. Search In the Array return the index if item founded otherewise if item
    // not
    // founded retrun -1
    
    // static int linearSearch(int[] arr, int target) {
    // if (arr.length == 0) {
    // return -1;
    // }
    // for (int i = 0; i < arr.length; i++) {
    // int element = arr[i];
    // if (element == target) {
    // return i;
    // }
    // }
    // return -1; // Faltu kyu check karne ka
    // }



    // L2. return Only Element We dont use index stuff then we can use ForEach Loop

    // static int linearSearch(int[] arr, int target) {
    // if (arr.length == 0) {
    // return -1;
    // }

    // for (int i : arr) {
    // if (i == target) {
    // return i;
    // }
    // }

    // return Integer.MAX_VALUE;
    // }



    // L3. Finding the target and return True or False type Stuff

    static boolean linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        for (int i : arr) {
            if (i == target) {
                return true;
            }
        }

        return false; // Faltu kyu check karne ka
    }

    public static void main(String[] args) {

        int[] nums = { 23, 45, 1, 2, 8, 19, -3, 16, -11, 28 };
        // int[] nums = {};
        int target = 19;
        System.out.println("Founded Element " + linearSearch(nums, target));

    }
}

// Find A particualr NUmber Exsits or not and which indexes they are?
// int[] arr = {10, 20, 3, 5, 45};
// int target = 5;
// for (int i : arr) {
// if (i == target) {
// System.out.println("Founded form this Index : " );
// break;
// }
// }

// for (int i = 0; i < arr.length; i++) {
// if (arr[i] == target) {
// System.out.println("Founded with index num : " + i);
// break;
// }
// }