package Inheritance;

class Parent {                   //Super class Parent
    public int age;
}
class Child extends Parent{      // Child is Subclass
    public int rollNo;
    public Child(int age, int rollNo){
        this.age = age;
        this.rollNo = rollNo;
        System.out.println("age = " + this.age);
        System.out.println("rollNO = " + this.rollNo);
    }
}

public class Example1{
    public static void main(String[] args) {
        Child c1 = new Child(10, 1);
    }
}