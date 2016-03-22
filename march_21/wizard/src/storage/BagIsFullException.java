package storage;

public class BagIsFullException extends Throwable {
    public BagIsFullException() {
        super("Bag is full");
    }
}
