package Recursion2;

public class function {
    public static void return0(int x){
        System.out.println("0");
        return;
    }
    public static int method(int x){
        if(x == 123) {
            return 123;
        }
        else {
            return 1000;
        }
    }


    public static void main(String[] args) {
        //return0(0);
        System.out.println(method(123));
    }
}
