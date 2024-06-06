package ExceptionHandling;

public class Exception1 {
    public static void main(String[] args) {
        try{
            int ans = divide(10,0);
            // this line will not get executed.
            System.out.println("Result :" + ans);
        }
        catch (ArithmeticException e){
            System.err.println("An arithmetic exception occurred :" + e.getMessage());
        }
        catch (Exception e) {
            // This block will catch any other exception types (if not already caught)
            System.err.println("An unexpected exception occurred: " + e.getMessage());
        }
        finally {
            // Code in the Finally block always executes, regardless of whether an exception occurred
            System.out.println("This finally block always runs.");
        }
        System.out.println("Program continues after exception handling.");
    }

    public static int divide(int num, int dem){
        //exception means that event or condition that disturbs flow of execution of program.
        return num/dem;
    }
}
