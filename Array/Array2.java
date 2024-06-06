// program to declare a array and initialize

package Array;

public class Array2 {
    public static void main(String[] args) {
        //declaring array
        int[] ar ;
        ar = new int[4];

        ar[0] = 1;
        ar[1] = 2;
        ar[2] = 3;
        ar[3] = 4;

        for (int i = 0; i < ar.length; i++){
            System.out.printf("%nThe value of array at index %d is %d", i, ar[i]);
        }
    }

}
