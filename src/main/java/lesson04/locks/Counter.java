package lesson04.locks;

public class Counter {
    private int value;
    public synchronized int increment() {
        value++;
        return value;
    }
}