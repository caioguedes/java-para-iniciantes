package chapter5;

public class UpCase {

    public static void main(String[] args) {
        char ch;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('a' + i);
            System.out.println((int) ch);

            ch = (char) ((int) ch & 65503);

            System.out.print(ch + " ");
        }
    }
}
