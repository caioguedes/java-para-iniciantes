package chapter4;

public class VehConsDemo {

    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 16, 18);
        Vehicle sportcat = new Vehicle(2, 14, 12);
        double gallons;
        int dist = 22;

        gallons = minivan.fuelneeded(dist);
        System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");

        gallons = sportcat.fuelneeded(dist);
        System.out.println("To go " + dist + " miles sportcar needs " + gallons + " gallons of fuel.");
    }
}
