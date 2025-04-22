public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfdigits(1342));
    }
    static int sumOfdigits(int n){
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumOfdigits(n / 10);
    }
}
