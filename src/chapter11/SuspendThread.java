package chapter11;

public class SuspendThread implements Runnable {
    Thread thrd;

    boolean suspend;
    boolean stopped;

    SuspendThread(String name) {
        thrd = new Thread(this, name);
        suspend = stopped = false;
        thrd.start();
    }

    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {
            for (int i = 0; i < 1000; i++) {
                System.out.print(i + " ");
                if ((i % 10) == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }

                synchronized (this) {
                    while (suspend) {
                        wait();
                    }
                    if (stopped) break;
                }
            }
        } catch (InterruptedException e) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " exiting.");
    }

    synchronized void mystop() {
        stopped = true;
        suspend = false;
        notify();
    }

    synchronized void mysuspend() {
        suspend = true;
    }

    synchronized void myresume() {
        suspend = false;
        notify();
    }
}
