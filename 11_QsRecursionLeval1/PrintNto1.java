public class PrintNto1 {
    public static void main(String[] args) {
        ntoOne(5);
    }
    static void ntoOne(int n){
        if (n == 0) {
            return;
        }
        System.out.println(n);
        ntoOne(n - 1);
    }
}
