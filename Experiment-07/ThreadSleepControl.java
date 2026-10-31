class RangeUpThread extends Thread {
    public void run() {
        for (int i = 10; i <= 20; i++) {
            System.out.println("Thread 1 (10 to 20): " + i);
            if (i == 11) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}

class RangeDownThread extends Thread {
    public void run() {
        for (int i = 20; i >= 1; i--) {
            System.out.println("Thread 2 (20 to 1): " + i);
        }
    }
}

public class ThreadSleepControl {
    public static void main(String[] args) {
        RangeUpThread t1 = new RangeUpThread();
        RangeDownThread t2 = new RangeDownThread();
        t1.start();
        t2.start();
    }
}
