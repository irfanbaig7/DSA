// public class Numbers {
//     public static void main(String[] args) {
//         printNum(1);
//     }

//     static void printNum(int n){
//         System.out.println(n);
//         printNum2(2);
//     }
//     static void printNum2(int n){
//         System.out.println(n);
//         printNum3(3);
//     }
//     static void printNum3(int n){
//         System.out.println(n);
//         printNum4(4);
//     }
//     static void printNum4(int n){
//         System.out.println(n);
//         printNum5(5);
//     }
//     static void printNum5(int n){
//         System.out.println(n);
//     }

// }

// Recursion ? call the function It-self

public class RecursionImpliment {
    public static void main(String[] args) {
        printNum(1);
    }

    static void printNum(int n) {

        if (n == 5) { // based condition
            System.out.println(n);
            return;
        }
        System.out.println(n); // body
        printNum(n + 1); // recursive

    }
    
    
}