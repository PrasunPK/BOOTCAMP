package rules;

import ball.Ball;
import ball.Balls;
import exceptions.GreenBallFullException;
import exceptions.YellowBallException;

public interface Rule {
    boolean canBeAdded(Balls balls, Ball ballToAdd) throws GreenBallFullException, RedBallFullException, YellowBallException;
}
