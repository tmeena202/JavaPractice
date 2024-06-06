package Inheritance;

public class Animal {
    String name;
    void eat(){
        System.out.println("I can eat ");
    }
}
class Dog extends Animal{
    void display(){
        System.out.println("My name is " + name);
    }
}
class main{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "dog1";
        d.display();
        d.eat();
    }
}
