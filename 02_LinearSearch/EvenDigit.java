public class EvenDigit {

    static int findEvenDigi(int[] arr){
        int count = 0;

       for(int num: arr){
        if (even(num)) {
            count++;
        }
       }

        return count;
    }

    // To check Digit's length are even or not
    static boolean even(int num){
        int numberOfdigit = digits(num);
        // if (numberOfdigit % 2 == 0 ) {
        //      return true;
        // }
        // return false;
        return numberOfdigit % 2 == 0;
    }



    // how many digit are there
    static int digits(int num){
        int count = 0;

        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }

        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }


    public static void main(String[] args) {
        

        int[] arr = {12, 345, 2, 6, 7896, 78955, 854631};

        System.out.println(findEvenDigi(arr));
        System.out.println(digits(0));
        System.out.println(digits(-55555));
        


    }
}
