public class InvalidProbabilityException extends Throwable {
    public InvalidProbabilityException() {
        super("Probability value must be between 0 and 1");
    }
}