package Looping;

import java.util.Scanner;

public class ReverseTable {
    public static void main(String[] args) {
        System.out.println("Program to Display Reverse Tables ");
        System.out.print("Which Number table to display : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 10 ; i >= 1; i--){
            System.out.printf("%n%d * %d = " + n*i, n , i);
        }
    }
}
