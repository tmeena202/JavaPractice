package ExceptionHandling;

import java.util.Scanner;

public class VoterEligibility {
    class LessThan18 extends RuntimeException{
        public LessThan18(String msg){
            super(msg);
        }
    }

    public static void main(String[] args) {
        VoterEligibility e3 = new VoterEligibility();
        System.out.println("Start");
        boolean stop = true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your age: ");
            int age = sc.nextInt();
            if (age < 18) {
                try {
                    throw e3.new LessThan18("Can't vote less than 18");
                } catch (LessThan18 e) {
                    System.out.println("You are not Eligible for voting, Kid");
                }

            } else {
                System.out.println("voting success");
                stop = false;
            }
            System.out.println("End1");
            System.out.println("End2");
        } while (stop);
    }
}
