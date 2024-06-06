//
package ArrayOperations.Rotation;

import java.util.Arrays;

public class TempArray {
    public static void tempArrayMethod(int[] a, int n, int d){
        int j = 0; // traverse in temp array
        int[] temp = new int[n];
        for(int i = d; i < n ; i++){
            //Remaining elements of original array will be copied to temp array
            temp[j] = a[i];
            j++;
        }
        for(int i = 0; i < d; i++){ // 0,1,3
            //Elements to be rotated will be copied to temp array
            temp[j] = a[i];
            j++;
        }
        for(int i=0; i< n; i++){
            //WHole temp array will be copied to original array
            a[i] = temp[i];
        }
        System.out.println("Rotated array with temp array method is :"+ Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6};
        int n = a.length;
        int d = 3;
        System.out.println("original Array is :"+ Arrays.toString(a));
        System.out.println(" ");
        TempArray.tempArrayMethod(a , n , d);
    }
}


