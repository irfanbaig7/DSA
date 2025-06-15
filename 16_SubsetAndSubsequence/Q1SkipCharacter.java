public class Q1SkipCharacter {

    public static void main(String[] args) {
        skip("", "baccad");
        System.out.println(skip2("baccdhach"));
    }

    static void skip(String process, String unprocess){
        if (unprocess.isEmpty()) {
            System.out.println(process);
            return;
        }

        char ch = unprocess.charAt(0);

        if (ch == 'a') {
            skip(process, unprocess.substring(1));
        } else {
            skip(process + ch, unprocess.substring(1));
        }

    }


    // return S string/ Called in simple Terems In place changes
    static String skip2(String unprocess){
        if (unprocess.isEmpty()) {
            return "";
        }

        char ch = unprocess.charAt(0);

        if (ch == 'a') {
            return skip2(unprocess.substring(1));
        } else {
            return ch + skip2(unprocess.substring(1));
        }

    }
}