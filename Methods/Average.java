package Methods;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 Number to find their Average");

        System.out.print("Enter the First number :");
        double x = scanner.nextInt();
        System.out.print("Enter the Second number :");
        double y = scanner.nextInt();
        System.out.print("Enter the Third number :");
        double z = scanner.nextInt();

        double result = findAverage(x,y,z);
        System.out.printf("The average of 3 number is %f", result);
    }

    public static double findAverage(double a, double b, double c){
        double total = a+b+c;
        return total / 3;

    }
}
