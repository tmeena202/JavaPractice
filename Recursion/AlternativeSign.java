package Recursion;

public class AlternativeSign {

    public static int naturalSign(int n){
        if (n==1)
            return 1;

        if ( n%2==0 ){
            return naturalSign(n-1) - n;

        }
        return naturalSign(n - 1) + n;
    }

    public static void main(String[] args) {
        System.out.println(naturalSign(5));
    }
}
