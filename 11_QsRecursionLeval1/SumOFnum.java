public class SumOFnum {
    public static void main(String[] args) {
        System.out.println(sumOfNUM(5));
    }
    static int sumOfNUM(int n){
        if (n == 0) {
            return 0;
        }
        return n + sumOfNUM(n-1);
    }
}
