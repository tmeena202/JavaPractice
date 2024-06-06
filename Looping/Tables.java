package Looping;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        System.out.println("Program to Display Tables ");
        System.out.print("Which Number table to display : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.printf("%n%d * %d = " + n*i, n , i);
        }
    }
}
