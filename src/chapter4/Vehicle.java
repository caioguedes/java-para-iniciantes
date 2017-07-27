package chapter4;

public class Vehicle {

    private int passenger;
    private int fuelcap;
    private int mpg;

    public Vehicle(int p, int f, int m) {
        this.passenger = p;
        this.fuelcap = f;
        this.mpg = m;
    }

    public int range() {
        return this.mpg * fuelcap;
    }

    public double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}
