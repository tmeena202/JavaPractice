package Recursion;

public class ArrayRec {
    public static void printArray(int[] arr, int i){
        //base condition
        if(i == arr.length){
            return;
        }
        System.out.print(arr[i] + " ");
        printArray(arr, i+1);
    }

    //Max value in array [void type]
    static int max = 0;
    public static void maxValue(int[] arr, int i){
        if(i == arr.length){
            return;
        }
        if(arr[i] > max){
            max = arr[i];
        }
        maxValue(arr,i+1);
    }

    //maxvalue in array type int
    static int max2 = 0;
    public static int maxValue2(int[] arr, int i){
        if(i == arr.length){
            return max2;
        }
        if(arr[i] > max2){
            max2 = arr[i];
        }
        return maxValue2(arr,i+1);
    }

    //
    public static int maxValue3(int[] arr, int i){
        if(i == arr.length-1){
            return arr[i];
        }
        int ans = Math.max(arr[i],maxValue3(arr,i+1));
        return ans;
    }

    //sum of array
    public static int sumArray(int[] arr, int i){
        if (i==arr.length-1)
            return arr[i];
        return arr[i] + sumArray(arr,i+1);
    }

    public static void main(String[] args) {
        int[] array = {10,20,30,40,100};
//        printArray(array,0);
//        maxValue(array,0);
//        System.out.println(max);
//        System.out.println(maxValue2(array,0));
//        System.out.println(maxValue3(array,0));
        System.out.println(sumArray(array,0));
    }
}
