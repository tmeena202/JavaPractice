package Looping;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Even no. between 1 to 100 natural no is ");
        for (int i = 1; i<= 100; i++){
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("odd no. between 1 to 100 natural no is ");
        for (int i = 1; i<= 100; i++){
            if (i % 2 == 1)
                System.out.print(i + " ");
        }
    }
}
