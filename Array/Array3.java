package Array;

import java.util.Arrays;

public class Array3 {

    public static void main(String[] args) {
        String[] ar = new String[5];
        ar[0] = "t";
        ar[1] = "t";
        ar[2] = "t";
        ar[3] = "t";
        ar[4] = "t";
        for(int i = 0; i < ar.length ; i++ ){
            ar[i] = "s";
        }
        System.out.println(Arrays.toString(ar));

    }
}
