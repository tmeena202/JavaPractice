package CollectionInJava.LinkedList;

public class LinkedList1 {
    public static class Node{
        int Data;
        Node Next;

        public Node(int data){
            this.Data = data;
        }
    }

    public static void main(String[] args) {
        LinkedList1 ll1 = new LinkedList1();

        Node n1 = new Node(10); // Inner class is Static
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        //Linking nodes to next node
        n1.Next = n2;
        n2.Next = n3;
        n3.Next = n4;
        n4.Next = n5;


        

    }
}
