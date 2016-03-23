package rules;

import ball.Ball;
import ball.Balls;
import exceptions.GreenBallFullException;

public interface Rule {
    boolean canBeAdded(Balls balls, Ball ballToAdd) throws GreenBallFullException, RedBallFullException;
}
