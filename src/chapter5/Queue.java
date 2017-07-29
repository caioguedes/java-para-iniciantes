package chapter5;

public class Queue {
    private char[] q;
    private int putloc, getloc;

    public Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    public void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }

        q[putloc++] = ch;
    }

    public char get() {
        if (getloc == putloc) {
            System.out.print(" - Queue is empty.");
            return (char) 0;
        }

        return q[getloc++];
    }
}
