package NestedLoop;

import java.util.Scanner;

public class Star3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no of line to print pattern : ");
        int n = s.nextInt();

        // outer loop for row
        for (int i=1; i <= n;i++){
            //inner loop for column
            for (int j =1; j<=i; j++){
                //statement
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
