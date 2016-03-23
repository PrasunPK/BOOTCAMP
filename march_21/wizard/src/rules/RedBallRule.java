package rules;

import ball.Ball;
import ball.Balls;
import color.Color;
import exceptions.GreenBallFullException;

public class RedBallRule implements Rule {
    @Override
    public boolean canBeAdded(Balls balls, Ball ballToAdd) throws GreenBallFullException, RedBallFullException {
        if (ballToAdd.isOfColor(Color.RED)) {
            if (balls.numberOfBalls(Color.RED) < (balls.numberOfBalls(Color.GREEN) * 2) - 1)
                return true;
            throw new RedBallFullException();
        }
        return true;
    }
}
