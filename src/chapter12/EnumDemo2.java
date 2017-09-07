package chapter12;

public class EnumDemo2 {
    public static void main(String[] args) {
        Transport tp;

        System.out.println("Here are all Transport constants");

        Transport[] all = Transport.values();
        for (Transport t: all) {
            System.out.println(t);
        }

        System.out.println();

        tp = Transport.valueOf("AIRPLANE");
        System.out.println("tp contains " + tp);
    }
}
