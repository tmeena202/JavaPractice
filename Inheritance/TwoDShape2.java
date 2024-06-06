/*Example of inheritance but without constructor */
package Inheritance;

public class TwoDShape2 {
    double width;
    double height;
    void showDim(){
        System.out.println("width is "+ width + " and Height is "+ height);
    }
    void setWidth(double w){ width = w; }
    void setHeight(double h){ height = h; }
    double getWidth(){return width ; }
    double getHeight(){return height; }

}
class Triangle2 extends TwoDShape2{
    String style;
    double area(){
        return width * height / 2;
    }
    void showStyle(){
        System.out.println("triangle style is "+ style);
    }
}
class shape2{
    public static void main(String[] args) {
        Triangle2 t1 = new Triangle2();
        Triangle2 t2 = new Triangle2();

        //setting values of t1 obj
        t1.setWidth(10);
        t1.setHeight(10);
        t1.style ="Filled";

        //setting values of t2 obj
        t2.setWidth(20);
        t2.setHeight(20);
        t2.style ="empty";

        System.out.println("Info for t1 :");
        System.out.println("width of t1 is " + t1.getWidth());
        System.out.println("Height of t1 is "+ t1.getHeight());
        System.out.println("Area of t1 is " +t1.area());
        t1.showStyle();

        System.out.println("");

        System.out.println("info for t2");
        System.out.println("width of t1 is " + t2.getWidth());
        System.out.println("Height of t1 is "+ t2.getHeight());
        System.out.println("Area of t1 is " +t2.area());
        t2.showStyle();

    }
}
