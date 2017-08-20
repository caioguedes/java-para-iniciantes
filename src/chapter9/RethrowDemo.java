package chapter9;

public class RethrowDemo {
    public static void main(String[] args) {
        try {
            Rethrow.genException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fatal error - program terminated.");
        }
    }
}
