package ArrayOperations.Reverse;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
     static void reverseArray(int[] a, int n){
        int start ;
        int end;
        int temp;
        for(start = 0, end = n-1; start < end; start++, end-- ){
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
        }
         System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[6];
        int n = a.length;
        System.out.print("Enter the elements in Array : ");
        for (int i=0; i < n; i++){
            a[i] = s.nextInt();
        }
        System.out.print("Array before reversing:");
        System.out.println(Arrays.toString(a));

        System.out.print("Array after Reversing :");
        reverseArray(a, n);
    }
}
