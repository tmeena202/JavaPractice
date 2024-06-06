package Threading;

public class Thread2 extends Thread{
    @Override
    public void run() {
        for (int i=0; i<5; i++){
            System.out.println((char)(i+65));
//            try {
//                sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
    public static void main(String[] args) {
        Thread2 thread2 = new Thread2();
        Thread th = new Thread(thread2);
        th.start();
        for (int i=0; i<5; i++){
            System.out.println(i);
        }
    }
}
