public class Qs1_FibonacciNum {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }

    static int fibo(int n) {

        // base Condition
        if (n < 2) {
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);

    }
}
