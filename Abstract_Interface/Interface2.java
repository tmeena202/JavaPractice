package Abstract_Interface;

interface Printable{
    void print();
}
interface Showable{
    void show();
}
class A7 implements Printable,Showable{
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Welcome");}

    public static void main(String args[]){
        A7 obj = new A7();
        obj.print();
        obj.show();

        Printable p = new A7();
        p.print();

        Showable s = new A7();
        s.show();
    }
}
