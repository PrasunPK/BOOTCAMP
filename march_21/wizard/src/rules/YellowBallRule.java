package rules;

import ball.Ball;
import ball.Balls;
import color.Color;
import exceptions.GreenBallFullException;

public class YellowBallRule implements Rule {
    @Override
    public boolean canBeAdded(Balls balls, Ball ballToAdd) throws GreenBallFullException, RedBallFullException {
        if(ballToAdd.isOfColor(Color.YELLOW)){

        }
        return true;
    }
}
