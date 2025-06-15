public class Q2SkipString {
    public static void main(String[] args) {
        // System.out.println(skipApple("irfanapplebaig"));
        System.out.println(skipAppNotapple("irfanapplbaig"));
    }

    static String skipApple(String unProcess){
        if (unProcess.isEmpty()) {
            return "";
        }

        if (unProcess.startsWith("apple")) {
            return skipApple(unProcess.substring(5));
        } else {
            return unProcess.charAt(0) + skipApple(unProcess.substring(1));
        }
    }   
    static String skipAppNotapple(String unProcess){
        if (unProcess.isEmpty()) {
            return "";
        }

        if (unProcess.startsWith("app") && !unProcess.startsWith("apple")) {
            return skipAppNotapple(unProcess.substring(3));
        } else {
            return unProcess.charAt(0) + skipAppNotapple(unProcess.substring(1));
        }
    }   
}
