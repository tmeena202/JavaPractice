package Annotation;

// Java Program to illustrate SuppressWarnings Annotation

// Class 1
class DeprecatedTest1
{
    @Deprecated
    public void Display()
    {
        System.out.println("Deprecated test display()");
    }
}

// Class 2
public class SuppressWarningTest
{
    // If we comment below annotation, program generates
    // warning
    @SuppressWarnings({"checked", "deprecation"})
    public static void main(String[] args)
    {
        DeprecatedTest1 d1 = new DeprecatedTest1();
        d1.Display();
    }
}

