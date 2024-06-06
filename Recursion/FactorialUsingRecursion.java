package Recursion;

public class FactorialUsingRecursion {

    public static int factorial(int n){
        //base condition
        if (n == 1)
            return 1;
        return n * factorial(n-1);

    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
