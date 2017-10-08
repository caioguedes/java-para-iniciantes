package chapter13;

public class Pair<T, V extends T> {
    T first;
    V secound;

    Pair(T a, V b) {
        first = a;
        secound = b;
    }
}
