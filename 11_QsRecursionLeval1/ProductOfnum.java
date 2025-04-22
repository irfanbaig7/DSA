public class ProductOfnum {
    public static void main(String[] args) {
        System.out.println(productOFnum(5));
    }
    static int productOFnum(int n){
        if (n <= 1) {
            return 1;
        }
        return n * productOFnum(n-1);
    }
}
