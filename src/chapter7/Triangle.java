package chapter7;

public class Triangle extends TwoDShape {
    String style;

    Triangle(String s, double w, double h) {
        super(w, h);
        style = s;
    }

    Triangle() {
        super();
        style = "none";
    }

    Triangle(double x) {
        super(x);
        style = "filled";
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}