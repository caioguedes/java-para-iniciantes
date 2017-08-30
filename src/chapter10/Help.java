package chapter10;

import java.io.*;

public class Help {
    String helpfile;

    Help(String fname) {
        helpfile = fname;
    }

    boolean helpOn(String what) {
        int ch;
        String topic, info;
        try (BufferedReader br = new BufferedReader(new FileReader(helpfile))) {

            do {
                ch = br.read();

                if (ch == '#') {
                    topic = br.readLine();
                    if (what.compareTo(topic) == 0) {
                        do {
                            info = br.readLine();
                            if (info != null) System.out.println(info);
                        } while ((info != null) && info.compareTo("") != 0);
                        return true;
                    }
                }
            } while (ch != 1);

        } catch (IOException e) {
            System.out.println("Error accessing help file.");
            return false;
        }

        return false;
    }

    String getSelection() {
        String topic = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter topic: ");
        try {
            topic = br.readLine();
        } catch (IOException e) {
            System.out.println("Error reading console.");
        }

        return topic;
    }
}
