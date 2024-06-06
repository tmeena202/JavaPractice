package Implementation_DS;
class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class MyLinkedList {
    ListNode head = null, tail = null;
    ListNode curr = null;
    public void addInLast(int key){
        ListNode node = new ListNode(key);
        if(head == null && tail == null){
            head = node;
            tail = node;
        }
        else {
            tail.next = node;
            tail = tail.next;
        }
    }
    public void addInFront(int key){
        ListNode node = new ListNode(key);
        if(head == null && tail == null){
            head = node;
            tail = node;
        }
        else {
            node.next = head;
            head = node;
        }
    }
    public void addInBetween(int key){
        ListNode node = new ListNode(key);
        if(head == null && tail == null){
            System.out.println("LL is Empty can't. add in between");
        }
        else {
            // code here
        }
    }
    public void removeFromLast(){
        curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
    }
    public void display(){
        curr = head;
        while(curr != null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        MyLinkedList l = new MyLinkedList();
        l.addInLast(10);
        l.addInLast(20);
        l.addInLast(30);
        l.removeFromLast();
        l.display();
    }
}
