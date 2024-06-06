package Recursion;

public class Rec1 {
    public static void message0(){
        System.out.println("Hello world 0");
        message1();
    }
    public static void message1(){
        System.out.println("Hello world 1");
    }

    public static void main(String[] args) {
        message0();
    }
}
