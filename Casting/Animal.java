package Casting;

public class Animal {
    String animalname; //variable of parent class

    void animalNature(){  // method of parent class
        System.out.println("Animal");
    }
     void leg(){
         System.out.println("4");
     }
}
class Fish extends Animal{
    String fishname;  // variable of child class

    void fishNature(){  // method of child class
        System.out.println("Fish");
    }
    void leg(){
        System.out.println("no");
    }
}
class main{
    public static void main(String[] args) {
        //object of parent class
        Animal a = new Animal();
        a.animalname = "dog";
        a.animalNature();
        a.leg();

        Fish f = new Fish();
        f.animalname = "cat";
        f.animalNature();
        f.fishname = "catfish";
        f.fishNature();
        f.leg();

        Animal b = new Fish();
        b.animalname = "animalcat";
        b.animalNature();
        b.leg();

        Animal c = (Animal) new Fish();
        c.animalname = "tiger";
        c.animalNature();
        c.leg();
    }
}