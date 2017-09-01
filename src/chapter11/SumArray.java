package chapter11;

public class SumArray {

    private int sum;

    int sumArray(int[] num) {
        sum =  0;

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
            System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }

        return sum;
    }
}
