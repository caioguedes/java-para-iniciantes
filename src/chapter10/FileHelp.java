package chapter10;

public class FileHelp {
    public static void main(String[] args) {
        Help help = new Help("filehelp.txt");
        String topic;

        System.out.println("Try the help system. Enter 'stop' to quit.");
        do {
            topic = help.getSelection();
            if (!help.helpOn(topic)) {
                System.out.println("Topic not found.\n");
            }
        } while (topic.compareTo("stop") != 0);
    }
}
