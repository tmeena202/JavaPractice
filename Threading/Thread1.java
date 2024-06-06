package Threading;
import java.lang.Thread;

import static java.lang.Thread.*;

class Hi extends Thread {
    public void run() {
        for (int i=1; i<=100; i++){
            System.out.println("Hi");
            try {
                sleep(2);
            } catch (InterruptedException e) { throw new RuntimeException(e); }
        }
    }
}
class Hello extends Thread {
    public void run() {
        for (int i=1; i<=100; i++){
            System.out.println("Hello");
        }
    }
}
class Demo {
    public static void main(String[] args) {
        Hi hi = new Hi();
        Hello hello = new Hello();

        hello.setPriority(10);

        hi.start();
        hello.start();
    }
}
