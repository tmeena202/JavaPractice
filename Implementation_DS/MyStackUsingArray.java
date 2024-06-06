package Implementation_DS;

public class MyStackUsingArray {
    int top = -1;
    static final int MAX = 1000;
    int[] array = new int[MAX];
    MyStackUsingArray(){
    }
    public void push(int key){
        if(top >= array.length)
            System.out.println("Stack is full : Overflow condition");
        array[++top] = key;
    }
    public void top(){
        if(top == -1)
            System.out.println("Stack is empty : Underflow condition");
        System.out.println(array[top]);
    }
    public int pop(){
        if(top == -1){
            System.out.println("Stack is empty : Underflow condition");
            return 0;
        }
        return array[top--];
    }
    public boolean isEmpty(){
        if(top == -1) {
            return true;
        } else
            return false;
    }
    public boolean isFull(){
        if(top >= array.length)
            return true;
        else
            return false;
    }
    public int size(){
        if(top == -1)
            return 0;
        return top+1;
    }
    public void display(){
        for(int i=top; i>-1; i--){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyStackUsingArray myStack = new MyStackUsingArray();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.display();
        System.out.println(myStack.size());
        myStack.top();
        System.out.println(myStack.pop());
        myStack.push(100);
        myStack.display();
    }
}
