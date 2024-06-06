package CollectionInJava.Queue;

public class CircularQueueArray {

    public static class CircularQueue {
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[5];
        int n = arr.length;

        public void add(int val){
            if ( size == n){
                System.out.println("Queue is full !");
                return;
            }
            size++;
            if ( r == n-1 ){ // When array is full and want to start filling from start
                r = 0;
                arr[r] = val;
                return;
            }

            if ( r == -1 ){ // first time adding element in C.Q
              r = 0; f = 0;
              arr[r] = val;
            }else {
                arr[r+1] = val;
                r++;
            }
        }

        public int remove(){
            if ( size == 0 ){
                System.out.println("Queue is Empty Can't delete elements !");
                return -1;
            }
            if ( f==n-1 ){
                int val = arr[f];
                f = 0;
                return val;
            }
            size--;
            int val = arr[f];
            f++;
            return val;

        }

        public int peek(){
            if ( size == 0 ){
                System.out.println("can't peek no element in queue");
            }
            return arr[f];
        }

        public boolean isFullCQ(){
            if( size == n ) return true;
            else return false;
        }

        public boolean isEmptyCQ(){
            if ( size == 0 ) return true;
            else return false;
        }

        public int size(){
            return size;
        }

        public void display(){
            if ( size == 0 ){
                System.out.println("Circular Queue is Empty !");
                return;
            }
            else if ( f<=r ) {
                for ( int i=f; i<=r; i++ ){
                    System.out.print(arr[i] + " ");
                }return;
            }
            else  { // r<f
                for (int i=f; i<=n-1; i++){
                    System.out.print(arr[i] + " ");
                }
                for (int i=0; i<=r; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue();

        q.add(100);
        q.add(20);
        q.add(40);
        q.add(60);
        q.add(70);

        q.remove();
        q.remove();  // 40 60 70
        q.display();
        System.out.println();

        q.add(1000);
        q.add(2000);
        q.display();
        q.remove();
        q.add(22);
        q.display();
        q.add(33);


    }
}
