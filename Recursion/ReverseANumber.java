package Recursion;

public class ReverseANumber {
    // returning void
    public static void reverse(int n){
        if (n<=9){
            System.out.print(n + " ");
            return;
        }
        System.out.print(n % 10);
        reverse(n/10);
    }
    // returning void
    static int sum = 0;
    public static void reverse1(int n){
        if (n==0)
            return;
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse1(n/10);
    }

    public static boolean palindrome(int n){
        return true;
    }

    public static void main(String[] args) {

    }
}
