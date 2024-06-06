package Recursion;

public class Rec2 {
    public static void message(int n){
        if (n==10) return;
        System.out.println("hello");
        message(n+1);
    }

    public static void main(String[] args) {
        message(1);
    }
}
