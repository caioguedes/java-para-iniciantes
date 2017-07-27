package chapter4;

import java.io.IOException;

public class HelpClassDemo {

    public static void main(String args[]) throws IOException {
        Help h = new Help();
        char choice, ignore;

        for (;;) {
            do {
                h.showMenu();
                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!h.isValid(choice));

            if (choice == 'q') {
                break;
            }

            System.out.println("\n");
            h.helpOn(choice);
        }
    }
}
