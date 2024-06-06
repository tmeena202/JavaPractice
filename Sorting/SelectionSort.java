package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void Selection(int[] a, int n){
        for (int i = 0; i < n-1; i++){
            int min_idx = i;
            for(int j = i+1; j < n; j++){
                if (a[j] < a[min_idx])
                    min_idx = j;
            }
            int temp = a[min_idx];
            a[min_idx] = a[i];
            a[i] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
class Main{
    public static void main(String[] args) {
        int[] a = {65, 25, 12, 22, 11};
        int n = a.length;
        System.out.print("Before selection sort :");
        System.out.println(Arrays.toString(a));

        System.out.print("After selection sort :");
        SelectionSort.Selection(a, n);
    }
}
