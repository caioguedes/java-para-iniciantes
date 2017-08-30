package chapter10;

import java.io.*;

public class DtoS {
    public static void main(String[] args) {
        String s;

        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
