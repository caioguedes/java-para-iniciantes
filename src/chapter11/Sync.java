package chapter11;

public class Sync {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        SumThread mt1 = new SumThread("Child #1", a);
        SumThread mt2 = new SumThread("Child #2", a);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
    }
}
