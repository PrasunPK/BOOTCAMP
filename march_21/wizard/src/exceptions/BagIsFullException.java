package exceptions;

public class BagIsFullException extends Throwable {
    public BagIsFullException() {
        super("Bag is full, can not add more balls");
    }
}
