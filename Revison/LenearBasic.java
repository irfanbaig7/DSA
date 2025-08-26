public class LenearBasic {

    static int searchh(int[] arr, int targte) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targte) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 30, 13, 45, 56, 78 };
        System.out.println(searchh(arr, 13));
    }
}