public class ProductOFdigits {
    public static void main(String[] args) {
        System.out.println(proudctOFdigits(1342));

    }
    static int proudctOFdigits(int n){
        if (n%10 == n) {
            return n;
        }
        return (n%10) * proudctOFdigits(n/10);
    }
}
