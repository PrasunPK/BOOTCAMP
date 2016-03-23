package rules;

import ball.Ball;
import ball.Balls;
import color.Color;
import exceptions.GreenBallFullException;

public class GreenBallRule implements Rule {
    private final int MAX_NUMBER_OF_BALLS = 3;
    @Override
    public boolean canBeAdded(Balls balls, Ball ballToAdd) throws GreenBallFullException {
        if(ballToAdd.isOfColor(Color.GREEN)) {
            if (balls.numberOfBalls(Color.GREEN) < MAX_NUMBER_OF_BALLS)
                return true;
            throw new GreenBallFullException();
        }
        return true;
    }
}
