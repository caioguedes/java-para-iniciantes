package chapter11;

public class UseMain {
    public static void main(String[] args) {
        Thread thrd = Thread.currentThread();

        System.out.println("Main thread is called: " + thrd.getName());
        System.out.println("Priority: " + thrd.getPriority());

        System.out.println();

        System.out.println("Setting name and priority.");
        thrd.setName("Thread #1");
        thrd.setPriority(Thread.NORM_PRIORITY);

        System.out.println("Main thread is called: " + thrd.getName());
        System.out.println("Priority: " + thrd.getPriority());
    }
}