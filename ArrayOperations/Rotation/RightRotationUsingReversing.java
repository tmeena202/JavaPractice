package ArrayOperations.Rotation;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotationUsingReversing {
    public static void rightRotate(int[] a , int n , int k){
        k = k % n;
        int temp;

        // reverse last k  elements
        for (int start = n-k, end = n-1; start < end; start++, end--){
            temp = a[start];
            a[start]= a[end];
            a[end] = temp;
        }
        // reverse remaining elements
        for (int start =0, end = n-k-1; start < end; start++, end--){
            temp = a[start];
            a[start]= a[end];
            a[end] = temp;
        }
        //reverse whole array
        for (int start =0, end = n-1; start < end; start++, end--){
            temp = a[start];
            a[start]= a[end];
            a[end] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {10,20,30,40,50,60,70,80};
        int n = a.length;
        System.out.println("Elements before right rotation : ");
        System.out.println(Arrays.toString(a));
        System.out.println();
        Scanner s = new Scanner(System.in);
        System.out.print("Number of times arrays to be right rotated :");
        int k = s.nextInt();

        System.out.println("Elements after the right rotation : ");
        rightRotate(a, n , k);
        System.out.println(Arrays.toString(a));
    }
}
