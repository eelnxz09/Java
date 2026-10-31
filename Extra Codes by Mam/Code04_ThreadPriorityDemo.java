class PriorityWorker extends Thread {
    public PriorityWorker(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " executing with priority " + getPriority());
    }
}

public class Code04_ThreadPriorityDemo {
    public static void main(String[] args) {
        PriorityWorker t1 = new PriorityWorker("Low Priority Thread");
        PriorityWorker t2 = new PriorityWorker("High Priority Thread");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}
