package Searching;

public class BinarySearch {
    public  int binarySearch(int[] a , int n, int key){
        int l = 0; int h = n-1;
        while(l <= h){
            int mid = l + (h - l)/2;
            if (a[mid] == key){
                return mid;
            }
            if (a[mid] < key)
                l = mid + 1;

                // If x is smaller, ignore right half
            else
                h = mid - 1;
        }
        return -1;
    }
}

class Main1 {
    public static void main(String[] args) {
        int[] a = {100,200,300, 400,500, 1000, 1111};
        int n = a.length;
        int key = 1000;

        BinarySearch obj = new BinarySearch();
        int result = obj.binarySearch(a, n, key);
        if (result == -1){
            System.out.println("Element is not present in array");
        }
        else
            System.out.println("Element " + key + " is present at index "+ result);
    }
}
