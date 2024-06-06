package Sorting;

import java.util.Arrays;

public class BubbleSort1 {
    public static void bubble(int[] a, int n) {
        for(int i = 0 ; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    // Bubble sort using recursion
    public static int[] bubbleSortRecursion(int[] a, int n){
        //base condition
        if(n==0){
            return a;
        }

        //self work
        int temp=0;
        for(int i=0; i<n-1; i++){
            if(a[i]>a[i+1]){
                temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
        //sub problem
        return bubbleSortRecursion(a,n-1);
    }

    public static void main(String[] args) {
        int[] a = {10, 8 , 5, 3, 1};
        int n = a.length;
//        System.out.print("Array before sorting in ascending oder using bubble sort :");
//        System.out.println(Arrays.toString(a));

//        System.out.print("Array After sorting in ascending oder using bubble sort :");
//        bubble(a, n);
        System.out.println(Arrays.toString(bubbleSortRecursion(a, n)));


    }
}
