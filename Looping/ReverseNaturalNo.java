package Looping;

import java.util.Scanner;

// 2. Write a program to print all natural numbers in reverse
public class ReverseNaturalNo {
    public static void main(String[] args) {
        System.out.println("program to print Natural no in Reverse Order");
        System.out.print("Enter the ending point : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println("Natural Number in reverse order is : ");
        for(int i = n; i >= 1; i--){
            System.out.print(i + " ");
        }
    }
}
