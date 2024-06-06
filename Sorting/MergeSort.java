package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] a1 = mergeSort(arr);
        System.out.println(Arrays.toString(a1));
    }
    public static int[] mergeSort(int[]  a){
        if(a.length == 1)
            return a;

        int mid = a.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(a, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(a, mid, a.length));

        return merge(left, right);
    }
    public static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length){
            if( first[i] < second[j]){
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        //
        while ( i< first.length){
            mix[k] =first[i];
            i++;
            k++;
        }
        while ( j < first.length){
            mix[k] =first[j];
            j++;
            k++;
        }
        return mix;
    }
}
