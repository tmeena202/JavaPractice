// Example of parametrized constructor
package Constructor;
public class ParametrizedConst {
    public String name;
    public int age;
    public int rollNo;

    public ParametrizedConst(String name, int age, int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }
    public void displayMessage(){
        System.out.printf("My name is %s, my age is %d and rollNo is %d",name,age,rollNo);
    }
}

class test{
    public static void main(String[] args) {
        ParametrizedConst PC = new ParametrizedConst("Tushar Meena",20,28);
        PC.displayMessage();
    }
}