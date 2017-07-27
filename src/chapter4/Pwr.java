package chapter4;

public class Pwr {

    public double b;
    public int e;
    public double val;

    public Pwr(double base, int exp) {
        b = base;
        e = exp;

        val = 1;
        if (exp == 0) {
            return;
        }
        for (; exp > 0; exp--) {
            val = val * base;
        }
    }

    public double get_pwr() {
        return val;
    }
}
