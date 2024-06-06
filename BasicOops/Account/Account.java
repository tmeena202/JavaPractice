package BasicOops.Account;

public class Account {
    public String name;

    public Account(String name){
        this.name = name; // set value to instance variable
    }
    public void displayMethod(){
        System.out.println("The name of the user is " + name );
    }
}
