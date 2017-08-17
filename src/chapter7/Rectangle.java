package chapter7;

public class Rectangle extends TwoDShape {

    Rectangle() {
        super();
    }

    Rectangle(double w, double h) {
        super(w, h, "rectangle");
    }

    Rectangle(double x) {
        super(x, "rectangle");
    }

    Rectangle(Rectangle ob) {
        super(ob);
    }

    boolean isSquare() {
        return getWidth() == getHeight();
    }

    double area() {
        return getWidth() * getHeight();
    }
}
