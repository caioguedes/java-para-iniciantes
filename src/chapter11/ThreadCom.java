package chapter11;

public class ThreadCom {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        TickTockThread mt1 = new TickTockThread("Tick", tt);
        TickTockThread mt2 = new TickTockThread("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
    }
}
