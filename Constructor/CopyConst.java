// program to demonstrate copy constructor
package Constructor;
public class CopyConst{
    String name;
    int age;
    public CopyConst(String name, int age){
        this.name = name;
        this.age = age;
    }
    public CopyConst(CopyConst obj2){
        this.name = obj2.name;
        this.age = obj2.age;
    }
}

class Test1{
    public static void main(String[] arg) {
        CopyConst CC1 = new CopyConst("TM", 20);
        System.out.printf("Object 1 Name = %s , Age = %d", CC1.name, CC1.age);

        System.out.println("");

        CopyConst CC2 = new CopyConst(CC1);
        System.out.printf("%nObject 2 Copy constructor Name = %s , Age = %d", CC2.name, CC2.age);
    }
}