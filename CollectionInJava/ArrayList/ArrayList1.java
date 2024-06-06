package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList1 {
    public static void main(String[] args) {
        int n = 5;
        // ArrayList is dynamic Array
        ArrayList<Integer> A = new ArrayList<>(n);
        ArrayList arr = new ArrayList(A);

        System.out.println("Elements inside arraylist : " + A);

        Scanner s = new Scanner(System.in);
        System.out.print("Enter  element is Arraylist : ");
        for (int i=0; i < 10; i++  ){
            int input = s.nextInt();
            A.add(input);
        }
        System.out.println("Elements inside arraylist after add Method: " + A);


    }
}
