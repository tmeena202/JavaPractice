// Write a Java program to create a class called "Person" with a name and age attribute.
// Create two instances of the "Person" class, set their attributes using the constructor,
// and print their name and age.
package Constructor.W3_Constructor;
public class Person {
    public String name;
    public int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) {
        Person p1 = new Person("TM", 20);
        System.out.printf("Object 1 instance variable are %s, %d", p1.name,p1.age);
        Person p2 = new Person("MM", 14);
        System.out.printf("%nObject 2 instance variable are %s, %d", p2.name,p2.age);
    }

}
