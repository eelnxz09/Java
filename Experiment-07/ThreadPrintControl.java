class FirstThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread 1 (1 to 10): " + i);
            if (i == 2) {
                Thread.yield();
            }
        }
    }
}

class SecondThread extends Thread {
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("Thread 2 (10 to 1): " + i);
        }
    }
}

public class ThreadPrintControl {
    public static void main(String[] args) {
        FirstThread t1 = new FirstThread();
        SecondThread t2 = new SecondThread();
        t1.start();
        t2.start();
    }
}
