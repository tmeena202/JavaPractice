package Searching;

import java.util.Scanner;

public class LinearSearching {
    public static int linearSearch(int[] a, int key){
        int n = a.length;
        for (int index = 0; index < n; index++ ){
            if (a[index] == key){
                return index;
            }
        }
        return -1;
    }
}
class Main{
    public static void main(String[] args) {
        int[] a = {10,200,30,-11,-1,2,7};
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the elements to search in linear search: ");
        int key = s.nextInt();

        int result = LinearSearching.linearSearch(a, key);

        if (result == -1){
            System.out.println(key + " Element is not in Given array");
        }
        else {
            System.out.println(key + " Element is present at index " + result);
        }
    }
}
