package Looping;
import java.util.Scanner;

//Write a program to print all natural numbers from 1 to n
public class NaturalNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = s.nextInt();

        System.out.println("Here n is :- " + n);
        System.out.printf("Natural Number from 1 to %d is : ",n);

        int sum = 0;
        for (int i = 1; i <= n; i++){
            System.out.printf(i + " ");
            sum = i + sum;
        }
        System.out.println();
        System.out.println(sum);
    }
}
