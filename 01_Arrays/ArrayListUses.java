
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListUses {
    public static void main(String[] args) {

        // Array List Syntax
        // ArrayList<Integer> list = new ArrayList<>(10);
        // list.add(56);
        // list.add(20);
        // list.add(34);
        // list.add(54);
        // list.add(57);
        // list.add(234);
        // list.add(234);
        // list.add(54);
        // list.add(57);
        // list.add(234);
        // list.add(234);

        // list.contains(54)
        // System.out.println(list.contains(99));

        // System.out.println(list);

        // list.set(0, 99);
        // list.remove(1);

        // System.out.println(list);





        // Input

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        // get item of any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // Pass index here, list[index] syntax will not work Here

        }
        System.out.println();





        
        sc.close();
    }
}
