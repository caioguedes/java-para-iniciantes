package chapter4;

public class Finalize {

    public static void main(String[] args) {
        int count;

        FDemo ob = new FDemo(0);

        for (count = 1; count < 10000000; count++) {
            ob.generator(count);
        }
    }
}
