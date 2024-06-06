package ArrayOperations.Reverse;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveReverse {
    public static void recursiveReverse(int[] a , int start,int end){
        int temp;
        if (start >= end)
            return;
        temp = a[start];
        a[start] = a[end];
        a[end] = temp;
        recursiveReverse(a, start+1, end-1);
    }
    static void display(int[] a){
        System.out.println(Arrays.toString(a));
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[6];
        int n = a.length;
        int start=0, end = n-1;
        System.out.println("Enter 6 elements in Array");
        for (int i=0; i < n; i++){
            System.out.printf("Enter the %dth elements in array" ,i);
            a[i] = s.nextInt();

        }
        System.out.print("Array before recursive reversing:");
        System.out.println(Arrays.toString(a));

        System.out.print("Array after recursive Reversing :");
        recursiveReverse(a,start,end);
        display(a);
    }
}
