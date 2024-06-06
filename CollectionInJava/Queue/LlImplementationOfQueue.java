package CollectionInJava.Queue;

public class LlImplementationOfQueue {

    public static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class queuell{
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int x){
            Node temp = new Node(x);
            if( size == 0 ) {
                head = tail = temp;
            }
            else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int remove(){
            if (size == 0 ) {
                System.out.println("Queue is empty !");
                return -1;
            }
            size--;
            int x = head.data;
            head = head.next;
            return x;
        }

        public void display() {
            if ( size == 0 ) {
                System.out.println("queue is empty !");
                return;
            }
            Node temp = head;
            while (temp != null ) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        queuell q = new queuell();
        q.display();
        q.add(10);
        q.add(100);
        q.add(200);
        q.add(1000);

        q.display();

        q.remove();
        q.remove();
        q.display();
    }
}
