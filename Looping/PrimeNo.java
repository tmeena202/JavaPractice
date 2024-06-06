package Looping;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = s.nextInt();
        int count =0;
        for (int i = 2; i <= num-1; i++)
            if (num % i == 0) {
                count++;
            }

        if (count == 0){
            System.out.println("prime");
        }
        else
            System.out.println("not prime");
    }
}
