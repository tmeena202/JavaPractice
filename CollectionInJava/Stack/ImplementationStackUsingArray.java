package CollectionInJava.Stack;

import java.util.Arrays;

class Stack {
    private static final int MAX = 100; //static variable
    int size; // instance variable all object of class has copy of it
    int top;
    int[] ar = new int[MAX];

    Stack() {
        top = -1;
    }

    public void push(int x) {
        if (top > MAX - 1) {
            System.out.println("Stack is Full StackOverflow");
        }
        top++;
        ar[top] = x;
        size++;
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack is Empty, can't pop");
            return 0;
        }
        top--;
        size--;
        int x = ar[top];
        return x;
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack is Empty, can't peek");
            return 0;
        }
        return ar[top];
    }

    public int size() {
        if (size <= 0) {
            System.out.println("Stack is Empty, can't peek");
            return 0;
        }
        return size;
    }

    public void display(int[] ar) {
        for (int i = 0; i <= top; i++) {
            System.out.print(ar[i] + " ");
            System.out.println();
        }
    }
}

public class ImplementationStackUsingArray {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(100);
        st.push(1000);

        st.display(st.ar);
        st.pop();
        st.display(st.ar);
        st.peek();
        st.size();

    }
}
