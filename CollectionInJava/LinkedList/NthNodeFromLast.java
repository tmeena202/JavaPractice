package CollectionInJava.LinkedList;

public class NthNodeFromLast {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static int findNthNodeFromLast(Node head, int idxfromlast){
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        // m is nth index from start
        int m = size - idxfromlast + 1;
        temp = head;
        for(int i= 1; i<=m-1 ; i++){
            temp = temp.next;
        }
        return temp.data;
    }
    public static int findNthNode2(Node head, int idxfromlast){
        Node fast = head;
        Node slow = head;
        for(int i=1; i<= idxfromlast; i++){
            fast = fast.next;
        }
        while( fast != null ){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }
    public static Node deleteNthFromEnd(Node head, int idxfromlast){
        Node slow = head;
        Node fast = head;

        for(int i=1; i<= idxfromlast; i++){
            fast = fast.next;
        }
        if (fast == null ){
            head = head.next;
            return head;
        }
        while ( fast.next != null ){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data +  " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(1);
        Node c = new Node(23);
        Node d = new Node(170);
        Node e = new Node(1880);
        Node f = new Node(-8);
        Node g = new Node(66);
        //
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        // 10 - 1 - 23 - 170 - 1880 - 8 - 66

        System.out.println(findNthNodeFromLast(a, 4));
        System.out.println(findNthNode2(a, 4));

        display(a);
        System.out.println();
        a = deleteNthFromEnd(a, 7);
        display(a); // 1 - 23 - 1880 - 8 - 66
        System.out.println(a.data);
        System.out.println(b.data);

    }
}
