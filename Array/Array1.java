package Array;
public class Array1{
    public static void main( String[] args) {
       // int[] ar = new int[10];
        int[] ar; // declare array named ar
        ar = new int[10]; // create the array object
        System.out.printf("%s%8s\n", "index","value" );
        for (int counter =0 ; counter < ar.length; counter++)
            System.out.printf("%5d%8d\n", counter, ar[counter]);
    }
}