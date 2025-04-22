public class Palindrome {

    // My simple Try
    static boolean palindromeFinding(int n){
        int original = n;
        int reversed = 0;
        while (n > 0) {
            int rem = n % 10;
            reversed = reversed * 10 + rem;
            n = n / 10;
        }
    
        return original == reversed;
    
    }

    // With using recursive Method 

    static int rev(int n) {

        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }

    static boolean palin(int n){
        return n == rev(n);
    }

    public static void main(String[] args) {
        System.out.println(palin(121));
    
    }

}

