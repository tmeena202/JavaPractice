package Inheritance;

//super class
public class TwoDShape {
    double width;
    double height;
    void showDim(){
        System.out.println("width is "+ width + " and Height is "+ height);
    }
}
// subclass
class Triangle extends TwoDShape {
    String style;
    double area(){
        return width * height / 2;
    }
    void showStyle(){
        System.out.println("triangle style is "+ style);
    }
}
class Shape{
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        // setting the value of t1 object
        t1.width = 10;       //Instance variable of superclass
        t1.height = 20;
        t1.style = "filled"; //instance variable of subclass

        //setting the values for t2 object of triangle
        t2.width = 30;
        t2.height = 40;
        t2.style = "outlined";

        // info for t1 object
        t1.showDim();
        t1.showStyle();
        System.out.println("area of t1 is "+ t1.area());

        System.out.println("");

        // info for t2 object
        t2.showDim();
        t2.showStyle();
        System.out.println("area of t2 is " + t2.area());
    }
}