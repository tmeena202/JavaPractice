package Inheritance;

// superclass or parent class
public class TwoDShape4 {
    private double width;
    private double height;
    void showDim(){
        System.out.println("width is "+ width + " and Height is "+ height);
    }
    void setWidth(double w){ width = w; }
    void setHeight(double h){ height = h; }
    double getWidth(){return width ; }
    double getHeight(){return height; }
    //constructor of super class
    TwoDShape4(int h,int w) {
        height = h;
        width = w;
    }
}
// child class or subclass
class Triangle4 extends TwoDShape4 {
    private String style;
    double area(){
        return getWidth() * getHeight() / 2;
    }
    void showStyle(){
        System.out.println("triangle style is "+ style);
    }

    // constructor of subclass
    Triangle4(String s, int h, int w){
        // subclass constructor will always call super()
        super(h, w);
        this.style = s;
    }
}
class Shape4{
    public static void main(String[] args) {
        Triangle4 t1 = new Triangle4("filled",10,10);


        System.out.println("info for t1 ");
        t1.showStyle();
        t1.showDim();
        t1.area();

    }
}
