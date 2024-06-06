package Recursion;

import java.util.ArrayList;

public class LinearSearchUsingRec {

    //
    public static boolean find(int[] arr, int target, int i){
        if (i == arr.length)
            return false;

        return arr[i] == target || find(arr, target,i+1);
    }

    //
    static int ans=0;
    public static int findElement(int[] arr, int target, int i){
        if (i == arr.length)
            return -1;
        if (arr[i] == target){
            return i;
        }
        if ( arr[i] != target ){
            ans = findElement(arr,target,i+1);
        }
        return ans;
    }

    //linearSearch2
    public static int findElement2(int[] arr , int target, int i){
        if (i == arr.length)
            return -1;
        if (arr[i] == target){
            return i;
        }
        else
            return findElement2(arr,target,i+1);
    }

    //findElement from last
    public static int findElementLast(int[] arr, int target, int i){
        if (i == -1)
            return -1;
        if (arr[i] == target){
            return i;
        }
        else
            return findElementLast(arr,target,i-1);
    }

    //
    static ArrayList<Integer> list = new ArrayList<>();
    public static void findAllIndex(int[] arr, int target, int i){
        if (i == arr.length){
            return;
        }
        if (arr[i] == target){
            list.add(i);
        }
        findAllIndex(arr,target,i+1);
    }

    //return arraylist in function argument
    public static ArrayList findAllIndex2(int[] arr, int target, int i, ArrayList<Integer> arrayList){
        if (i == arr.length){
            return arrayList;
        }
        if (arr[i] == target){
            arrayList.add(i);
        }
        return findAllIndex2(arr,target,i+1,arrayList);
    }

    //return arraylist but inside function not in argument
    public static ArrayList<Integer> findAllIndex3(int[] arr, int target, int i){
        ArrayList<Integer> al = new ArrayList<>();
        if (i == arr.length){
            return al;
        }
        if (arr[i] == target){
            al.add(i);
        }
        ArrayList<Integer> ans = findAllIndex3(arr,target,i+1);
        al.addAll(ans);
        return al;
    }

    public static void main(String[] args) {
        int[] arr = {16,96,33,6,96,600};
//        System.out.println(find(arr,600,0));
//        System.out.println(findElement(arr, 600, 0));
//        System.out.println(findElement2(arr, 600,0));
//        System.out.println(findElementLast(arr, 600,1));
//        findAllIndex(arr, 600,0);
//        System.out.println(list);

//        ArrayList<Integer> al100 = new ArrayList<>();
//        System.out.println(findAllIndex2(arr,96,0,al100));
        System.out.println(findAllIndex3(arr,96,0));
    }
}
