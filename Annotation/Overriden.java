package Annotation;

// Java Program to Illustrate Override Annotation

// Class 1
class Base
{
    public void Display()
    {
        System.out.println("Base display()");
    }

    public static void main(String[] args)
    {
        Base t1 = new Derived();
        t1.Display();
    }
}

// Class 2
// Extending above class
class Derived extends Base
{
    @Override
    public void Display()
    {
        System.out.println("Derived display()");
    }
}

