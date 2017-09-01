package chapter11;

public class TickTockThread implements Runnable {
    Thread thrd;
    TickTock ticktock;

    TickTockThread(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ticktock = tt;
        thrd.start();
    }

    public void run() {
        if (thrd.getName().compareTo("Tick") == 0) {
            for (int i = 0; i < 5; i++) ticktock.tick(true);
            ticktock.tick(false);
        } else {
            for (int i = 0; i < 5; i++) ticktock.tock(true);
            ticktock.tock(false);
        }
    }
}
