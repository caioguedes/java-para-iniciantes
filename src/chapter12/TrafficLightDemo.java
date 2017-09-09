package chapter12;

public class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLightSimulator tls = new TrafficLightSimulator(TrafficLightColor.GREEN);

        for (int i = 0; i < 9; i++) {
            tls.changeColor();
            System.out.println(tls.getColor());
            tls.waitForChange();
        }

        tls.cancel();
    }
}
