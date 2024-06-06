package Recursion;

import java.util.Scanner;

public class GCD {
    static int min = 0;
    public static void gcd(int n1, int n2){
        if ( n1 < n2 )
            min = n1;
        else
            min = n2;
        for (int i=min; min>0; i--){
            if ( n1%i==0 && n2%i==0 ){
                System.out.println("Common Divisor is :" + i);
                return;
            }
        }
        System.out.println("no common divisor");
    }

    //
    public static int iGCD(int x, int y){
        while ( x % y != 0 ) {
            int rem = y % x;
            x = y;
            y = rem;
        }
        return y;
    }

    public static int gcd2(int x, int y){
        if(y == 0){
            return x;
        }
        return gcd2(y,x%y);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number :");
        int x = s.nextInt();
        System.out.println("Enter Second Number :");
        int y = s.nextInt();
//        gcd(n1,n2);
        System.out.println(iGCD(x,y));
        System.out.println(gcd2(x,y));
    }
}
