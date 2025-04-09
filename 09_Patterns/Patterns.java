
public class Patterns {

    public static void main(String[] args) {
        // pattern_One(5);
        // pattern_Two(5);
        // pattern_Three(5);
        // pattern_Four(5);
        // pattern_five(4);
        pattern_six(4);

    }

    static void pattern_One(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern_Two(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern_Three(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern_Four(int n) {

        // when i will be 0 that time nothing show any * ok just only one new line will
        // be created
        for (int i = 1; i < 2 * n; i++) {

            int totalColInrow = i > n ? 2 * n - i : i;
            int noSpaces = n - totalColInrow;

            for (int j = 0; j < noSpaces; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < totalColInrow; k++) {
                System.out.print("* ");

            }

            System.out.println();

        }

    }

    static void pattern_five(int n) {
        for (int i = 1; i <= n; i++) {

            for (int spaces = 0; spaces < n - i; spaces++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

    }

    static void pattern_six(int n){

        int originalN = n;
        n = 2 * n;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int atEveryIndex = originalN - Math.min(Math.min(i, j), Math.min(n - i, n - j));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }

    }

}
