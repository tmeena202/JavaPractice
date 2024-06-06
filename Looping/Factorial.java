package Looping;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to find factorial :");
        int n = s.nextInt();
        int fact = 1;
        for (int i= 1; i<=n; i++){
            fact = fact * i;
        }
        System.out.printf("Factorial of %d is "+ fact, n);
    }
}
