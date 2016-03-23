package rules;

public class RedBallFullException extends Throwable {
    public RedBallFullException() {
        super("Can not add more red balls");
    }
}
