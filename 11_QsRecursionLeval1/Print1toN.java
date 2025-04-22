public class Print1toN {

    public static void main(String[] args) {
        // printOriginal(5);
        oneToN(5);
    }
    static void oneToN(int n){
        if (n == 0) {
            return;            
        }
        oneToN(n - 1);
        System.out.println(n);
    }
    
}