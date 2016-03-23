package rules;

import ball.Ball;
import ball.Balls;
import color.Color;
import exceptions.GreenBallFullException;
import exceptions.YellowBallException;

public class YellowBallRule implements Rule {
    @Override
    public boolean canBeAdded(Balls balls, Ball ballToAdd) throws GreenBallFullException, RedBallFullException, YellowBallException {
        if (ballToAdd.isOfColor(Color.YELLOW)) {
            int totalBalls = balls.numberOfBalls(Color.BLUE) + balls.numberOfBalls(Color.GREEN) + balls.numberOfBalls(Color.RED);
            if (balls.numberOfBalls(Color.YELLOW) < (totalBalls * 0.4)) {
                return true;
            }
            throw new YellowBallException();
        }
        return true;
    }
}
