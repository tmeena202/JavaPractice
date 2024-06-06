package ArrayOperations.UnsortedArray;

import java.util.Arrays;

public class InsertionAtAnyPosition {
    static void insertionAtPosition(int[] a, int n, int x, int capacity, int position){
        for(int i= n-1; i >= position; i--){
            a[i+1] = a[i];
        }
        a[position] = x;
        n = n+1;
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        a[0]=11;
        a[1]=12;
        a[2]=13;
        a[3]=14;
        a[4]=15;

        int n = 5;
        int capacity = a.length;
        int x = 16;
        int position = 3;

        System.out.print("Original Array : ");
        System.out.println(Arrays.toString(a));

        insertionAtPosition(a, n , x, capacity, position);
        System.out.printf("Array after insertion at %d index: ",position );
        System.out.println(Arrays.toString(a));

    }
}
