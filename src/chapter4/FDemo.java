package chapter4;

public class FDemo {
    private int x;

    FDemo(int i) {
        this.x = i;
    }

    protected  void finalize() {
        System.out.println("Finalizing " + x);
    }

    public void generator(int i) {
        FDemo o = new FDemo(i);
    }
}
