package Inheritance;

public class TwoDShape3 {
    //instance variable are private, so we can't access them
    //outside this class directly.
    private double width;
    private double height;
    void showDim(){
        System.out.println("width is "+ width + " and Height is "+ height);
    }
    void setWidth(double w){ width = w; }
    void setHeight(double h){ height = h; }
    double getWidth(){return width ; }
    double getHeight(){return height; }
    TwoDShape3(){
        // Default constructor of parent class
        // this is always called when constructor is created for child class
        //
    }
}
// Subclass or child class
class Triangle3 extends TwoDShape3{
    private String style; // private instance var.

    //Constructor of triangle3 class
    Triangle3(String s, double w, double h) {
        //first statement in subclass or child class is super() implicitly
        super();
        setWidth(w);
        setHeight(h);
        style = s;
    }
    double area(){
        return getWidth() * getHeight() / 2;
    }
    void showStyle(){
        System.out.println("triangle style is "+ style);
    }
}

class Shape3{
    public static void main(String[] args) {
        Triangle3 t1 = new Triangle3("Filled",10,10);
        Triangle3 t2 = new Triangle3("Empty",20,20);

        System.out.println("Info for t1 ");
        t1.showStyle();
        t1.showDim();

        System.out.println("");

        System.out.println("Info for t2 ");
        t2.showStyle();
        t2.showDim();

    }
}
