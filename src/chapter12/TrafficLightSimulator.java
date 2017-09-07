package chapter12;

public class TrafficLightSimulator implements Runnable {
    private Thread thread;
    private TrafficLightColor color;
    boolean stop = false;
    boolean changed = false;

    TrafficLightSimulator(TrafficLightColor init) {
        color = init;
        thread = new Thread(this);
        thread.start();
    }

    TrafficLightSimulator() {
        color = TrafficLightColor.RED;
        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        while (!stop) {
            try {
                switch (color) {
                    case GREEN:
                        Thread.sleep(1000);
                        break;
                    case YELLOW:
                        Thread.sleep(2000);
                        break;
                    case RED:
                        Thread.sleep(12000);
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            changeColor();
        }
    }

    synchronized void changeColor() {
        switch (color) {
            case RED:
                color = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                color = TrafficLightColor.RED;
                break;
            case GREEN:
                color = TrafficLightColor.YELLOW;
                break;
        }

        changed = true;
        notify();
    }

    synchronized void waitForChange() {
        try {
            while (!changed) {
                wait();
            }
            changed = false;
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    synchronized TrafficLightColor getColor() {
        return color;
    }

    synchronized void cancel() {
        stop = true;
    }
}
