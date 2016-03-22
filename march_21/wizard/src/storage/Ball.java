package storage;

public class Ball {
    private BallColor color;

    public Ball(BallColor color) {
        this.color = color;
    }

    public boolean isOfColor(BallColor color) {
        return this.color.equals(color);
    }
}
