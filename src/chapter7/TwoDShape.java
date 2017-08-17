package chapter7;

public class TwoDShape {
    private double width;
    private double height;

    TwoDShape() {
        width = height = 0.0;
    }

    TwoDShape(double w, double h) {
        width = w;
        height = h;
    }

    TwoDShape(double x) {
        width = height = x;
    }

    TwoDShape(TwoDShape ob) {
        width = ob.getWidth();
        height = ob.getHeight();
    }

    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double w) {
        width = w;
    }

    public void setHeight(double h) {
        height = h;
    }
}