
// Rotating array with one by one Method

package ArrayOperations.Rotation;
import java.util.Arrays;
class OneByOne {
    public static void rotate1(int[] ar, int d, int n) {
        int p = 1;
        while (p <= d){
            int temp = ar[0];
            for (int i = 0; i < n-1 ; i++){
                ar[i] = ar[i + 1];
            }
            ar[n-1] = temp;
            p++;
        }
        System.out.println("Rotated array is "+ Arrays.toString(ar));
    }
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5};
        int n = ar.length;
        int d =  2;
        System.out.println("original array is :"+ Arrays.toString(ar));
        rotate1(ar, d, n);
    }
}

