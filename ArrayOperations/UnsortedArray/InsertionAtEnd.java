package ArrayOperations.UnsortedArray;

import java.util.Arrays;

public class InsertionAtEnd {
    static int insertionLast(int[] a , int n , int x, int capacity){
        if (n>= capacity){
            System.out.println("Array is already full!" +
                    " no place to add last element");
            return n;
        }
        a[n] = x;
        n= n+1;
        return n;
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

        System.out.print("Original Array : ");
        System.out.println(Arrays.toString(a));

        insertionLast(a, n , x, capacity);
        System.out.print("Array after insertion at last index: ");
        System.out.println(Arrays.toString(a));

    }
}
