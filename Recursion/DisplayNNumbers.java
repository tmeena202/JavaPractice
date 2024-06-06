package Recursion;

public class DisplayNNumbers {
    public static void display(int n){
        if ( n==1 ) {
            System.out.println("1");
            return;
        }
        System.out.print(n + " ");
        display(--n);
    }

    public static void main(String[] args) {
        display(5);
        display(200);
    }
}
