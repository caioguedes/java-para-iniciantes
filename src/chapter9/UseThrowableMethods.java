package chapter9;

public class UseThrowableMethods {
    public static void main(String[] args) {
        try {
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Standard message is: ");
            System.out.println(e);
            System.out.println("\nStack trace: ");
            e.printStackTrace();
        }
        System.out.println("After catch statement");
    }
}
