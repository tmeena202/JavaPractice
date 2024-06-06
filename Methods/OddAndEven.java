package Methods;
import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number to check odd or Even :");
        int number = scanner.nextInt();
        evenOdd(number);
    }

        public static void evenOdd(int n){
            if(n % 2 == 0){
                System.out.println("The Number is Even");
            }
            else
                System.out.println("The Number is odd");
        }
}

