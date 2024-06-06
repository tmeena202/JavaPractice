package CollectionInJava.Stack;


class Stack1 {
    Node1 head;
    private int size = 0;

    static class Node1 {
        int data;  // want to add data using manually made push method
        Node1 next;
    }

    Stack1() {
        this.head = null;
    }

    public void push(int x) {
        size++;
        Node1 temp = new Node1();
        temp.data = x;
        temp.next = head;
        head = temp;
    }

    public int pop() {
        if (head == null) {
            System.out.println("Stack is Empty");
            return -1;
        }
        size--;
        int x = head.data;
        head = head.next;
        return x;
    }
    public int size(){
        return size;
    }
    public int peek(){
        if (head == null) {
            System.out.println("Stack is Empty");
            return -1;
        }
        int x = head.data;
        return x;
    }
    public void display() {
        if (head == null) {
            System.out.println("Stack is Empty");
            return;
        }
        Node1 temp2 = head;
        while (temp2 != null) {
            System.out.print(temp2.data + " ");
            temp2 = temp2.next;
        }
        System.out.println();
    }
}

public class StackUsingLinkedList {
    public static void main(String[] args) {
        Stack1 st = new Stack1();
        st.push(10);
        st.push(100);
        st.push(1000);
        st.display();
        System.out.println(st.pop());
        st.display();
        System.out.println(st.size());
    }
}
