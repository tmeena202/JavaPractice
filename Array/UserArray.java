// Takes input form user and enter it in a array
package Array;
import java.util.Scanner;
import java.util.Arrays;
public class UserArray{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] a = new int[4];
        for (int i=0; i<a.length; i++){
            System.out.printf("Enter the %dth elements in the array: ",i);
            a[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(a)); // used to print array
    }
}