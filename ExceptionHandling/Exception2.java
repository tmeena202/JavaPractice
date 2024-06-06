package ExceptionHandling;

import java.io.FileInputStream;

public class Exception2 {
    public static void main(String[] args) {
        System.out.println("Start");
//        try {
//            FileInputStream fis = new FileInputStream("c:/test2.txt.txt");
//        }
//        catch (Exception e){
//            System.out.println("File not found");
//        }
        try {
            int a = 100, b = 0, c;
            c = a / b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println(e);
            System.err.println("Cannot divide by zero !");
        }
        System.out.println("End");
    }
}
