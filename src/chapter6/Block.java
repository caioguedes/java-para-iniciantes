package chapter6;

public class Block {

    public int a, b, c;
    public int volume;

    public Block(int i, int j, int k) {
        this.a = i;
        this.b = j;
        this.c = k;
        volume = this.a * this.b * this.c;
    }

    public boolean sameBlock(Block ob) {
        if ((ob.a == this.a) & (ob.b == this.b) & (ob.c == this.c)) {
            return true;
        }

        return false;
    }

    public boolean sameVolume(Block ob) {
        if (ob.volume == this.volume) {
            return true;
        }

        return false;
    }
}
