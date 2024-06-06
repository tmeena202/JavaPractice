package Annotation;

public class DeprecatedTest
{
    @Deprecated
    public void Display()
    {
        System.out.println("Deprecated test display()");
    }

    public static void main(String[] args)
    {
        DeprecatedTest1 d1 = new DeprecatedTest1();
        d1.Display();
    }
}

