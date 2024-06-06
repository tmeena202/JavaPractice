package Threading;

class MyThread extends Thread {
    public void run() {
        // Code to be executed by the thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread: " + i);
        }
    }
}

class Main {
    public static void main(String[] args) {
        // Create an instance of MyThread and start the thread
        MyThread myThread = new MyThread();
        myThread.start();

        // Main thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Main: " + i);
        }
    }
}

