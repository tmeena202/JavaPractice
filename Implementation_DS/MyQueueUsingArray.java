package Implementation_DS;

public class MyQueueUsingArray {
    int f; int r;
    int Max = 100;
    int[] array = new int[Max];
    public MyQueueUsingArray(){
        f = -1;
        r = -1;
    }
    public void offer(int key){
        if(r >= Max-1){
            System.out.println("Queue is Overflow : Queue is full");
        }
        if(f ==-1 && r == -1 ){
            f = 0;
            r = 0;
            array[f] = key;
        }
        else{
            r++;
            array[r] = key;
        }
    }
    public int peek(){
        if(f == -1 && r == -1){
            System.out.println("Queue is Underflow : Queue is Empty");
        }
        return array[f];
    }
    public int poll(){
        if(f == -1 && r == -1){
            System.out.println("Queue is Underflow : Queue is Empty");
            return 0;
        }
        int polled = array[f];
        f++;
        return  polled;
    }
    public void display(){
        for (int i=f; i<=r; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        MyQueueUsingArray q = new MyQueueUsingArray();
        q.offer(10);
        q.offer(2);
        q.offer(40);
        q.offer(90);
        q.display();
        System.out.println(q.peek());
        System.out.println(q.poll());
        q.display();
    }
}
