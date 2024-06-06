package Recursion2;

public class RecursionOnArray {
    public static boolean arraySortedOrNot(int[] a, int i, int n){
        if(i == n-1)
            return true;

        return a[i]<a[i+1] && arraySortedOrNot(a, i+1, n);
    }

    public static int linerSearchRec(int[] a, int target, int i){
        if(i == a.length){
            System.out.println("No element is found");
            return -1;
        }
        if(a[i] == target){
            return i;
        }
        else
            return linerSearchRec(a,target,i+1);
    }

    public static void main(String[] args) {
        int t = 35;
        int[] arr = {500, 10, 15, 20, 35};
//        System.out.println(arraySortedOrNot(arr, 0, arr.length));
        System.out.println(linerSearchRec(arr, t, 0));
    }
}
