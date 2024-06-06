//Program to find the sum of elements of array
package Array;
public class SumArray{
    public static void main(String[]args){
        int[] array = { 1,2,3,4,5,6,7,8,9};
        int total = 0;

        for (int counter=0; counter < array.length; counter++){
            total = total + array[counter];
        }
        System.out.println("Sum of array = " + total);
    }
}