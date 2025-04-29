public class FiboAgain {

    public static void main(String[] args) {
        System.out.println(fibo(6));
    }

    static int fibo(int n){
        // base case 
        if (n == 0 || n == 1) {
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }


}
