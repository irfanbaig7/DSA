
import java.util.Arrays;
import java.util.Scanner;
public class Input {
    
    public static void main(String[] args) {
        
        // Input using Loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Fill the Seats num : ");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));


        // for (int i = 0; i < arr.length; i++) {
        //    arr[i] = sc.nextInt();
        // }
        
        // for (int i : arr) {
        //     System.out.print(i + " ");
        // }

        


        sc.close();

    }
    
}
