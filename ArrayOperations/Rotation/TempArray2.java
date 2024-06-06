package ArrayOperations.Rotation;

import java.util.Arrays;

public class TempArray2 {
    static void tempArrayRotation(int[] a, int n , int d){
        // temporary array t
        int[] t = new int[n];
        //keep track of index of t array
        int k =0;

        // copy values of original array element in temp array
        // d=3 n-1=6   index = 3,4,5,6
        for (int i = d; i<n ;i++ ){
            t[k] = a[i];
            k++;
        }

        for (int i = 0; i<d; i++){
            // k = 4
            t[k] = a[i];
            k++;
        }

        for (int i =0; i<n ; i++){
            a[i] = t[i];
        }
    }
    static void display2(int[] a){
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] a = {11,12,13,14,15,16,17};
        int n = a.length;
        int d = 3;

        System.out.println("Array before rotation ");
        display2(a);

        System.out.println("Array after rotation using temp array method ");
        tempArrayRotation(a,n,d);
        display2(a);
    }
}

