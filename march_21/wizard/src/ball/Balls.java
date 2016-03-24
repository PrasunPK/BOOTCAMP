package ball;

import color.Color;

import java.util.ArrayList;

public class Balls{

    private final ArrayList<Ball> balls;

    public Balls() {
        this.balls = new ArrayList<>();
    }

    public int size(){
        return this.balls.size();
    }

    public int numberOfBalls(Color color) {
        int count = 0;
        for (Ball ball: balls) {
            if(ball.isOfColor(color))
                count++;
        }
        return count;
    }

    public boolean add(Ball ball) {
        return balls.add(ball);
    }

    public ArrayList<String> createColorSummary() {
        ArrayList<String> colors = new ArrayList<>();
        for (Ball ball : balls)
            ball.addColor(colors);
        return colors;
    }
}
