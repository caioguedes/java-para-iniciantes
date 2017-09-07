package chapter12;

public class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLightSimulator tls = new TrafficLightSimulator(TrafficLightColor.GREEN);

        for (int i = 0; i < 20; i++) {
            System.out.println(tls.getColor());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        tls.cancel();
    }
}
