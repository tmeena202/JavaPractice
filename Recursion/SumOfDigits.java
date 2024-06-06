package Recursion;

public class SumOfDigits {
    int n;
    int sum;
    //sum using iteration
    public  int sumIteration(int m) {
        while (m > 0) {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfDigits s = new SumOfDigits();
        System.out.println(s.sumIteration(9999));
    }
}
