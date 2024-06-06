package ExceptionHandling;

// https://www.geeksforgeeks.org/flow-control-in-try-catch-finally-in-java/?ref=lbp

public class TCF_Example {
    static int[] arr = new int[4];
    //try catch e.g.
    static class Try_Catch{
        //
        public void doSomething1() {
            try {
                int i = arr[4];
                System.out.println(i);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception caught in catch block");
            }
        }

        // Exception occurs but doesn't handled in catch
        // Exception is ArrayOutOfIndexBound but is defined NullPointerException
        public void doSomething3(){
            try {
                int i = arr[4];
                System.out.println(i);
            } catch (NullPointerException ne){
                System.out.println("Inside catch block");
            }
        }

        //
        public void doSomething5(){
            try {
                int i = arr[3];
                System.out.println(i);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Inside catch block");
            } finally {
                System.out.println("Inside finally block");
            }
            System.out.println("Outside try-catch-finally");
        }

    }

    //try catch finally e.g.
    static class Try_Catch_Finally{

        //
        public void doSomething2(){
            try{
                int i = arr[4];
                System.out.println(i);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Exception in catch block");
            }
            finally {
                System.out.println("inside Finally block.");
            }
            System.out.println("Outside try catch finally");
        }

        //
        public void doSomething4(){
            try {
                int i = arr[4];
                System.out.println(i);
            } catch (NullPointerException ne){
                System.out.println("Inside catch block");
            } finally {
                System.out.println("Inside finally block");
            }
            System.out.println("Outside TCF block");
        }
    }

    //try finally e.g.
    static class Try_Finally{
        //
        public void doSomething6(){
            try {
                int i = arr[4];
                System.out.println(i);
            } finally {
                System.out.println("Inside Finally block");
            }
            System.out.println("Outside try-finally block");
        }

        public void doSomething7(){
            try {
                int i = arr[3];
                System.out.println(i);
            } finally {
                System.out.println("Inside Finally block");
            }
            System.out.println("Outside try-finally block");
        }
    }

    public static void main(String[] args) {
        TCF_Example.Try_Catch tc = new TCF_Example.Try_Catch();
        Try_Catch_Finally tcf = new Try_Catch_Finally();
        Try_Finally tf = new Try_Finally();
//        tc.doSomething1();
//        tcf.doSomething2();
//        tc.doSomething3();
//        tcf.doSomething4();
//        tc.doSomething5();
//        tf.doSomething6();
        tf.doSomething7();

    }
}
