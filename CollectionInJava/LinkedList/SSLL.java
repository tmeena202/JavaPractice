package CollectionInJava.LinkedList;

public class SSLL {
    static class Node1 {
        int data;
        char name;
        Node1 next;

        public Node1(int data, char name){
            this.data = data;
            this.name = name;
        }//Node 1 class ends here

    static class Node2{
            int value;
            Node2 next;

            public Node2(int d){
                this.value = d;
            }
            public Node2(int d, Node2 n){
                this.value = d;
                this.next = n;
            }
    }


        public static void main(String[] args) {

            Node2 n1 = new Node2(10);
            Node2 n2 = new Node2(20);
            Node2 n3 = new Node2(30);
            n1.next= n2;
            n2.next = n3;
            n3.next=null;

        }
    }
}
