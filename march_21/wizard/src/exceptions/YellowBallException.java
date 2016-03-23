package exceptions;

public class YellowBallException extends Throwable {
    public YellowBallException() {
        super("Can not add more yellow balls");
    }
}
