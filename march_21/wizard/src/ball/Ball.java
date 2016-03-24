package ball;

import color.Color;

import java.util.ArrayList;

public class Ball {
    private Color color;

    private Ball(Color color) {
        this.color = color;
    }

    public static Ball createGreenBall() {
        return new Ball(Color.GREEN);
    }

    public boolean isOfColor(Color color) {
        return this.color.equals(color);
    }

    public static Ball createRedBall() {
        return new Ball(Color.RED);
    }

    public static Ball createYellowBall() {
        return new Ball(Color.YELLOW);
    }

    public static Ball createBlueBall() {
        return new Ball(Color.BLUE);
    }

    public boolean addColor(ArrayList<String> colors) {
        return colors.add(this.color.name());
    }
}
