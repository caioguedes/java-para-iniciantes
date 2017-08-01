package chapter6;

public class AccessDemo {

    public static void main(String[] args) {
        MyClass ob = new MyClass();

        ob.setAlpha(-99);
        System.out.println("ob.alpha is " + ob.getAlpha());

        // ob.alpha = 10;
        ob.beta = 88;
        ob.gamma = 99;
    }
}
