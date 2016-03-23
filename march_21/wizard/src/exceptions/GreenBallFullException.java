package exceptions;

public class GreenBallFullException extends Throwable{
    public GreenBallFullException() {
        super("Can not add more than three green balls");
    }
}
