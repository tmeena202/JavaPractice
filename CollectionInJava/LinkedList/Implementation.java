package CollectionInJava.LinkedList;

public class Implementation {
    public static class Node{
        int data;
        Node next;

        Node(int data){        //constructor of node class
            this.data = data;
            next = null;
        }
    }

    public static class linkedlist{
        Node head; /* default value of head and tail are null */
        Node tail;

        public void insertionAtEnd(int value){
            //always create node first
            Node node = new Node(value);
            //check if linked list is empty or not
            if (head == null ){
                head = node;
                tail = node;
            }
            else {
                tail.next = node;
                tail = node;
            }
        }
        public void insertionAtStart(int value){
            Node node = new Node(value);
            if (head == null){
                head = node;
                tail = node;
            }
            else {
               node.next = head;
               head = node;
            }
        }
        void insertAt(int idx, int value){
            Node t = new Node(value);
            Node temp = head;
            if (idx == size() ){
                insertionAtEnd(value);
                return;
            }
            else if (idx==0) {
                insertionAtStart(value);
            }
            else if (idx < 0 || idx > size()) {
                System.out.println("wrong index ");
            }
            for(int i=1; i<= idx-1; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        void deleteAt(int idx, int val){
            if (idx == 0) head = head.next;
            Node temp = head;
             for(int i = 1; i<=idx-1; i++){
                 temp = temp.next;
             }
             temp.next = temp.next.next;
        }
        public void display(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        int size(){
            Node temp = head;// temp is a reference variable of user defined data type Node
                             // which is pointing towards head object
            int count = 0;
            while( temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }


    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertionAtStart(10);
        ll.insertionAtEnd(20);
        ll.insertionAtEnd(30);
        ll.insertAt(1,100);
        ll.display();
        System.out.println();
        System.out.println(ll.size());
    }
}
