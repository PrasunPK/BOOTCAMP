package storage;

public class BallColorIsFullException extends Throwable{
    public BallColorIsFullException() {
        super("This color of ball is full");
    }
}
