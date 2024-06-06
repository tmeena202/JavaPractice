// w3 resource
//Q1 write a java program to find the smallest number among three numbers

package Methods;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 variables");
        System.out.print("Input the first no.");
        int x = scanner.nextInt();
        System.out.print("Input the second no.");
        int y = scanner.nextInt();
        System.out.print("Input the third no.");
        int z = scanner.nextInt();

        int result = smallestNo(x, y, z);
        System.out.printf("Smallest no is %d", result);
    }

        public static int smallestNo(int a, int b, int c){
            int smallest;
            smallest = a;
            if (b < smallest){
                smallest = b;
            }
            if (c < smallest) {
                smallest = c; //System.out.print("smallest No. is %d", c)
            }
            return smallest;
    }
}