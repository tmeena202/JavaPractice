package CollectionInJava.Queue;

public class ArrayImplementation {
    static class queueA {
        // custom queue that have custom methods using array
        int f , r = -1;
        int size = 0;
        int[] arr = new int[100];

        public void add(int x){
            if ( r == arr.length -1 ) {
                System.out.println("Queue is FuLL !");
                return;
            }
            if (r == -1){
                f = r = 0;
                arr[r] = x;
            } else {
                arr[r+1] = x;
                r++;
            }
            size++;
        }

        public int remove(){
            if ( f == -1){
                System.out.println("queue is empty !");
                return -1;
            }
            size--;
            int x = arr[f];
            f++;
            return x;
        }
        public int peek(){
            return arr[f];
        }
        public void display(){
            if (size == 0){
                System.out.println("queue is empty !");
            }
            else {
                for (int i=f; i<=r; i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        queueA q = new queueA();
        q.add(10);
        q.add(40);
        q.add(40);
        q.add(40);
        q.add(40);

        q.display();
        q.remove();
        q.display();


    }
}
