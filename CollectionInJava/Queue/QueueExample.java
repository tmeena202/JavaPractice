package CollectionInJava.Queue;

import java.util.LinkedList;
import java.util.Queue;

class QueueExample {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(3);
        q.add(89);
        q.add(94);

        Queue<Integer> t = new LinkedList<>();
        
        while( q.size() > 0 ){
            System.out.print(q.peek() + " ");
            t.add(q.poll());
        }
    }
}
class Example2{

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println(q);

        int n = q.size();
        while(n > 1){
           q2.add(q.remove());
           n--;
        }
        int x = q.remove();

        int m = q2.size();
        while( m > 0){
            q.add(q2.remove());
            m--;
        }
        System.out.println(x);
        System.out.println(q);
        System.out.println(q2);

    }
}