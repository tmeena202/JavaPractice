package Implementation_DS;

import java.util.LinkedList;

public class MyStackUsingLinkedList {
    StackNode head;
    StackNode tail;
    int size=0;
    static class StackNode{
        int data;
        StackNode next;
        public StackNode(int data){
            this.data = data;
        }
    }
    MyStackUsingLinkedList(){
        head = null;
        tail = null;
    }

    public void push(int key){
        size++;
        if(head == null && tail == null){
            StackNode node = new StackNode(key);
            head = node;
            tail = node;
            System.out.println("First Element is pushed successfully in the stack");
        }
        else {
            StackNode node = new StackNode(key);
            tail.next = node;
            tail = tail.next;
            System.out.println("Element is pushed successfully in the stack");
        }
    }
    public void top(){
        if(tail == null)
            System.out.println("Stack Underflow : Stack is empty");
        else
            System.out.println("The value at the top of the stack is : "+tail.data);
    }
    public int pop(){
        size--;
        if(tail == null){
            System.out.println("Stack Underflow : stack is empty");
            return 0;
        }
        else {
            int popped = tail.data;
            tail = tail.next;
            return popped;
        }
    }
    public boolean isEmpty(){
        if(head == null)
            return true;
        else
            return false;
    }
    StackNode curr;
    public void display(){
        curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public int size(){
        return size;
    }

    public static void main(String[] args) {
        MyStackUsingLinkedList stack = new MyStackUsingLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        stack.top();
        stack.pop();
        stack.pop();
        stack.top();;
        stack.display();
    }
}
