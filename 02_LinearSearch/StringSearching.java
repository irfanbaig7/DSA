import java.util.Arrays;

public class StringSearching {

    // static boolean search(String str, char ch) {
    //     if (str.length() == 0) {
    //         return false;
    //     }

    //     for (int i = 0; i < str.length(); i++) {
    //         if (ch == str.charAt(i)) {
    //             return true;
    //         }

    //     }

    //     return false;
    // }
    
    static boolean search(String str, char ch) {
        if (str.length() == 0) {
            return false;
        }

        // for (int i = 0; i < str.length(); i++) {
        //     if (ch == str.charAt(i)) {
        //         return true;
        //     }

        // }

        for (char c : str.toCharArray()){
            if (ch == c) {
                return true;
            }
        }

        return false;
    }
    

    public static void main(String[] args) {
        String str = "Irfan";
        System.out.println(str.charAt(0));
        System.out.println(Arrays.toString(str.toCharArray()));
        char target = 'r';
        System.out.println(search(str, target));
    }
}
