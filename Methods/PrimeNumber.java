package Methods;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number to check if prime or not :");
        int n = scanner.nextInt();

        for(int i=2; i<n-1; i++){
            if(n % i == 0){
                count++;
            }
        }
        if( count == 0){
            System.out.printf("%d is a prime number ",n);
        }
        else
            System.out.printf("%d is not a prime number",n);
    }
}
