package rules;

import ball.Ball;
import ball.Balls;
import exceptions.GreenBallFullException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class GreenBallRuleTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void returns_true_when_green_ball_is_added() throws GreenBallFullException {
        GreenBallRule greenRule = new GreenBallRule();

        Balls balls = new Balls();
        assertEquals(true, greenRule.canBeAdded(balls, Ball.createGreenBall()));
    }

    @Test
    public void can_not_add_more_than_three_green_balls() throws GreenBallFullException {
        GreenBallRule greenRule = new GreenBallRule();

        Balls balls = new Balls();
        balls.add(Ball.createGreenBall());
        balls.add(Ball.createGreenBall());
        balls.add(Ball.createGreenBall());

        thrown.expect(GreenBallFullException.class);
        greenRule.canBeAdded(balls, Ball.createGreenBall());
    }
}