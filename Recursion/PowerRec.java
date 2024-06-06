package Recursion;

public class PowerRec {
    public static int power(int p, int q){
        if (q == 0)
            return 1;
        else
            return power(p , q-1) * p;
    }

    // alternative method
    public static int powerHalf(int p, int q){
        if ( q==0 )
            return 1;

        int smallPower = powerHalf(p , q/2);
        if ( q % 2 == 0 )
            return smallPower * smallPower;
        else
            return p * smallPower * smallPower;
    }

    public static void main(String[] args) {
        System.out.println(power(2,3));
        System.out.println(powerHalf(2,3));
    }
}
