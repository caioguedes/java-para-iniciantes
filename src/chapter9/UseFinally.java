package chapter9;

public class UseFinally {
    public static void genException (int what) {
        int t;
        int[] nums = new int[2];

        System.out.println("Receiving " + what);
        try {
            switch (what) {
                case 0:
                    t = 10;
                    break;
                case 1:
                    nums[4] = 4;
                    break;
                case 2:
                    return;
            }
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero.");
            return;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No matching element found.");
        } finally {
            System.out.println("Leaving try,");
        }
    }
}
