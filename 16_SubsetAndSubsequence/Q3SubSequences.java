
// SubSequences use for String
public class Q3SubSequences {
    public static void main(String[] args) {
        subseq("", "abc");
        
    }

    static void subseq(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        // recursive Call here
        subseq(p+ch, up.substring(1));  // take it
        subseq(p, up.substring(1));  // ignore it

    }
}
