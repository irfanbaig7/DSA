public class WithOutRecursion {

    public static void main(String[] args) {
        msg();
        
    }
    static void msg(){
        System.out.println("Hello world");
        msg1();
    }
    static void msg1(){
        System.out.println("Hello world");
        msg2();
    }
    static void msg2(){
        System.out.println("Hello world");
        msg3();
    }
    static void msg3(){
        System.out.println("Hello world");
        msg4();
    }
    static void msg4(){
        System.out.println("Hello world");
    }
}