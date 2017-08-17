package chapter7;

public class TwoDShape {
    private double width;
    private double height;
    private String name;

    // Default Constructor
    TwoDShape() {
        width = height = 0.0;
        name = "none";
    }

    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }

    TwoDShape(TwoDShape ob) {
        width = ob.getWidth();
        height = ob.getHeight();
        name = ob.getName();
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

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    double area() {
        System.out.println("area() must be overriden");
        return 0.0;
    }
}