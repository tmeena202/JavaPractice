package Recursion;

public class ArraySortUsingRec {
    public static boolean sortRec(int[] arr , int i){
        if (arr.length-1 == i){
            return true;
        }
        return arr[i]<arr[i+1] && sortRec(arr, i+1);
    }


    public static void main(String[] args) {
        int[] arr = {11,22,3,6,10};
        System.out.println(sortRec(arr,0));
    }
}
