package chapter5;

public class Bubble {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 5, 4};


        for (int a = 1; a < nums.length; a++) {

            for (int b = nums.length - 1; b >= a; b--) {

                System.out.println("A is: " + a + " - B is: " + b);

                if (nums[b - 1] > nums[b]) {
                    int i = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = i;
                }
            }
        }
    }
}
