package Recursion;

public class MultipleUsingRec {
    public static void multiple(int num, int k){
        //base condition
        if ( k == 0 )
            return;

        multiple(num, k-1);
        System.out.print(num * k + " ");
    }

    //
    public static int multiple1(int num, int k){
        //base condition
        if ( k == 0 )
            return 0;
        multiple1(num ,k-1);
        int ans = num * k;
        System.out.print(ans + " ");
        return ans;
    }

    public static void main(String[] args) {
        multiple(5,10);
        System.out.println();
        multiple1(10, 5);
    }
}
