//Write a Java program to create a class called "Dog" with a name and breed attribute.
//Create two instances of the "Dog" class, set their attributes using the constructor
//and modify the attributes using the setter methods and print the updated values.

package Constructor.W3_Constructor;
public class Dog {
    public String name;
    public String breed;

    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
        System.out.printf("The name of the dog is %s and breed is %s %n" , this.name, this.breed);
    }
    public void setter(String name1, String breed2){
        this.name = name1;
        this.breed = breed2;
        System.out.printf("The name of the dog is %s and breed is %s %n" , this.name, this.breed);
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("dog1","breed1");
        Dog d2 = new Dog("dog2","breed2");

        System.out.println("");
        System.out.println("After using setter method, updated values are :");
        System.out.println("");

        d1.setter("dog3", "breed3");
        d2.setter("dog4", "breed4");
    }
}
