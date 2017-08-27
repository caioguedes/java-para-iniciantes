package chapter10;

import java.io.*;

public class ShowFile {
    public static void main(String[] args) {
        int i;

        if (args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        try (FileInputStream fin = new FileInputStream(args[0])) {

            do {
                i = fin.read();
                if (i != -1) System.out.print(i);
            } while (i != -1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
